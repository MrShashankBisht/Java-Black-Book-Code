import javax.script.*;
import java.io.*;

public class ScriptVar1 { 

    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        File f = new File("ScriptVar1.java");
        engine.put("file", f);
	engine.eval("println('The absolute path of '+file.getName()+' is '+file.getAbsolutePath())");
	engine.eval("println('Is a File - '+file.isFile())");
	engine.eval("print('Is a Directory '+file.isDirectory())");
	
    }
}
