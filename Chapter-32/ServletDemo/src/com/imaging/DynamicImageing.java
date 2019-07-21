package com.imaging;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import com.sun.image.codec.jpeg.*;
public class DynamicImageing  extends HttpServlet 
{
  	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse 	response) throws ServletException, IOException 
	{
    	response.setContentType("image/jpeg");
   	 	// Create Image
    	int width = 200;
    	int height = 30;
    	BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
     	// Get drawing context
     	Graphics2D g2D = (Graphics2D)image.getGraphics();
     	// Fill background
     	g2D.setColor(Color.gray);
     	g2D.fillRect(0, 0, width, height);
     	// Draw a string
     	g2D.setColor(Color.white);
     	g2D.setFont(new Font("Dialog", Font.PLAIN, 14));
     	g2D.drawString("http://www.java.sun.com",10,height/2+4);
     	// Draw a border
     	g2D.setColor(Color.black);
     	g2D.drawRect(0,0,width-1,height-1);
     	// Dispose context
     	g2D.dispose();
     	// Send back image
     	ServletOutputStream outstream = response.getOutputStream();
     	JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(outstream);
     	encoder.encode(image);
   }
}

