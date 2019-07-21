import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class app extends DefaultMutableTreeNode {
  private boolean ChildrenDefined = false;
  private int outline_num;
  private int nChildren;

  public app(int outline_num, int nChildren) {
    this.outline_num = outline_num;
    this.nChildren = nChildren;
  }
        public boolean isLeaf() {
    return(false);
  }

  public int getChildCount() {
    if (!ChildrenDefined)
      defineChild();
    return(super.getChildCount());
  }

  private void defineChild() {
    ChildrenDefined = true;
    for(int i=0; i<nChildren; i++)
      add(new app(i+1, nChildren));
  }

  public String toString() {
    TreeNode parent = getParent();
    if (parent == null)
      return(String.valueOf(outline_num));
    else
      return(parent.toString() + "." + outline_num);
  }
}
