import javax.swing.*; 
/* 
  <APPLET
  CODE="Pickupmenu" 
  WIDTH=400
  HEIGHT=100> 
  </APPLET> 
*/ 
public class Pickupmenu extends JApplet { 
 
  public void init() { 
    try { 
      SwingUtilities.invokeAndWait( 
        new Runnable() { 
          public void run() { 
            makeGUI(); 
          } 
        } 
      ); 
    } catch (Exception exc) { 
      System.out.println("Sorry, your order cannot be processed " + 
                         exc); 
    } 
  }     
 
  private void makeGUI() { 
 
    JTabbedPane jtp = new JTabbedPane(); 
    jtp.addTab("Pizza", new Piz()); 
    jtp.addTab("Toppings", new Top()); 
    jtp.addTab("Beverage", new Bevr());
	jtp.addTab("Add-ons", new AdOn()); 
	   add(jtp); 
  } 
} 
 
class Piz extends JPanel { 
 
  public Piz() { 
 
    JRadioButton a1 = new JRadioButton("Classic"); 
    add(a1); 
    JRadioButton a2 = new JRadioButton("Hand-tossed"); 
    add(a2); 
    JRadioButton a3 = new JRadioButton("Special Crust"); 
    add(a3); 
  } 
} 
 
class Top extends JPanel { 
 
  public Top() { 
 
    JCheckBox b1 = new JCheckBox("Onion"); 
    add(b1); 
    JCheckBox b2 = new JCheckBox("Capsicum"); 
    add(b2); 
    JCheckBox b3 = new JCheckBox("Tomato"); 
    add(b3); 
	JCheckBox b4 = new JCheckBox("Plain Cheese"); 
    add(b3); 

  } 
}

class Bevr extends JPanel { 
 
  public Bevr() { 
     
    JComboBox c = new JComboBox(); 
    c.addItem("Coke"); 
    c.addItem("Pepsi"); 
    c.addItem("7'up"); 
    c.addItem("Sprite"); 
    add(c); 
  } 
}
	
class AdOn extends JPanel { 
 
  public AdOn() { 
     
    JButton d1 = new JButton("Garlic Bread"); 
	add(d1);
    JButton d2 = new JButton("Chocolate Cake"); 
	add(d2);
    JButton d3 = new JButton("Salads"); 
	add(d3);
  } 
}