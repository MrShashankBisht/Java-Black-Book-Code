import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* <APPLET
CODE = filechooserfilter.class
WIDTH = 200
HEIGHT = 200 >
</APPLET>
*/
public class filechooserfilter extends JFrame implements ActionListener
{
JFileChooser jfilechooser = new JFileChooser();
JButton jbutton = new JButton("Display file chooser");
JTextField jtextfield = new JTextField(20);
public filechooserfilter()
{
super();
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton);
contentPane.add(jtextfield);
jbutton.addActionListener(this);
jfilechooser.addChoosableFileFilter(new filter1());
jfilechooser.addChoosableFileFilter(new filter2());
}
public void actionPerformed(ActionEvent e)
{
int result = jfilechooser.showOpenDialog(null);
if(result == JFileChooser.APPROVE_OPTION) {
jtextfield.setText("You selected " +
jfilechooser.getSelectedFile().getPath());
}
}
public static void main(String a[])
{
JFrame jframe = new filechooserfilter();
jframe.setBounds(200, 200, 300, 300);
jframe.setVisible(true);
jframe.setDefaultCloseOperation(
WindowConstants.DISPOSE_ON_CLOSE);
jframe.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
}
class filter1 extends javax.swing.filechooser.FileFilter
{
public boolean accept(File fileobj)
{
String extension = "";
if(fileobj.getPath().lastIndexOf('.') > 0)
extension = fileobj.getPath().substring(
fileobj.getPath().lastIndexOf('.')
+ 1).toLowerCase();
if(extension != "")
return extension.equals("gif");
else
return fileobj.isDirectory();
}
public String getDescription()
{
return "Gif Files (*.gif)";
}
}
class filter2 extends javax.swing.filechooser.FileFilter
{
public boolean accept(File fileobj)
{
String extension = "";
if(fileobj.getPath().lastIndexOf('.') > 0)
extension = fileobj.getPath().substring(
fileobj.getPath().lastIndexOf('.')
+ 1).toLowerCase();
if(extension != "")
return extension.equals("java");
else
return fileobj.isDirectory();
}
public String getDescription()
{
return "Java Files (*.java)";
}
}
