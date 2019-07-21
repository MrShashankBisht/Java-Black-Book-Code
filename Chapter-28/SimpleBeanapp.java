package sunw.demo.simplebean;
import java.awt.*;
import java.io.Serializable;
 
public class SimpleBeanapp extends Canvas
                        implements Serializable{
 
    private Color clr = Color.green;
 
    public Color getColor(){
        return clr;
    }
 
    public void setColor(Color newclr){
        clr = newclr;
        repaint();
    }
 
    public void paint(Graphics g) {
        g.setColor(clr);
        g.fillRect(20, 5, 20, 30);
    }
 
    public SimpleBeanapp(){
        setSize(60,40);
        setBackground(Color.red);
    }
}
