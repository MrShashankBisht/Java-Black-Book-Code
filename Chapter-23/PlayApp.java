import java.io.*;
import javax.sound.midi.*;

public class PlayApp {
    public static final int DAMPER_PEDAL = 64;
    public static final int DAMPER_ON = 127;
    public static final int DAMPER_OFF = 0;
    public static final int END_OF_TRACK = 47;


    public static void main(String[] args)
        throws MidiUnavailableException, InvalidMidiDataException, IOException
    {
        int instrument = 0;
        int sound_tempo = 120;
        String file = null;

        int a = 0; 
        while(a < args.length) {
            if (args[a].equals("-i")) {
                instrument = Integer.parseInt(args[a+1]);
                a+=2;
            }
            else if (args[a].equals("-t")) {
                sound_tempo = Integer.parseInt(args[a+1]);
                a+=2;
            }
            else if (args[a].equals("-o")) {
                file = args[a+1];
                a += 2;
            }
            else break;
        }

        char[  ] music_notes = args[a].toCharArray( );

        Sequence seqe = new Sequence(Sequence.PPQ, 16);

       addTrack(seqe, instrument, sound_tempo, music_notes);

        if (file == null) {  
            Sequencer sepr = MidiSystem.getSequencer( );
            sepr.open( );  
            Synthesizer synthr = MidiSystem.getSynthesizer( );
            synthr.open( );
            sepr.getTransmitter( ).setReceiver(synthr.getReceiver( ));

            sepr.setSequence(seqe);
            sepr.setTempoInBPM(sound_tempo);

            sepr.addMetaEventListener(new MetaEventListener( ) {
                    public void meta(MetaMessage m) {
              if (m.getType( ) == END_OF_TRACK) System.exit(0);
                    }
                });
            sepr.start( );
        }
        else {  
        int[  ] allowedTypes = MidiSystem.getMidiFileTypes(seqe);
            if (allowedTypes.length == 0) {
                System.err.println("No supported MIDI file types.");
            }
            else {
                MidiSystem.write(seqe, allowedTypes[0],
                                 new File(file));
                System.exit(0);
            }
        }
    }

    static final int[  ] offsets = {  
			// A   B  C  D  E  F  G
          		-4, -2, 0, 1, 3, 5, 7  
    };

   public static void addTrack(Sequence s, int instrument, int sound_tempo,
                                char[  ] music_notes)
        throws InvalidMidiDataException
    {
        Track track = s.createTrack( );  

        ShortMessage sm = new ShortMessage( );
        sm.setMessage(ShortMessage.PROGRAM_CHANGE, 0, instrument, 0);
        track.add(new MidiEvent(sm, 0));

        int n = 0;
        int t = 0;
        int notelength = 16; 
        int velocity = 64;   
        int basekey = 60;    
        boolean sustain = false; 
        int numnotes = 0;   

        while(n < music_notes.length) {
            char c = music_notes[n++];

            if (c == '+') basekey += 12;        
            else if (c == '-') basekey -= 12;   
            else if (c == '>') velocity += 16;  
            else if (c == '<') velocity -= 16;  // decrease volume;
            else if (c == '/') {
            char d = music_notes[n++];
            if (d == '2') notelength = 32;  
            else if (d == '4') notelength = 16;  
            else if (d == '8') notelength = 8;   
            else if (d == '3' && music_notes[n++] == '2') notelength = 2;
            else if (d == '6' && music_notes[n++] == '4') notelength = 1;
                else if (d == '1') {
                    if (n < music_notes.length && music_notes[n] == '6')
                        notelength = 4;    
                    else notelength = 64;  
                }
            }
            else if (c == 's') {
                sustain = !sustain;
                ShortMessage m = new ShortMessage( );
                m.setMessage(ShortMessage.CONTROL_CHANGE, 0,
                DAMPER_PEDAL, sustain?DAMPER_ON:DAMPER_OFF);
                track.add(new MidiEvent(m, t));
            }
            else if (c >= 'A' && c <= 'G') {
                int key = basekey + offsets[c - 'A'];
                if (n < music_notes.length) {
                    if (music_notes[n] == 'b') { 
                        key--; 
                        n++;
                    }
                    else if (music_notes[n] == '#') { 
                        key++;
                        n++;
                    }
                }

                addNote(track, t, notelength, key, velocity);
                numnotes++;
            }
            else if (c == ' ') {
                if (numnotes > 0) {
                    t += notelength;
                    numnotes = 0;
                }
            }
            else if (c == '.') { 
                if (numnotes > 0) {
                    t += notelength;
                    numnotes = 0;
                }
                t += notelength;
            }
        }
    }
        
    public static void addNote(Track track, int startTick,
                               int tickLength, int key, int velocity)
        throws InvalidMidiDataException
    {
        ShortMessage on = new ShortMessage( );
        on.setMessage(ShortMessage.NOTE_ON,  0, key, velocity);
        ShortMessage off = new ShortMessage( );
        off.setMessage(ShortMessage.NOTE_OFF, 0, key, velocity);
        track.add(new MidiEvent(on, startTick));
        track.add(new MidiEvent(off, startTick + tickLength));
    }
}
