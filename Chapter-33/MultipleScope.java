import javax.script.*;
public class MultipleScope {
	public static void main(String[] args) throws Exception {
		
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        
        engine.put("name", "Nancy");
        engine.eval("println('In Scope 1 - Name: '+name);");
               
        ScriptContext myContext = new SimpleScriptContext();
        Bindings myScope = myContext.getBindings(ScriptContext.ENGINE_SCOPE);
        
        myScope.put("name", "Lucy");
        engine.eval("println('In Scope 2 - Name: '+name);", myContext);
    }
}
