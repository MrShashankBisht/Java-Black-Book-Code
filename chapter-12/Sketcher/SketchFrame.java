import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.KeyStroke;
import javax.swing.Action;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.BorderLayout;
import java.io.File;
import java.awt.event.InputEvent.*;
import java.awt.AWTEvent.*;
import java.awt.Color.*;
import Constants.SketcherConstants.*;
public SketchFrame extends JFrame {
  public SketchFrame(String title, Sketcher theApp) {
    setTitle(title);     
    this.theApp = theApp; 
    setJMenuBar(menuBar); 
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    JMenu fileMenu = new JMenu("File");      
    JMenu elementMenu = new JMenu("Elements");
    fileMenu.setMnemonic('F');                
    elementMenu.setMnemonic('E');             
    newAction = new FileAction("New", KeyStroke.getKeyStroke('N', CTRL_DOWN_MASK),"Create new sketch");
    openAction = new FileAction("Open", KeyStroke.getKeyStroke('O', CTRL_DOWN_MASK),"Open existing sketch");
    closeAction = new FileAction("Close");
    saveAction = new FileAction("Save", KeyStroke.getKeyStroke('S', CTRL_DOWN_MASK), "Save sketch");
    saveAsAction = new FileAction("Save As...");
    printAction = new FileAction("Print", KeyStroke.getKeyStroke('P', CTRL_DOWN_MASK), "Print sketch");
    fileMenu.add(new JMenuItem(newAction));
    fileMenu.add(new JMenuItem(openAction));
    fileMenu.add(new JMenuItem(closeAction));
    fileMenu.addSeparator();                   
    fileMenu.add(new JMenuItem(saveAction));
    fileMenu.add(new JMenuItem(saveAsAction));
    fileMenu.addSeparator();                   
    fileMenu.add(new JMenuItem(printAction));
    elementMenu.add(new JMenuItem(lineAction = new TypeAction("Line", LINE, "Draw lines")));
    elementMenu.add(new JMenuItem(rectangleAction = 
                       new TypeAction("Rectangle", RECTANGLE, "Draw rectangles")));
    elementMenu.add(new JMenuItem(circleAction = new TypeAction("Circle", CIRCLE, "Draw circles")));
    elementMenu.add(new JMenuItem(curveAction = new TypeAction("Curve", CURVE, "Draw curves")));  
    elementMenu.addSeparator();
    JMenu colorMenu = new JMenu("Color");     
    elementMenu.add(colorMenu);               
    colorMenu.add(new JMenuItem(redAction = new ColorAction("Red", RED, "Draw in red")));
    colorMenu.add(new JMenuItem(yellowAction = new ColorAction("Yellow", YELLOW, "Draw in yellow")));
    colorMenu.add(new JMenuItem(greenAction = new ColorAction("Green", GREEN, "Draw in green")));
    colorMenu.add(new JMenuItem(blueAction = new ColorAction("Blue", BLUE, "Draw in blue")));
    menuBar.add(fileMenu);                    
    menuBar.add(elementMenu);                 
    saveAction.setEnabled(false);
    closeAction.setEnabled(false);
    printAction.setEnabled(false);
  }
  public Color getElementColor() { 
    return elementColor; 
  }
  public int getElementType() { 
    return elementType; 
  }
  class FileAction extends AbstractAction {    
       FileAction(String name, KeyStroke keystroke, String tooltip) {
      this(name, keystroke);                   
      if(tooltip != null) {                  
        putValue(SHORT_DESCRIPTION, tooltip);    
      }
    }
    FileAction(String name, String tooltip) {
      this(name);                            
      if(tooltip != null) {                  
        putValue(SHORT_DESCRIPTION, tooltip);    
      }
    }
    FileAction(String name) {
      super(name);    
    }
    FileAction(String name, KeyStroke keystroke) {
      this(name);
      if(keystroke != null) {
        putValue(ACCELERATOR_KEY, keystroke);
      }
    }
       public void actionPerformed(ActionEvent e) {
       }
  }  
  class TypeAction extends AbstractAction {    
        TypeAction(String name, int typeID, String tooltip) {
      this(name, typeID);
      if(tooltip != null) {                    
        putValue(SHORT_DESCRIPTION, tooltip);   
      }
    }
    TypeAction(String name, int typeID) {
      super(name);
      this.typeID = typeID;
         }  
    public void actionPerformed(ActionEvent e) {
      elementType = typeID;  
   }
    private int typeID;
  }
  class ColorAction  extends AbstractAction {
        public ColorAction(String name, Color color, String tooltip) {
      this(name, color);
      if(tooltip != null) {                     
        putValue(SHORT_DESCRIPTION, tooltip);   
      }
    }
    public ColorAction(String name, Color color) {
      super(name);
      this.color = color;
          }
    public void actionPerformed(ActionEvent e) {
      elementColor = color;
    }
    private Color color;
  }
  private FileAction newAction, openAction, closeAction,
                     saveAction, saveAsAction, printAction;
  private TypeAction lineAction, rectangleAction, circleAction, curveAction;
  private ColorAction redAction, yellowAction,
                      greenAction, blueAction;
  private JMenuBar menuBar = new JMenuBar();           
  private Color elementColor = DEFAULT_ELEMENT_COLOR; 
  private int elementType = DEFAULT_ELEMENT_TYPE;     
  private Sketcher theApp;                         
}
