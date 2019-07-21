import javax.swing.JTextPane;
import javax.swing.JFrame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
/*
<APPLET
CODE=windowlistenapp.class
WIDTH=500
HEIGHT=200 >
</APPLET>
*/
public class windowlistenapp extends WindowAdapter {

    public windowlistenapp() {
        JFrame frm = new JFrame("First JTextPane Example");
        frm.getContentPane().setLayout(new BorderLayout());

        JTextPane textpane = new JTextPane();
        Font fnt = new Font("Serif", Font.ITALIC, 20);
        textpane.setFont(fnt);
        textpane.setForeground(Color.blue);
        frm.getContentPane().add(textpane, BorderLayout.CENTER);

        frm.addWindowListener(this);
        frm.setSize(400, 400);
        frm.show();
    }

    public void windowClosing(WindowEvent evt) {
        System.exit(0);
    }

    public static void main(String[] args) {
        windowlistenapp instance = new windowlistenapp();
    }

}
