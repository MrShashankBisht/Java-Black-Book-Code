import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.Image.*;
import java.util.*;

public class ImageConverter
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Supported conversion Formats :");
        System.out.println(Arrays.toString(ImageIO.getWriterFormatNames()));
        if(args.length == 0)
        {
            System.err.println("Missing Input Filename");
            System.exit(-1);
        } 
            
        String filename = args[0];
        File inputFile = new File(filename);
        BufferedImage input = ImageIO.read(inputFile);
        File outputFile = new File(filename+ ".gif");
        ImageIO.write(input, "GIF", outputFile);
    }
}