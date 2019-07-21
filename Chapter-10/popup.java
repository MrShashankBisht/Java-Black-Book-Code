import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<APPLET
    CODE=popup.class
    WIDTH=200
    HEIGHT=200 >
</APPLET>
*/

public class popup extends Applet implements ActionListener, MouseListener {

        Label label;
        PopupMenu popup;
        MenuItem menuitem1, menuitem2, menuitem3, menuitem4;
        
        public void init()
        {
            popup = new PopupMenu("Menu");
            menuitem1 = new MenuItem("Item 1");
            menuitem1.addActionListener(this);
            menuitem2 = new MenuItem("Item 2");
            menuitem2.addActionListener(this);
            menuitem3 = new MenuItem("Item 3");
            menuitem3.addActionListener(this);
            menuitem4 = new MenuItem("Item 4");
            menuitem4.addActionListener(this);
            popup.add(menuitem1);
            popup.addSeparator();
            popup.add(menuitem2);
            popup.addSeparator();
            popup.add(menuitem3);
            popup.addSeparator();
            popup.add(menuitem4);
            add(popup);
            label = new Label("Hello from Java!");
            add(label);
            addMouseListener(this);
        }

        public void mousePressed(MouseEvent e)
        {
            if(e.getModifiers() != 0){
                popup.show(this, e.getX(), e.getY());
            }
        }

        public void mouseClicked(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}

        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == menuitem1)
                label.setText("You chose item 1");
            else if(event.getSource() == menuitem2)
                label.setText("You chose item 2");
            else if(event.getSource() == menuitem3)
                label.setText("You chose item 3");
            else if(event.getSource() == menuitem4)
                label.setText("You chose item 4");
        }
    }
