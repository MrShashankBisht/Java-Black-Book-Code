import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=list.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class list_item extends Applet implements ItemListener,  
ActionListener 
{
TextField text1, text2;
List list1;
Button button1;
public void init()
{
text1 = new TextField(20);
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
list1.addItemListener(this);
button1.addActionListener(this);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getItemSelectable() == list1){
text1.setText("You chose " +
((List)e.getItemSelectable()).getSelectedItem());
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == button1)
{
ItemListener[] al = list1.getItemListeners();
for (int i=0; i<al.length; i++)
{ 
list1.removeItemListener(al[i]);
text2.setText("Listener of choice Removed");
}
}
}
}
