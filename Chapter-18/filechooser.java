import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
public class filechooser extends JFrame implements ActionListener
{
JFileChooser chooser = new JFileChooser();
JButton jbutton = new JButton("Display file chooser");
JTextField jtextfield = new JTextField(30);
public filechooser()
{
super();
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton);
contentPane.add(jtextfield);
jbutton.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
int result = chooser.showOpenDialog(null);
File fileobj = chooser.getSelectedFile();
if(result == JFileChooser.APPROVE_OPTION) {
jtextfield.setText("You chose " + fileobj.getPath());
} else if(result == JFileChooser.CANCEL_OPTION) {
jtextfield.setText("You clicked Cancel");
}
}
public static void main(String args[])
{
JFrame f = new filechooser();
f.setBounds(200, 200, 400, 200);
f.setVisible(true);
f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
}
