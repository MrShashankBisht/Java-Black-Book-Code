import javax.swing.JComponent;
import java.util.Observer;                  
import java.util.Observable;                  
import java.awt.Graphics;                                
import java.awt.Graphics2D;
import java.awt.Point; 
import java.awt.Rectangle;                               
import java.awt.event.MouseEvent;    
import javax.swing.event.MouseInputAdapter;    
import Constants.SketcherConstants.*;

class SketchView extends JComponent implements Observer {
  public SketchView(Sketcher App) {
    this.App = App;
    MouseHandler handler = new MouseHandler();        
addMouseListener(handler);                        
addMouseMotionListener(handler);                  
  }
  public void update(Observable o, Object rectangle) {
    if(rectangle != null & rectangle instanceof Rectangle) {
      repaint((Rectangle)rectangle);
    } else {
      repaint();
    }
  }

  public void paint(Graphics g) {
    Graphics2D g2D = (Graphics2D)g; 
    for(Element elemt : App.getModel()) { 
      g2D.setPaint(elemt.getColor());        
      g2D.draw(elemt.getShape());                  
    }
  }
  private Sketcher App;                       
  class MouseHandler extends MouseInputAdapter {
    public void mousePressed(MouseEvent e)  {
      start = e.getPoint();                      
      if(bDown = (e.getButton() == MouseEvent.BUTTON1)) {
        g2D = (Graphics2D)getGraphics();         
        g2D.setXORMode(getBackground());               
 g2D.setPaint(App.getWindow().getElementColor()); 
      }
    }

    public void mouseDragged(MouseEvent e) {
      last = e.getPoint();             
      if(bDown) {
        if(tmpElement == null) {      
          tmpElement = createElement(start, last); 
        } else {
          g2D.draw(tmpElement.getShape());         
          tmpElement.modify(start, last);          
        }
        g2D.draw(tmpElement.getShape());           
      }
    }

    public void mouseReleased(MouseEvent e) {
      if(bDown = (e.getButton()==MouseEvent.BUTTON1)) {
        bDown = false;                     
        if(tmpElement != null) {
          App.getModel().add(tmpElement);  
          tmpElement = null;                  
        }
        if(g2D != null) {                      
          g2D.dispose();                       
          g2D = null;                          
        }
        start = last = null;                   
      }
    }

    private Element createElement(Point start, Point end) {
      switch(App.getWindow().getElementType()) {
        case LINE:
          return new Element.Line(start, end, App.getWindow().getElementColor());   
        case RECTANGLE:
          return new Element.Rectangle(start, end, App.getWindow().getElementColor());
        case CIRCLE:
          return new Element.Circle(start, end, App.getWindow().getElementColor());

        case CURVE:
          return new Element.Curve(start, end, App.getWindow().getElementColor());

        default:
          assert false;       
       }
       return null;
    }

    private Point start;      
    private Point last;       
    private Element tmpElement;
    private boolean bDown = false;    
    private Graphics2D g2D;                 
  }
}
