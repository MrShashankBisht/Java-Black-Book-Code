import java.awt.event.*;
import javax.swing.*;

public class Ticking
{
	public static void main(String[] args)
	{
		Timer tm = new Timer(1000, new Ticker());
		tm.start();
		JOptionPane.showMessageDialog(null, "You wish to exit now!! Fine...Click OK");
	}
}

class Ticker implements ActionListener
{
	private boolean tick = true;

	public void actionPerformed(ActionEvent event)
	{
		if (tick)
		{
			System.out.println("Ding...");
		}
		else
		{
			System.out.println("Dong...");
		}
		tick = !tick;
	}
}


