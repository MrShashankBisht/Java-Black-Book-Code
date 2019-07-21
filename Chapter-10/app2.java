import java.awt.*;
import java.awt.event.*;
public class app2
{
public static void main(String [] args)
{
dialogframe f = new dialogframe("Dialogs");
f.setSize(200, 200);
f.addWindowListener(new WindowAdapter() { public void
windowClosing(WindowEvent e) {System.exit(0);}});
f.setVisible(true);
}
}
class dialogframe extends Frame implements ActionListener
{
Menu Menu1;
MenuBar Menubar1;
MenuItem menuitem1, menuitem2;
Label label;
FileDialog dialog, updia;
Dialog dia;
dialogframe(String title)
{
super(title);
dia = new Dialog(this, "UpLoad File", false, null); 
label = new Label("Hello from Java!");
setLayout(new GridLayout(1, 1));
add(label);
Menubar1 = new MenuBar();
Menu1 = new Menu("File");
menuitem1 = new MenuItem("Open file...");
menuitem2 = new MenuItem("UpLoad file...");
Menu1.add(menuitem1);
Menu1.add(menuitem2);
menuitem1.addActionListener(this);
menuitem2.addActionListener(this);
Menubar1.add(Menu1);
setMenuBar(Menubar1);
dialog = new FileDialog(this, "File Dialog");
updia = new FileDialog(dia, "Upload File");
}
public void actionPerformed(ActionEvent event){
if(event.getSource() == menuitem1){
dialog.setVisible(true);
label.setText("You chose " + dialog.getFile());
}
if(event.getSource() == menuitem2){
updia.setVisible(true);
}
}
}
