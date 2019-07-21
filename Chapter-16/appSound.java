import java.awt.*;
import java.awt.event.*;
public class appSound extends java.applet.Applet implements ActionListener { 
    java.applet.AudioClip snd;
    public void init() {
        snd = getAudioClip( getClass().getResource(getParameter("sound")) );
        Button btn = new Button("Play Sound");
        btn.addActionListener( this );
        add ( btn );
    }
    public void actionPerformed( ActionEvent e ) {
        if ( snd != null )
            snd.play();
    }
}
