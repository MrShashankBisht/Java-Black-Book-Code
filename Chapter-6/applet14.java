
import java.awt.*;
import java.awt.event.*;
public class applet14 extends Frame implements ItemListener
{
	private Choice choice1;
    Label label1 = new Label("Make a choice");
    applet14()
    {
super("Sample Choice");
add(label1, BorderLayout.SOUTH);
choice1 = new Choice();
choice1.addItem("One");
choice1.addItem("Two");
choice1.addItem("Three");
choice1.addItemListener(this);
add(choice1, BorderLayout.CENTER);
pack();
setSize(170,getPreferredSize().height);
setLocation(25,25);
setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie)
    {
	String state = "Deselected";
if(ie.getStateChange() == ItemEvent.SELECTED)
state = "Selected";
label1.setText(ie.getItem() + " " + state );
}

public static void main(String args[]) { 
new applet14(); 
}
}
