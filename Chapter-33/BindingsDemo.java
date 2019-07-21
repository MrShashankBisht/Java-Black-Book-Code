import javax.script.*;
import java.io.*;
public class BindingsDemo {
    public static void main(String[] args){
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        
        engine.put("a",10);
        engine.put("b",20);
        
        Bindings binding=engine.getBindings(ScriptContext.ENGINE_SCOPE);
        
        Object num1=binding.get("a");
        Object num2=binding.get("b");
        System.out.println("Java: A = "+num1+" and B = "+num2);
        try {
        	engine.eval("print('JavaScript: A + B = '+(a+b))");
        } catch (ScriptException e) {
        	e.printStackTrace();
        }	
    }
}
