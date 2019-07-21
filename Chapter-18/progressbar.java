import java.awt.*;
import javax.swing.*;
/*
<APPLET
CODE = progressbar.class
WIDTH = 500
HEIGHT = 200 >
</APPLET>
*/
public class progressbar extends JApplet
{
JProgressBar jprogressbar1, jprogressbar2, jprogressbar3,
jprogressbar4, jprogressbar5, jprogressbar6;
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
jprogressbar1 = new JProgressBar();
jprogressbar1.setValue(50);
contentPane.add(jprogressbar1);
jprogressbar2 = new JProgressBar();
jprogressbar2.setMinimum(100);
jprogressbar2.setMaximum(200);
jprogressbar2.setValue(180);
jprogressbar2.setForeground(Color.red);
contentPane.add(jprogressbar2);
jprogressbar3 = new JProgressBar();
jprogressbar3.setOrientation(JProgressBar.VERTICAL);
jprogressbar3.setForeground(Color.blue);
jprogressbar3.setValue(50);
jprogressbar3.setStringPainted(true);
jprogressbar3.setBorder(BorderFactory.createRaisedBevelBorder());
contentPane.add(jprogressbar3);
jprogressbar4 = new JProgressBar();
jprogressbar4.setOrientation(JProgressBar.VERTICAL);
jprogressbar4.setForeground(Color.red);
jprogressbar4.setValue(80);
jprogressbar4.setStringPainted(true);
jprogressbar4.setBorderPainted(false);
contentPane.add(jprogressbar4);
jprogressbar5 = new JProgressBar();
jprogressbar5.setOrientation(JProgressBar.VERTICAL);
jprogressbar5.setStringPainted(true);
jprogressbar5.setString("Hello from Swing!");
jprogressbar5.setValue(90);
contentPane.add(jprogressbar5);
}
}
