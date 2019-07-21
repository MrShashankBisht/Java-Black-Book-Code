import javax.swing.*;
import java.text.*;
import java.awt.*;
/*
<APPLET
CODE = TabsLayout.class
WIDTH = 400
HEIGHT = 200 >
</APPLET>
*/
public class TabsLayout {
  public static void main(String args[]) {
    String[] month = new DateFormatSymbols().getShortMonths();
    JTabbedPane pn = new JTabbedPane();
    pn.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    for (int i=0; i<12; i++) {
      JPanel tabpanel = new JPanel(new BorderLayout());
      JButton tabbutton = new JButton(month[i]);
      tabpanel.add(tabbutton);
      pn.add(month[i], tabpanel);
    }
    JFrame frm = new JFrame("Tabs");
    frm.getContentPane().add(pn, BorderLayout.CENTER);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setSize(300, 200);
    frm.show();
  }
}
