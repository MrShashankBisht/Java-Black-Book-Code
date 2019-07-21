import javax.script.*;
public class FirstScript {
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("javascript");
		String script="print('Hello JavaScript!')";
		
		try {
			engine.eval(script);
		} catch (ScriptException e) {
			e.printStackTrace();
		}		
	}	
}