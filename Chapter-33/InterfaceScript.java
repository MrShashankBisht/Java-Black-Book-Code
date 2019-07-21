import javax.script.*;
public class InterfaceScript{
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("js");
		try {
			engine.eval("importPackage(java.lang);"+
				"var thread=new Thread(function() {"+
				"print('Hello from  Thread.')});"+
				"thread.start();");
		} catch (ScriptException ex) {
		    ex.printStackTrace();
	  	}			
	}
} 
