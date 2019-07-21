import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<APPLET
    CODE=menu.class
    WIDTH=200
    HEIGHT=200 >
</APPLET>
*/

public class menu extends Applet implements ActionListener 
{
    Button b1;
    frame menuWindow;

    public void init()
    {
        b1 = new Button("Display the menu window");
        add(b1);
        b1.addActionListener(this);

        menuWindow = new frame("Menus");
        menuWindow.setSize(200, 200);
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == b1){
            menuWindow.setVisible(true);
        }
    }
}

class frame extends Frame implements ActionListener 
{
    Menu menu;
    MenuBar menubar;
    MenuItem menuitem1, menuitem2, menuitem3;

    Label label;

    frame(String title)
    {
        super(title);
        label = new Label("Hello from Java!");
        setLayout(new GridLayout(1, 1));
        add(label);
        menubar = new MenuBar();

        menu = new Menu("File");

        menuitem1 = new MenuItem("Item 1");
        menu.add(menuitem1);
        menuitem1.addActionListener(this);

        menuitem2 = new MenuItem("Item 2");
        menu.add(menuitem2);
        menuitem2.addActionListener(this);

        menuitem3 = new MenuItem("Item 3");
        menu.add(menuitem3);
        menuitem3.addActionListener(this);

        menubar.add(menu);

        setMenuBar(menubar); 

         addWindowListener(new WindowAdapter() {public void
              windowClosing(WindowEvent e) {setVisible(false);}});
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == menuitem1){
            label.setText("You chose item 1");
        } else if(event.getSource() == menuitem2){
            label.setText("You chose item 2");
        } else if(event.getSource() == menuitem3){
            label.setText("You chose item 3");
        }
    }
}

