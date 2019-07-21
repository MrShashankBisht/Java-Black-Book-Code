import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
public class SysTray{
	private static void constructGUI(){
		if(!SystemTray.isSupported()){
			System.out.println("SystemTray is not supported");
			return;
			}
		SystemTray systray=SystemTray.getSystemTray();
		Toolkit systoolkit = Toolkit.getDefaultToolkit();
		Image image = systoolkit.getImage("image.jpg");
		PopupMenu popmenu = new PopupMenu();
		//Menu item to show the message
		MenuItem msgItem= new MenuItem("Show Message");
		msgItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null,"System Tray Demo");
			}
		});
		popmenu.add(msgItem);
		//create menu item to close application
		MenuItem menuitem = new MenuItem("close");
		menuitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		popmenu.add(menuitem);
		TrayIcon tryicon = new TrayIcon(image,"SystemTray Demo",popmenu);
		tryicon.setImageAutoSize(true);
		try{
			systray.add(tryicon);
		}catch (AWTException e){
			System.out.println(" tray icon cannot be added to system tray");
			}
			
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				constructGUI();
			}
		});
	}
}
