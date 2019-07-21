import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
/*
<APPLET
CODE = progressbarevents.class
WIDTH = 400
HEIGHT = 200 >
</APPLET>
*/
public class progressbarevents extends JApplet
{
JProgressBar jprogressbar = new JProgressBar();
JButton jbutton = new JButton("Increment the progress bar");
public void init()
{
Container contentPane = getContentPane();


contentPane.setLayout(new FlowLayout());
contentPane.add(jbutton);
jprogressbar.setForeground(Color.blue);
contentPane.add(jprogressbar);
jbutton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
jprogressbar.setValue(jprogressbar.getValue() + 10);
}
});
jprogressbar.addChangeListener(new ChangeListener() {
public void stateChanged(ChangeEvent e)
{
showStatus("Progress bar minimum: " +
jprogressbar.getMinimum()
+ " maximum: " + jprogressbar.getMaximum() +
" value: " + jprogressbar.getValue());
}
});
}
}
