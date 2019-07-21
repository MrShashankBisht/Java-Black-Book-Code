import javax.script.*;
public class JavaImport {
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("javascript");
		String script="myPack=JavaImporter(java.util, java.util.Date);" +
				"with(myPack){" +
				"var date=new Date();" +
				"print(date);"+
				"}";
		try {
			engine.eval(script);
		} catch (ScriptException e) {
			e.printStackTrace();
		}		
	}

}
