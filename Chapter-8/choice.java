import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=choice.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class choice extends Applet implements ItemListener, ActionListener {
TextField text1, text2;
Choice choice1;
Button button1;
public void init()
{
text1 = new TextField(20);
text2 = new TextField(20);
button1 = new Button("Remove Listeners");
add(text1);
add(text2);
choice1 = new Choice();
choice1.add("Item 1");
choice1.add("Item 2");
choice1.add("Item 3");
choice1.add("Item 4");
choice1.add("Item 5");
choice1.add("Item 6");
choice1.add("Item 7");
choice1.add("Item 8");
choice1.add("Item 9");
choice1.add("Item 10");
choice1.add("Item 11");
choice1.add("Item 12");
add(choice1);
add(button1);
choice1.addItemListener(this);
button1.addActionListener(this);
}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItemSelectable() == choice1){
			text1.setText("You chose " +
			((Choice)e.getItemSelectable()).getSelectedItem());
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button1)
		{
			ItemListener[] al = choice1.getItemListeners();
			for (int i=0; i<al.length; i++)
			{ 
				choice1.removeItemListener(al[i]);
				text2.setText("Listener Removed");
			}
		}
	}
}

