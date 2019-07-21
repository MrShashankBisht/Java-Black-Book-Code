import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class sizeToppings extends JFrame {
	public static void main(String [] args) {
		new sizeToppings();
	}
	private JButton buttonOK;
	private JRadioButton small, medium, large;
	private JCheckBox pepperoni, mushrooms, anchovies, Extra, onion, sausage;
	public sizeToppings() {
	    this.setSize(600,200);
	    this.setTitle("Pizza toppings");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonListener bl = new ButtonListener();
		JPanel mainPanel = new JPanel();
	    JPanel sizePanel = new JPanel();
		Border b1 = BorderFactory.createTitledBorder("Sizes available");
		sizePanel.setBorder(b1);
		ButtonGroup sizeGroup = new ButtonGroup();
		small = new JRadioButton("Small");
		small.setSelected(true);
		sizePanel.add(small);
		sizeGroup.add(small);
		medium = new JRadioButton("Medium");
		sizePanel.add(medium);
		sizeGroup.add(medium);
		large = new JRadioButton("Large");
		sizePanel.add(large);
		sizeGroup.add(large);
		mainPanel.add(sizePanel);
		JPanel topPanel = new JPanel();
		Border b2 = BorderFactory.createTitledBorder("Varieties available");
		topPanel.setBorder(b2);
		anchovies = new JCheckBox("Anchovies");
		topPanel.add(anchovies);	
		Extra = new JCheckBox("Extra cheese");
		topPanel.add(Extra);
		pepperoni = new JCheckBox("Pepperoni");
		topPanel.add(pepperoni);
		onion = new JCheckBox("Onion");
		topPanel.add(onion);
		mushrooms = new JCheckBox("Mushrooms");
		topPanel.add(mushrooms);
		sausage = new JCheckBox("Sausage");
		topPanel.add(sausage);
		
		mainPanel.add(topPanel);

		buttonOK = new JButton("OK");
		buttonOK.addActionListener(bl);
	    mainPanel.add(buttonOK);
	    this.add(mainPanel);
	    this.setVisible(true);
	}
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonOK) {
				String tops = "";
				if (pepperoni.isSelected())
					tops += "Pepperoni\n";
				if (mushrooms.isSelected())
				    tops += "Mushrooms\n";
				if (anchovies.isSelected())
				    tops += "Anchovies\n";
				if (onion.isSelected())
				    tops += "Onion\n";
				if (sausage.isSelected())
				    tops += "Sausage\n";
				if (Extra.isSelected())
				    tops += "Extra cheese\n";
				String msg = "You ordered ";
				if (small.isSelected())
					msg += "a small pizza with ";
				if (medium.isSelected())
					msg += "a Medium pizza with ";
				if (large.isSelected())
					msg += "a LARGE pizza with ";
				if (tops.equals(""))
					msg += "no toppings.";
				else
					msg += "the toppings:\n" + tops;
				JOptionPane.showMessageDialog(buttonOK,
					msg, "Your Order",
					JOptionPane.INFORMATION_MESSAGE);
				pepperoni.setSelected(false);
				mushrooms.setSelected(false);
				anchovies.setSelected(false);
				small.setSelected(true);
			}
		}
	}
}