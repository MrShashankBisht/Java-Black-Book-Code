import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class window  
{
    public static void main(String [] args)
    {
       AppFrame f = new AppFrame();

       f.setSize(200, 200);

       f.addWindowListener(new WindowAdapter() { public void
           windowClosing(WindowEvent e) {System.exit(0);}});

       f.show();
    }
}

class AppFrame extends Frame implements ActionListener
{
    Button b1, b2;
    labelWindow window;

    AppFrame()
    {
        setLayout(new FlowLayout());
        b1 = new Button("Display the window");
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("Hide the window");
        add(b2);
        b2.addActionListener(this);

        window = new labelWindow(this);
        window.setSize(300, 200);
        window.setLocation(300, 300);
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

class labelWindow extends Window {
    Label label;

    labelWindow(AppFrame af){
        super(af);
        setLayout(new FlowLayout());
        label = new Label("Hello from Java!");
        add(label);
    }

    public void paint (Graphics g)
    {
        int width = getSize().width;
        int height = getSize().height;

        g.drawRect(0, 0, --width, --height);
    }
}

