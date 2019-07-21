import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
<APPLET
CODE = box.class
WIDTH = 450
HEIGHT = 400 >
</APPLET>
*/
public class box extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
JPanel jpanel1 = new JPanel();
jpanel1.setBorder(
BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),
"Glue"));
jpanel1.setLayout(new BoxLayout(jpanel1, BoxLayout.X_AXIS));
jpanel1.add(Box.createGlue());
jpanel1.add(new JTextField("Text 1"));
jpanel1.add(Box.createGlue());
jpanel1.add(new JTextField("Text 2"));
jpanel1.add(Box.createGlue());
jpanel1.add(new JTextField("Text 3"));
jpanel1.add(Box.createGlue());
contentPane.add(jpanel1);
JPanel jpanel2 = new JPanel();
jpanel2.setBorder(
BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),
"Struts"));
jpanel2.setLayout(new BoxLayout(jpanel2, BoxLayout.X_AXIS));
jpanel2.add(new JTextField("Text 1"));
jpanel2.add(Box.createHorizontalStrut(20));
jpanel2.add(new JTextField("Text 2"));
jpanel2.add(Box.createHorizontalStrut(20));
jpanel2.add(new JTextField("Text 3"));
contentPane.add(jpanel2);
JPanel jpanel3 = new JPanel();
jpanel3.setBorder(
BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),
"Rigid"));
jpanel3.setLayout(new BoxLayout(jpanel3, BoxLayout.X_AXIS));
jpanel3.add(Box.createRigidArea(new Dimension(10, 40)));
jpanel3.add(new JTextField("Text 1"));
jpanel3.add(Box.createRigidArea(new Dimension(10, 40)));
jpanel3.add(new JTextField("Text 2"));
jpanel3.add(Box.createRigidArea(new Dimension(10, 40)));
jpanel3.add(new JTextField("Text 3"));
contentPane.add(jpanel3);
JPanel jpanel4 = new JPanel();
jpanel4.setBorder(
BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),
"Glue"));
jpanel4.setLayout(new BoxLayout(jpanel4, BoxLayout.Y_AXIS));
jpanel4.add(Box.createGlue());
jpanel4.add(new JTextField("Text 1"));
jpanel4.add(Box.createGlue());
jpanel4.add(new JTextField("Text 2"));
jpanel4.add(Box.createGlue());
jpanel4.add(new JTextField("Text 3"));
jpanel4.add(Box.createGlue());
contentPane.add(jpanel4);
JPanel jpanel5 = new JPanel();
jpanel5.setBorder(
BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),
"Struts"));
jpanel5.setLayout(new BoxLayout(jpanel5, BoxLayout.Y_AXIS));
jpanel5.add(new JTextField("Text 1"));
jpanel5.add(Box.createVerticalStrut(30));
jpanel5.add(new JTextField("Text 2"));
jpanel5.add(Box.createVerticalStrut(30));
jpanel5.add(new JTextField("Text 3"));
contentPane.add(jpanel5);
JPanel jpanel6 = new JPanel();
jpanel6.setBorder(
BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),
"Rigid"));
jpanel6.setLayout(new BoxLayout(jpanel6, BoxLayout.Y_AXIS));
jpanel6.add(Box.createRigidArea(new Dimension(40, 60)));
jpanel6.add(new JTextField("Text 1"));
jpanel6.add(Box.createRigidArea(new Dimension(40, 60)));
jpanel6.add(new JTextField("Text 2"));
jpanel6.add(Box.createRigidArea(new Dimension(40, 60)));
jpanel6.add(new JTextField("Text 3"));
contentPane.add(jpanel6);
}
}
