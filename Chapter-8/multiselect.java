import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<APPLET
    CODE=multiselect.class
    WIDTH=300
    HEIGHT=200 >
</APPLET>
*/

public class multiselect extends Applet implements ActionListener {

    List list1;
    TextField text1;
    Button button1;
    String selections[];

    public void init(){
        text1 = new TextField(40);
        add(text1);
        list1 = new List(4, true);
        list1.add("Item 1");
        list1.add("Item 2");
        list1.add("Item 3");
        list1.add("Item 4");
        list1.add("Item 5");
        list1.add("Item 6");
        list1.add("Item 7");
        list1.add("Item 8");
        list1.add("Item 9");
        add(list1); 
        button1 = new Button("Show selections");
        button1.addActionListener(this); 
        add(button1);
    }

    public void actionPerformed(ActionEvent e) 
    {
        String outString = new String("You selected:");

        if(e.getSource() == button1){
            selections = list1.getSelectedItems();
            for(int loopIndex = 0; loopIndex < selections.length; loopIndex++){
                outString += " " + selections[loopIndex];
            }
            text1.setText(outString);
        }
    }
}
