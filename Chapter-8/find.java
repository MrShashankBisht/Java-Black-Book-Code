import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<APPLET
    CODE=find.class
    WIDTH=200
    HEIGHT=200 >
</APPLET>
*/

public class find extends Applet implements ActionListener 
{
    TextArea textarea1;
    Button button1;

    public void init()
    {
        textarea1 = new TextArea("Now is the time.", 5, 20, TextArea.SCROLLBARS_BOTH);
        add(textarea1);
        button1 = new Button("Find \"time\"");
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == button1){
            String s = textarea1.getText();
            String s2 = new String("time");

            int location = s.indexOf(s2);
            textarea1.select(location, location + s2.length()) ;
        }
    }
}
