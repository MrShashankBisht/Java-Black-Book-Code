import javax.script.*;
public class HelloScript {
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("javascript");
		String script="function hello(){"+
			"println('Hello from Function')"+
			"}"+
			"for(i=0;i<5;i++){" +
			"hello()" +
			"}";
		try {
			engine.eval(script);
		} catch (ScriptException e) {
			e.printStackTrace();
		}		
	}
}