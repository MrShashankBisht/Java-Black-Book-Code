import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*
<APPLET
CODE=card.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
class cardPanel extends Panel
{
Button button;
Label label;
cardPanel(card applet, String cardnumber)
{
button = new Button("Next card");
button.addActionListener(applet);
add(button);
label = new Label("This is card " + cardnumber);
add(label);
}
}
public class card extends Applet implements ActionListener {
int index = 1;
CardLayout cardlayout;
cardPanel panel1, panel2, panel3;
public void init() {
cardlayout = new CardLayout();
setLayout(cardlayout);
panel1 = new cardPanel(this, "one");
panel2 = new cardPanel(this, "two");
panel3 = new cardPanel(this, "three");
add("first", panel1);
add("second", panel2);
add("third", panel3);
cardlayout.show(this, "first");
}
public void actionPerformed(ActionEvent event) {
switch(++index){
case 1:
cardlayout.show(this, "first");
break;
case 2:
cardlayout.show(this, "second");
break;
case 3:
cardlayout.show(this, "third");
break;
}
if(index == 3) index = 0;
repaint();
}
}
