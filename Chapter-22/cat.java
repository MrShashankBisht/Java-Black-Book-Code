import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
/*
<APPLET
CODE=cat.class
WIDTH=600
HEIGHT=100 >
</APPLET>
*/

public class cat extends java.applet.Applet implements Runnable {
		Image catpics[] = new Image[9];
		Image currentimg;
		Thread runner;
		int xpos;
		int ypos = 50;
public void init() {
    String catsrc[] = { "right1.gif", "right2.gif", "stop.gif", "yawn.gif", "scratch1.gif", "scratch2.gif","sleep1.gif", "sleep2.gif",  "awake.gif" 
						};
	for (int i=0; i < catpics.length; i++) 					{
    
        catpics[i] = getImage(getDocumentBase(),catsrc[i]);
				          }
			}

	        public void start() 
			{
			      if (runner == null) 
					{
				              runner = new Thread(this);
				              runner.start();
				        }
      			}
	
		public void stop() 
			{
			      if (runner != null) 
					{
				              runner.stop();
				              runner = null;
          				}
		        }

	        public void run() 
			{
			      setBackground(Color.white);

			      catrun(0, size().width / 2);
			      currentimg = catpics[2];
           		      repaint();
			      pause(1000);
			      currentimg = catpics[3];
		              repaint();
		              pause(1000);
		              catscratch(4);
		              catsleep(5);
		              currentimg = catpics[8];
		              repaint();
		              pause(500);
      	 		      catrun(xpos, size().width + 10);
		        }

	      void catrun(int start, int end) 
			{
			      for (int i = start; i < end; i += 10) 
				{
			              xpos = i;
			              if (currentimg == catpics[0])
			                 currentimg = catpics[1];
			              else currentimg = catpics[0];
			              repaint();
			              pause(150);
			          }
		        }

	     void catscratch(int numtimes) 
			{
			         for (int i = numtimes; i > 0; i--) 
					{
				              currentimg = catpics[4];
				              repaint();
				              pause(150);
				              currentimg = catpics[5];
				              repaint();
					      pause(150);
				          }
      			}
 
 	     void catsleep(int numtimes) 
			{
			         for (int i = numtimes; i > 0; i--) 
					{
				              currentimg = catpics[6];
				              repaint();
				              pause(250);
				              currentimg = catpics[7];
				              repaint();
				              pause(250);
				          }
			} 
      
		void pause(int time) 
			{
			         try 
					{ 
						Thread.sleep(time); 
					}
			      
				 catch (InterruptedException e) 
					{ 
					}
			}

	     public void paint(Graphics g) 
			{
		        	if (currentimg != null)
			           g.drawImage(currentimg, xpos, ypos, this);
			}
	}
