import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class appicons extends JFrame {
  public static void main(String[] args) {
    new appicons();
  }

  private Icon OpenIcon = new ImageIcon("images/Circle_1.gif");
  private Icon ClosedIcon = new ImageIcon("images/Circle_2.gif");
  private Icon LeafIcon = new ImageIcon("images/Circle_3.gif");
  public appicons() {
    super("JTree Selections");
    //WindowUtilities.setNativeLookAndFeel();
   // addWindowListener(new ExitListener());
    Container con = getContentPane();
    con.setLayout(new FlowLayout());
    DefaultMutableTreeNode rootnode =
      new DefaultMutableTreeNode("Root");
    DefaultMutableTreeNode childnode = null;
    DefaultMutableTreeNode grandChildnode = null;
    for(int childIndex=1; childIndex<4; childIndex++) {
     DefaultMutableTreeNode child = new DefaultMutableTreeNode("Child " + childIndex);
      rootnode.add(childnode);
      for(int grandChildIndex=1; grandChildIndex<4; grandChildIndex++) {
        grandChildnode =
          new DefaultMutableTreeNode("Grandchild " + childIndex +
                                     "." + grandChildIndex);
        childnode.add(grandChildnode);
      }
    }

    JTree treenode = new JTree(rootnode);
    treenode.expandRow(1); 
    JScrollPane pn1 = new JScrollPane(treenode);
    pn1.setBorder(BorderFactory.createTitledBorder("Standard Icons"));
    con.add(pn1);

    JTree treenode2 = new JTree(rootnode);
    treenode2.expandRow(2); 
    DefaultTreeCellRenderer renderer2 = new DefaultTreeCellRenderer();
    renderer2.setOpenIcon(null);
    renderer2.setClosedIcon(null);
    renderer2.setLeafIcon(null);
    treenode2.setCellRenderer(renderer2);
    JScrollPane pn2 = new JScrollPane(treenode2);
    pn2.setBorder(BorderFactory.createTitledBorder("No Icons"));
    con.add(pn2);

    JTree treenode3 = new JTree(rootnode);
    treenode3.expandRow(3);
    DefaultTreeCellRenderer renderer3 = new DefaultTreeCellRenderer();
    renderer3.setOpenIcon(OpenIcon);
    renderer3.setClosedIcon(ClosedIcon);
    renderer3.setLeafIcon(LeafIcon);
    treenode3.setCellRenderer(renderer3);
    JScrollPane pn3 = new JScrollPane(treenode3);
    pn3.setBorder(BorderFactory.createTitledBorder("Custom Icons"));
    con.add(pn3);

    pack();
    setVisible(true);
  }
}
