
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=multiplier2.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class multiplier2 extends Applet implements ActionListener {
TextField text1, text2, text3;
Label multiplylabel;
	Button button1;
public void init()
{
setLayout(new GridLayout(5, 1));
text1 = new TextField(10);
add(text1);
multiplylabel = new Label("*", Label.CENTER);
add(multiplylabel);
text2 = new TextField(10);
add(text2);
button1 = new Button("=");
add(button1);
button1.addActionListener(this);
text3 = new TextField(10);
add(text3);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == button1){
int product = Integer.parseInt(text1.getText()) *
Integer.parseInt(text2.getText());
text3.setText(String.valueOf(product));
}
}
}
