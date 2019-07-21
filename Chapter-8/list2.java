import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.ListSelectionEvent;
/*
<APPLET
CODE=list2.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class list2 extends Applet implements ActionListener 
{
TextArea text1;
TextField text2;
List list1;
Button button1;
public void init()
{
text1 = new TextArea(5,20);
text2 = new TextField(20);
button1 = new Button("Remove Listeners");
add(text1);
add(text2);
list1 = new List(4, true);
list1.add("Item 1");
list1.add("Item 2");
list1.add("Item 3");
list1.add("Item 4");
list1.add("Item 5");
list1.add("Item 6");
list1.add("Item 7");
list1.add("Item 8");
list1.add("Item 9");
add(list1);
add(button1);
list1.addActionListener(this);
button1.addActionListener(this);
}
public void valueChanged(ListSelectionEvent e)
{
if(e.getValueIsAdjusting()) 
return;
text1.setText("");
Object[] items = list1.getSelectedItems();
for(int i=0; i<items.length; i++)
text1.append(items[i] +"\n");
}
	    public void actionPerformed(ActionEvent e)
{
if(e.getSource() == button1)
{
ActionListener[] al = list1.getActionListeners();
for (int i=0; i<al.length; i++)
{ 
list1.removeActionListener(al[i]);
text2.setText("Listener of List Removed");
}
}	
}
} 

