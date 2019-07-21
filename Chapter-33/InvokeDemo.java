import javax.script.*;
public class InvokeDemo {
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("js");
		try {
			engine.eval("function fun1(){" +
					"println('Hello! The method invoked.')}");
			engine.eval("function add(a,b){" +
					"return (a+b)}");
			Invocable invEngine=(Invocable)engine;
			
			invEngine.invokeFunction("fun1");

			System.out.println("Using invokeFunction Method.");
			System.out.print("The Result is ");
			System.out.println(invEngine.invokeFunction("add",new Object[] {23,12}));
			
			
			MyInterface adder=invEngine.getInterface(MyInterface.class);
			System.out.println("Using User interface method.");
			System.out.print("The Result is ");
			System.out.print(adder.add(23,12));
		} catch (ScriptException e) {
			e.printStackTrace();
		}catch(NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
interface MyInterface{
	int add(int a, int b);
}