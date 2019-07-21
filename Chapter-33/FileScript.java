import javax.script.*;
import java.io.*;
public class FileScript {
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("javascript");
		
		if (args.length!=1){
			System.out.print("Insufficient arguments");
			System.exit(0);
		}		
		FileReader reader = null;
		try {
			reader = new FileReader(args[0]);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			engine.eval(reader);
		} catch (ScriptException e) {
			e.printStackTrace();
		}		
	}
}
