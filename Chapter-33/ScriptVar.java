import javax.script.*;
public class ScriptVar{
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("javascript");
		try{
			engine.put("a",10.3);
			engine.put("b",20.5);
			engine.put("c",0);
		
			engine.eval("println('A= '+a)");
			engine.eval("println('B= '+b)");
			engine.eval("c=a+b");
			
			System.out.println("The sum of A and B is "+engine.get("c"));
		}
		catch(ScriptException e){
			e.printStackTrace();			
		}	
				
	}	
}
