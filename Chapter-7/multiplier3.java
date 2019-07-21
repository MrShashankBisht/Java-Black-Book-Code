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
public class multiplier3 extends Applet implements ActionListener {
TextField text1, text2, answertext;
Label multiplylabel;
Button button1;
GridLayout g;
public void init() {
g = new GridLayout(5, 1);
g.setVgap(10);
setLayout(g);
text1 = new TextField(10);
add(text1);
multiplylabel = new Label("*", Label.CENTER);
add(multiplylabel);
text2 = new TextField(10);
add(text2);
button1 = new Button("=");
add(button1);
button1.addActionListener(this);
answertext = new TextField(10);
add(answertext);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource() == button1){
int product = Integer.parseInt(text1.getText()) *
Integer.parseInt(text2.getText());
answertext.setText(String.valueOf(product));
}
}
}
