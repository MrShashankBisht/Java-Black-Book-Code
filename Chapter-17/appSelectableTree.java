import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class appSelectableTree extends JFrame
                            implements TreeSelectionListener {
  public static void main(String[] args) {
    new appSelectableTree();
  }

  private JTree tree;
  private JTextField currentSelection;
	private JTextField currentSelectionField;
  
  public appSelectableTree() {
    super("JTree Selections");
  //  WindowUtilities.setNativeLookAndFeel();
   // addWindowListener(new ExitListener());
    Container con = getContentPane();
    DefaultMutableTreeNode rootnode =
      new DefaultMutableTreeNode("Root");
    DefaultMutableTreeNode childnode;
    DefaultMutableTreeNode grandChildnode;
    for(int childIndex=1; childIndex<4; childIndex++) {
      childnode = new DefaultMutableTreeNode("Child " + childIndex);
      rootnode.add(childnode);
      for(int grandChildIndex=1; grandChildIndex<4; grandChildIndex++) {
        grandChildnode =
          new DefaultMutableTreeNode("Grandchild " + childIndex +
                                     "." + grandChildIndex);
        childnode.add(grandChildnode);
      }
    }
    tree = new JTree(rootnode);
    tree.addTreeSelectionListener(this);
    con.add(new JScrollPane(tree), BorderLayout.CENTER);
    currentSelectionField = new JTextField("Current Selection: NONE");
    con.add(currentSelectionField, BorderLayout.SOUTH);
    setSize(250, 275);
    setVisible(true);
  }

  public void valueChanged(TreeSelectionEvent event) {
    currentSelection.setText
      ("Current Selection: " +
       tree.getLastSelectedPathComponent().toString());
  }
}
