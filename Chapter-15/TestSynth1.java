   import java.awt.BorderLayout;
   import java.awt.EventQueue;
   import java.io.InputStream;
   import java.text.ParseException;
   import javax.swing.JButton;
   import javax.swing.JLabel;
   import javax.swing.JFrame;
   import static javax.swing.JFrame.*;
   import javax.swing.UIManager;
   import javax.swing.plaf.synth.SynthLookAndFeel;

   public class TestSynth1 {
     public static void main(String args[]) {
       Runnable rn = new Runnable() {
         public void run() {
           SynthLookAndFeel syn = new SynthLookAndFeel();
           try {
             Class aCls = TestSynth1.class;
             InputStream is = 
                aCls.getResourceAsStream("synth1.xml");
             if (is == null) {
               System.err.println("Missing configuration file");
               System.exit(-1);
             }
             syn.load(is, aCls);
           } catch (ParseException e) {
             System.err.println("Bad configuration file");
             System.exit(-2);
           }
           try {
             UIManager.setLookAndFeel(syn);
           } catch 
              (javax.swing.UnsupportedLookAndFeelException e) {
             System.err.println("Cannot change to Synth");
             System.exit(-3);
           }
           JFrame frm = new JFrame("First");
           frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           JLabel lbl = new JLabel("Hello ALL, Try Synth");
           lbl.setHorizontalAlignment(JLabel.CENTER);
           frm.add(lbl);
           frm.setSize(300, 100);
           frm.setVisible(true);
         }
       };
       EventQueue.invokeLater(rn);
     }
   }
