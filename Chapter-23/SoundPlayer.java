import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.sound.sampled.*;
import javax.sound.midi.*;


public class SoundPlayer extends JComponent {
    boolean midi;           
    Sequence sequence;       
    Sequencer sequencer;     
    Clip clip;               
    boolean playing = false; 
    int audioLength;         
    int audioPosition = 0;  

    JButton play;             
    JSlider progress;         
    JLabel time;          
    Timer timer;              

    public static void main(String[ ] args) 
        throws IOException,
               UnsupportedAudioFileException,
               LineUnavailableException,
               MidiUnavailableException,
               InvalidMidiDataException
    {
        SoundPlayer player;


        File file = new File("trippygaia1.mid");   
        boolean ismidi;
        try {
            MidiSystem.getMidiFileFormat(file);
            ismidi = true;
        }
        catch(InvalidMidiDataException e) {
            ismidi = false;
        }

        player = new SoundPlayer(file, ismidi);
        JFrame f = new JFrame("SoundPlayer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane( ).add(player, "Center");
        f.pack( );
        f.setVisible(true);
    }

    public SoundPlayer(File f, boolean isMidi)
        throws IOException,
               UnsupportedAudioFileException,
               LineUnavailableException,
               MidiUnavailableException,
               InvalidMidiDataException
    {
        if (isMidi) {     
            midi = true;
            sequencer = MidiSystem.getSequencer( );  
            sequencer.open( );                       

            Synthesizer synth = MidiSystem.getSynthesizer( );
            synth.open( );  
            
            Transmitter transmitter = sequencer.getTransmitter( );
            Receiver receiver = synth.getReceiver( );
            transmitter.setReceiver(receiver);
            
            sequence = MidiSystem.getSequence(f);
            sequencer.setSequence(sequence);
            audioLength = (int)sequence.getTickLength( ); 
        }
        else {            
           midi = false;
           AudioInputStream ain = AudioSystem.getAudioInputStream(f);
           try {
                DataLine.Info info =
                new DataLine.Info(Clip.class,ain.getFormat( ));
                clip = (Clip) AudioSystem.getLine(info);
                clip.open(ain);
            }
            finally { 
                ain.close( );
            }
            audioLength = (int)(clip.getMicrosecondLength( )/1000);
        }

        play = new JButton("Play");                
        progress = new JSlider(0, audioLength, 0); 
        time = new JLabel("0");                    

        play.addActionListener(new ActionListener( ) {
                public void actionPerformed(ActionEvent e) {
                    if (playing) stop( ); else play( );
                }
            });

        progress.addChangeListener(new ChangeListener( ) {
                public void stateChanged(ChangeEvent e) {
                    int value = progress.getValue( );
                    if (midi) time.setText(value + "");
                    else time.setText(value/1000 + "." +
                                      (value%1000)/100);
                    if (value != audioPosition) skip(value);
                }
            });
        
        timer = new javax.swing.Timer(100, new ActionListener( ) {
                public void actionPerformed(ActionEvent e) { tick( ); }
            });
        
        Box row = Box.createHorizontalBox( );
        row.add(play);
        row.add(progress);
        row.add(time);
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(row);

        if (midi) addMidiControls( );
        else addSampledControls( );
    }

    public void play( ) {
        if (midi) sequencer.start( );
        else clip.start( );
        timer.start( );
        play.setText("Stop");
        playing = true;
    }

    public void stop( ) {
        timer.stop( );
        if (midi) sequencer.stop( );
        else clip.stop( );
        play.setText("Play");
        playing = false;
    }

    public void reset( ) {
        stop( );
        if (midi) sequencer.setTickPosition(0);
        else clip.setMicrosecondPosition(0);
        audioPosition = 0; 
        progress.setValue(0);
    }

    public void skip(int position) { 
        if (position < 0 || position > audioLength) return;
        audioPosition = position;
        if (midi) sequencer.setTickPosition(position);
        else clip.setMicrosecondPosition(position * 1000);
        progress.setValue(position); 
    }

    public int getLength( ) { return audioLength; }

    void tick( ) {
        if (midi && sequencer.isRunning( )) {
            audioPosition = (int)sequencer.getTickPosition( );
            progress.setValue(audioPosition);
        }
        else if (!midi && clip.isActive( )) {
        audioPosition = (int)(clip.getMicrosecondPosition( )/1000);
        progress.setValue(audioPosition);
        }
        else reset( );  
    }

    void addSampledControls( ) {
        try {
            FloatControl gainControl =
                (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
           if (gainControl != null) this.add(createSlider(gainControl));
        }
        catch(IllegalArgumentException e) {
          }

        try {
              FloatControl panControl =
                (FloatControl)clip.getControl(FloatControl.Type.PAN);
            if (panControl != null) this.add(createSlider(panControl));
        }
        catch(IllegalArgumentException e) {  }
    }

    JSlider createSlider(final FloatControl c) {
        if (c == null) return null;
        final JSlider s = new JSlider(0, 1000);
        final float min = c.getMinimum( );
        final float max = c.getMaximum( );
        final float width = max-min;
        float fval = c.getValue( );
        s.setValue((int) ((fval-min)/width * 1000));

        java.util.Hashtable labels = new java.util.Hashtable(3);
        labels.put(new Integer(0), new JLabel(c.getMinLabel( )));
        labels.put(new Integer(500), new JLabel(c.getMidLabel( )));
        labels.put(new Integer(1000), new JLabel(c.getMaxLabel( )));
        s.setLabelTable(labels);
        s.setPaintLabels(true);

        s.setBorder(new TitledBorder(c.getType( ).toString( ) + " " +
                                     c.getUnits( )));

        s.addChangeListener(new ChangeListener( ) {
                public void stateChanged(ChangeEvent e) {
                    int i = s.getValue( );
                    float f = min + (i*width/1000.0f);
                    c.setValue(f);
                }
            });
        return s;
    }

    void addMidiControls( ) {
        final JSlider tempo = new JSlider(50, 200);
        tempo.setValue((int)(sequencer.getTempoFactor( )*100));
        tempo.setBorder(new TitledBorder("Tempo Adjustment (%)"));
        java.util.Hashtable labels = new java.util.Hashtable( );
        labels.put(new Integer(50), new JLabel("50%"));
        labels.put(new Integer(100), new JLabel("100%"));
        labels.put(new Integer(200), new JLabel("200%"));
        tempo.setLabelTable(labels);
        tempo.setPaintLabels(true);
        tempo.addChangeListener(new ChangeListener( ) {
                public void stateChanged(ChangeEvent e) {
                sequencer.setTempoFactor(tempo.getValue( )/100.0f);
                }
            });

        this.add(tempo);

        Track[  ] tracks = sequence.getTracks( );
        for(int i = 0; i < tracks.length; i++) {
            final int tracknum = i;
            final JCheckBox solo = new JCheckBox("solo");
            final JCheckBox mute = new JCheckBox("mute");
            solo.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                         sequencer.setTrackSolo(tracknum,solo.isSelected( ));
                    }
                });
            mute.addActionListener(new ActionListener( ) {
                    public void actionPerformed(ActionEvent e) {
                        sequencer.setTrackMute(tracknum,mute.isSelected( ));
                    }
                });

            Box box = Box.createHorizontalBox( );
            box.add(new JLabel("Track " + tracknum));
            box.add(Box.createHorizontalStrut(10));
            box.add(solo);
            box.add(Box.createHorizontalStrut(10));
            box.add(mute);
            box.add(Box.createHorizontalGlue( ));
            this.add(box);
        }
    }
}
