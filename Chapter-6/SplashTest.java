import java.awt.*;
import java.awt.SplashScreen;
import javax.swing.*;

public class SplashTest  {
    private static void createImage() {
    	SplashScreen splashscreen = SplashScreen.getSplashScreen();
    	if(splashscreen!=null){
    		Graphics2D g = (Graphics2D) splashscreen.createGraphics();
    		for(int i=0;i<10;i++){
    		String message = "Processing"+ i+ "of 10....";
    		g.setComposite(AlphaComposite.Clear);
            g.fillRect(130,350,280,40);
            g.setPaintMode();
            g.setColor(Color.RED);
            g.drawString(message,130,360);
            g.fillRect(130,370,i*30,20);
            splashscreen.update();
            try{
            	Thread.sleep(500);
            	}catch(InterruptedException e){
            		e.printStackTrace();
            	}
    	}
              
    }
    JFrame frame = new JFrame("Splash Screen demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,200);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}
 
    public static void main (String args[]) {
    	SwingUtilities.invokeLater(new Runnable(){
    		public void run(){
    			createImage();
    		}
    	});
               
    }
}
