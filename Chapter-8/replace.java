import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<APPLET
    CODE=replace.class
    WIDTH=200
    HEIGHT=200 >
</APPLET>
*/

public class replace extends Applet implements ActionListener 
{
    TextArea textarea1;
    Button button1;

    public void init()
    {
        textarea1 = new TextArea("Now is the time.", 5, 20,
            TextArea.SCROLLBARS_BOTH);
        add(textarea1);
        button1 = new Button("Replace selected text");
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == button1){
            textarea1.replaceRange("Hello from Java!", 
                textarea1.getSelectionStart(), 
                textarea1.getSelectionEnd()) ;
        }
    }
}
