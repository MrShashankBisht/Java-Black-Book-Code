import javax.swing.*;
import java.awt.event.*;

public class ClickMe extends JFrame
{
	public static void main(String [] args)
	{
		new ClickMe();
	}

	private JButton button1, exitButton;

	public ClickMe()
	{
	    this.setSize(275,100);
	    this.setTitle("I am counting!!");
	    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		ClickListener cl = new ClickListener();

	    JPanel panel1 = new JPanel();

	    addWindowListener(new WindowAdapter()
	    	{
				public void windowClosing(WindowEvent e)
				{
					exitButton.doClick();
				}
			} );

		button1 = new JButton("Press Enter or Click Mouse!");
		button1.setMnemonic('P');
		getRootPane().setDefaultButton(button1);
		button1.addActionListener(cl);
	    panel1.add(button1);

	    exitButton = new JButton("EXIT");
	    exitButton.addActionListener(cl);
	    panel1.add(exitButton);

	    this.add(panel1);

	    this.setVisible(true);
	}

	private class ClickListener implements ActionListener
	{
		private int clickCount = 0;

		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == button1)
			{
				clickCount++;
				if (clickCount == 1)
					button1.setText("You clicked Me!");
			    else
					button1.setText("You clicked "
						+ clickCount + " times!");
			}
			else if (e.getSource() == exitButton)
			{
				if (clickCount > 0)
					System.exit(0);
				else
				{
					JOptionPane.showMessageDialog(ClickMe.this,
					    "...try clicking once!!",
					    "In a hurry...!!",
					    JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
}



	
		