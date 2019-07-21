import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
public class Sketcher {
  public static void main(String[] args) {
    App = new Sketcher();
    SwingUtilities.invokeLater(
new Runnable() {   
		public void run() {  
		App.creatGUI();
                }});
  }
  private void creatGUI() {
    win = new SketchFrame("Sketcher", this);
    Toolkit Kit = win.getToolkit();      
    Dimension wndSize = Kit.getScreenSize();
    win.setBounds(wndSize.width/4, wndSize.height/4,       
                      wndSize.width/2, wndSize.height/2);     
    win.addWindowListener(new WindowHandler());
    sketch = new SketchModel();                 
    view = new SketchView(this);                
    sketch.addObserver(view);                   
    win.getContentPane().add(view, BorderLayout.CENTER);
    win.setVisible(true);
  }
  public SketchFrame getWindow() { 
     return win; 
  }
  public SketchModel getModel() { 
     return sketch; 
  }
  public SketchView getView() { 
     return view; 
  }
    class WindowHandler extends WindowAdapter {
       public void windowClosing(WindowEvent e) {
    }
  }
  private SketchModel sketch;                    
  private SketchView view;                       
  private  SketchFrame win;                   
  private static  Sketcher App;               
}
