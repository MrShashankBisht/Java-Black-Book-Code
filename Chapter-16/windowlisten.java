import java.awt.TextArea;
import java.awt.Frame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
/*
<APPLET
CODE=windowlisten.class
WIDTH=500
HEIGHT=200 >
</APPLET>
*/
public class windowlisten extends WindowAdapter {

    public windowlisten() {
        Frame frm = new Frame("TextArea Example");
        frm.setLayout(new BorderLayout());

        TextArea texta = new TextArea();
        Font fnt = new Font("Serif", Font.ITALIC, 20);
        texta.setFont(fnt);
        texta.setForeground(Color.blue);
        frm.add(texta, BorderLayout.CENTER);

        frm.addWindowListener(this);
        frm.setSize(400, 400);
        frm.show();
    }

    public void windowClosing(WindowEvent evt) {
        System.exit(0);
    }

    public static void main(String[] args) {
        windowlisten instance = new windowlisten();
    }

}
