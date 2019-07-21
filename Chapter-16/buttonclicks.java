import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
/* 
  <applet code="buttonclicks" width=300 height=700> 
  </applet> 
*/ 
   
public class buttonclicks extends JApplet  
implements ActionListener { 
  JTextField txtClk; 
 
  public void init() { 
   try { 
    SwingUtilities.invokeAndWait( 
      new Runnable() { 
      public void run() { 
         makeGUI(); 
      } 
      } 
    ); 
   } catch (Exception excep) { 
      System.out.println("Sorry! Can't be created " + 
                         excep); 
    } 
  }     
   private void makeGUI() { 
    setLayout(new FlowLayout()); 

    ImageIcon Bulge = new ImageIcon("bulg.jpg"); 
    JButton buClk = new JButton(Bulge); 
    buClk.setActionCommand("Optical Illusion - Bulging"); 
    buClk.addActionListener(this); 
    add(buClk); 
 
    ImageIcon Wheels = new ImageIcon("wheels.jpg"); 
    buClk = new JButton(Wheels); 
    buClk.setActionCommand("Optical Illusion - Wheels Rotating"); 
    buClk.addActionListener(this); 
    add(buClk); 
 
    ImageIcon Zollner = new ImageIcon("illus.jpg"); 
    buClk = new JButton(Zollner); 
    buClk.setActionCommand("Zollner-illusion"); 
    buClk.addActionListener(this); 
    add(buClk); 

    txtClk = new JTextField(20); 
    add(txtClk); 
  } 
 
  public void actionPerformed(ActionEvent ae) { 
    txtClk.setText(ae.getActionCommand()); 
  } 
}