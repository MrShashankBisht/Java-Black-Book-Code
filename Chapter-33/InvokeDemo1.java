import javax.script.*;
public class InvokeDemo1 {
    public static void main(String[] args){
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        String script = "var obj = new Object();" +
        		"obj.myMethod = function(str) { " +
        		"println('Hello, ' + str); " +
        		"}";
        try{
        	 engine.eval(script);
             Invocable invEngine = (Invocable) engine;
             Object obj = engine.get("obj");
             invEngine.invokeMethod(obj, "myMethod", "Nancy" );
             invEngine.invokeMethod(obj, "myMethod", "Lucy" );
        }catch(ScriptException e){
        	e.printStackTrace();
        }catch(NoSuchMethodException e){
        	e.printStackTrace();
        }       
    }
}
