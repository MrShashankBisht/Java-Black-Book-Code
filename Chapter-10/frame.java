import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<APPLET
    CODE=frame.class
    WIDTH=300
    HEIGHT=200 >
</APPLET>
*/

public class frame extends Applet implements ActionListener {

    Button b1, b2;
    labelFrame window;

    public void init()
    {
        b1 = new Button("Display the window");
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("Hide the window");
        add(b2);
        b2.addActionListener(this);

        window = new labelFrame("Java window");
        window.setSize(300, 200);
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == b1){
            window.setVisible(true);
        }
        if(event.getSource() == b2){
            window.setVisible(false);
        }
    }
}

class labelFrame extends Frame implements MouseListener {
    Label label;

    labelFrame(String title){
        super(title);
        setLayout(new FlowLayout());
        label = new Label("Hello from Java! This is a frame window.");
        add(label);
        addMouseListener(this);
         addWindowListener(new WindowAdapter() {public void
             windowClosing(WindowEvent e) {setVisible(false);}});
    }

    public void mousePressed(MouseEvent e)
    {
        if((e.getModifiers() & InputEvent.BUTTON1_MASK) == 
            InputEvent.BUTTON1_MASK){
            label.setText("Left mouse button down at " + e.getX() + "," +  
                e.getY());
        }
        else{
            label.setText("Right mouse button down at " + e.getX() + "," + 
                e.getY());
        }
    }

    public void mouseClicked(MouseEvent e)
    {
        label.setText("You clicked the mouse at " + e.getX() + "," + e.getY());
    }

    public void mouseReleased(MouseEvent e)
    {
        label.setText("The mouse button went up.");
    }

    public void mouseEntered(MouseEvent e)
    {
        label.setText("The mouse entered.");
    }

    public void mouseExited(MouseEvent e)
    {
        label.setText("The mouse exited.");
    }
}

