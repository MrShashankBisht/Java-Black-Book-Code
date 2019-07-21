import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=menu2.class
WIDTH=200
HEIGHT=200 >
</APPLET>
*/
public class menu2 extends Applet implements ActionListener
{
Button b1;
frame menuWindow;
public void init()
{
b1 = new Button("Display the menu window");
add(b1);
b1.addActionListener(this);
menuWindow = new frame("Menus");
menuWindow.setSize(200, 200);
}
public void actionPerformed(ActionEvent event)
{
if(event.getSource() == b1){
menuWindow.setVisible(true);
}
}
}
class frame extends Frame implements ActionListener, ItemListener
{
Menu menu, submenu;
MenuBar menubar;
Label label;
MenuItem menuitem1, menuitem2, menuitem4;
MenuItem subitem1, subitem2, subitem3;
CheckboxMenuItem menuitem3;
frame(String title)
{
super(title);
label = new Label("Hello from Java!");
setLayout(new GridLayout(1, 1));
add(label);
menubar = new MenuBar();
menu = new Menu("File");
menuitem1 = new MenuItem("Item 1");
menuitem1.addActionListener(this);
menu.add(menuitem1);
menuitem2 = new MenuItem("Item 2");
menuitem2.addActionListener(this);
menu.add(menuitem2);
menu.addSeparator();
menuitem3 = new CheckboxMenuItem("Check Item");
menuitem3.addItemListener(this);
menu.add(menuitem3);
menu.addSeparator();
submenu = new Menu("Sub menus");
subitem1 = new MenuItem("Sub item 1");
subitem2 = new MenuItem("Sub item 2");
subitem3 = new MenuItem("Sub item 3");
subitem1.addActionListener(this);
subitem2.addActionListener(this);
subitem3.addActionListener(this);
menuitem2.addActionListener(this);
menuitem2.addActionListener(this);
submenu.add(subitem1);
submenu.add(subitem2);
submenu.add(subitem3);
menu.add(submenu);
menu.addSeparator();
menuitem4 = new MenuItem("Exit");
menuitem4.addActionListener(this);
menu.add(menuitem4);
menubar.add(menu);
setMenuBar(menubar);
addWindowListener(new WindowAdapter() {public void
windowClosing(WindowEvent e) {setVisible(false);}});
}
public void actionPerformed(ActionEvent event)
{
if(event.getSource() == menuitem1){
label.setText("You chose item 1");
} else if(event.getSource() == menuitem2){
menuitem2.setEnabled(false);
label.setText("You chose item 2");
} else if(event.getSource() == subitem1){
label.setText("You chose sub item 1");
} else if(event.getSource() == subitem2){
label.setText("You chose sub item 2");
} else if(event.getSource() == subitem3){
label.setText("You chose sub item 3");
} else if(event.getSource() == menuitem4){
setVisible(false);
}
}
public void itemStateChanged (ItemEvent event)
{
if(event.getSource() == menuitem3){
if(((CheckboxMenuItem)event.getItemSelectable()).getState())
label.setText("Item 3 is checked");
else
label.setText("Item 3 is not checked");
}
}
}
