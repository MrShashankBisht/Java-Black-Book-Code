import java.io.*;
import java.net.*;
import javax.sound.sampled.*;
import javax.sound.midi.*;

public class PlaySoundStream {
    public static void main(String[ ] args) throws Exception {
 
        if (args[0].equals("-m")) streamMidiSequence(new URL("http://free_midi.org"));
        else streamSampledAudio(new URL("http://209.68.63.220/19580222/rock/linkinpark/Crawling.mid"));

        System.exit(0);
    }

    public static void streamSampledAudio(URL url)
        throws IOException, UnsupportedAudioFileException,
               LineUnavailableException
    {
        AudioInputStream ain = null; 
        SourceDataLine line = null;   

        try {
            ain=AudioSystem.getAudioInputStream(url);

            AudioFormat format = ain.getFormat( );
            DataLine.Info info=new DataLine.Info(SourceDataLine.class,format);

            if (!AudioSystem.isLineSupported(info)) {
                AudioFormat pcm =
                new AudioFormat(format.getSampleRate( ), 16,
                    format.getChannels( ), true, false);

                 ain = AudioSystem.getAudioInputStream(pcm, ain);

                format = ain.getFormat( ); 
        info = new DataLine.Info(SourceDataLine.class, format);
            }

            line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(format);  

            int framesize = format.getFrameSize( );
            byte[  ] buffer = new byte[4 * 1024 * framesize]; 
            int numbytes = 0;                            

            boolean started = false;

            for(;;) {  
      int bytesread=ain.read(buffer,numbytes,buffer.length-numbytes);
                if (bytesread == -1) break;
                numbytes += bytesread;
                
                if (!started) {
                    line.start( );
                    started = true;
                }
                
                int bytestowrite = (numbytes/framesize)*framesize;
                
                line.write(buffer, 0, bytestowrite);
                
                int remaining = numbytes - bytestowrite;
                if (remaining > 0)
                    System.arraycopy(buffer,bytestowrite,buffer,0,remaining);
                numbytes = remaining;
            }

            line.drain( );
        }
        finally { 
            if (line != null) line.close( );
            if (ain != null) ain.close( );
        }
    }

    public static final int END_OF_TRACK = 47;

    public static void streamMidiSequence(URL url)
        throws IOException, InvalidMidiDataException, MidiUnavailableException
    {
        Sequencer sequencer=null;     
        Synthesizer synthesizer=null; 

        try {
            sequencer = MidiSystem.getSequencer( );
            sequencer.open( );  
            synthesizer = MidiSystem.getSynthesizer( );
            synthesizer.open( );
            sequencer.getTransmitter( ).setReceiver(synthesizer.getReceiver( ));

              sequencer.setSequence(url.openStream( ));  
            
              final Object lock = new Object( );

              sequencer.addMetaEventListener(new MetaEventListener( ) {
                    public void meta(MetaMessage e) {
                        if (e.getType( ) == END_OF_TRACK) {
                            synchronized(lock) { 
                                lock.notify( );
                            }
                        }
                    }
                });
            
              sequencer.start( );
            
              synchronized(lock) {
                while(sequencer.isRunning( )) {
                    try { lock.wait( ); } catch(InterruptedException e) {  }
                }
            }
        }
        finally {
              if (sequencer != null) sequencer.close( );
            if (synthesizer != null) synthesizer.close( );
        }
    }
}
