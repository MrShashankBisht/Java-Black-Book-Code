   import javax.swing.JFrame;
   import javax.swing.JPanel;
   import java.awt.GridLayout;
   import java.awt.Color;

   public class ContF extends JFrame {

     ContF(){
       super("Test Frame");
       setBackground(Color.BLACK);
       setLayout(new GridLayout(7,7,2,2));  

       for ( int i=0;i<49; i++){
         JPanel jp = new JPanel();
         jp.setBackground(new Color (
                (int)(Math.random()*16777215)));
         add(jp);                      
       }
       setSize(400,400);
       setVisible(true);
     }

     public static void main(String[] args){
       new ContF();
     }
   }
