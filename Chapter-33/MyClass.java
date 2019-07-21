import javax.script.*;
public class MyClass {
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("js");
		try {
			
			engine.eval("mymethod=Packages.MyClass['sum(float,float)'];"+
				"mymethod(3.2, 4.6);");

			engine.eval("Packages.MyClass['sum(int,float)'](5,2.7);");

		} catch (ScriptException e) {
			
			e.printStackTrace();
		}
	}

	static public void sum(int x, float y) {
		 System.out.println("Method First. "+x+" + "+y+" = "+(x+y)); 
	} 

	static public void sum(float x, float y) {
		 System.out.println("Method Second. "+x+" + "+y+" = "+(x+y)); 
	} 

	static public void sum(float x, int y) {
		 System.out.println("Method Third. "+x+" + "+y+" = "+(x+y)); 
	} 
}
