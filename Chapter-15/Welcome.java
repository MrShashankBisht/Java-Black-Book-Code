import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Welcome extends JFrame
{
	public static void main(String[] args)
	{
		new Welcome();
	}

	public Welcome()
	{
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Welcome to Swing Programming!");
		this.setVisible(true);
	}
}
