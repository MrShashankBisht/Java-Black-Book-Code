import java.awt.*;
import java.awt.datatransfer.*;
public class ClipBoardDemo{

	public static void main(String[] argv){
		useClipboard useclipboard = new useClipboard();
	}
}

class useClipboard extends Frame implements ClipboardOwner{
	useClipboard(){
		Clipboard clipboard = getToolkit().getSystemClipboard();
		StringSelection contents = new StringSelection("Hello from Java!");
		clipboard.setContents(contents, this);
		System.exit(0);
	}
	public void lostOwnership(Clipboard clipboard, Transferable contents){
		System.out.println("Clipboard contents replaced");
	}
}

