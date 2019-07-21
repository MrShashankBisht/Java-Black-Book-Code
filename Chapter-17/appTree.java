import java.awt.*;
import javax.swing.*;

public class appTree extends JFrame {
	int n = 5;
  public static void main(String[] args) {
    int i = 5;
    if (args.length > 0)
      try {
        i = Integer.parseInt(args[0]);
      } catch(NumberFormatException nfe) {
        System.out.println("Can't parse number; using default of " + i);
      }
    new appTree(i);
  }
 
  public appTree(int i) {
    super("Creating a Dynamic JTree");
  //WindowUtilities.setNativeLookAndFeel();
 // addWindowListener(new ExitListener());
    Container con = getContentPane();
    JTree tree = new JTree(new app(1, n));
    con.add(new JScrollPane(tree), BorderLayout.CENTER);
    setSize(300, 475);
    setVisible(true);
  }
}
