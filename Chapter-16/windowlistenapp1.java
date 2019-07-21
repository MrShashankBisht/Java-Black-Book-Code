import javax.swing.JTextPane;
import javax.swing.JFrame;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyleConstants;
import javax.swing.text.MutableAttributeSet;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
/*
<APPLET
CODE=windowlistenapp1.class
WIDTH=500
HEIGHT=200 >
</APPLET>
*/

public class windowlistenapp1 extends WindowAdapter {

    public windowlistenapp1() {
        JFrame frm = new JFrame("Second JTextPane Example");
        frm.getContentPane().setLayout(new BorderLayout());

        JTextPane jtextpane = new JTextPane();
        Font fnt = new Font("Serif", Font.ITALIC, 20);
        setJTextPaneFont(jtextpane, fnt, Color.blue);
        frm.getContentPane().add(jtextpane, BorderLayout.CENTER);

        frm.addWindowListener(this);
        frm.setSize(400, 400);
        frm.show();
    }


    public static void setJTextPaneFont(JTextPane jtp, Font font, Color c) {
        MutableAttributeSet attrs = jtp.getInputAttributes();


        StyleConstants.setFontFamily(attrs, font.getFamily());
        StyleConstants.setFontSize(attrs, font.getSize());
        StyleConstants.setItalic(attrs, (font.getStyle() & Font.ITALIC) != 0);
        StyleConstants.setBold(attrs, (font.getStyle() & Font.BOLD) != 0);

       
        StyleConstants.setForeground(attrs, c);

        StyledDocument doc = jtp.getStyledDocument();

        doc.setCharacterAttributes(0, doc.getLength() + 1, attrs, false);
    }

    public void windowClosing(WindowEvent evt) {
        System.exit(0);
    }

    public static void main(String[] args) {
        windowlistenapp1 instance = new windowlistenapp1();
    }

}
