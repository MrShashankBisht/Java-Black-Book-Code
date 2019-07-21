
import java.applet.Applet;
import java.awt.*;
public class First extends Applet
{
TextField text1;
Button button1;
public void init()
{
text1 = new TextField(20);
add(text1);
button1 = new Button("Click Me");
add(button1);
}
public boolean action (Event e, Object o)
{
String caption = (String)o;
String msg = "Hello from Java!";
if(e.target instanceof Button){
if(caption == "Click Me"){
text1.setText(msg);
}
}
return true;
}
}
