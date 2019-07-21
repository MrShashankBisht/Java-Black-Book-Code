import javax.script.*;
public class CompileDemo {
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("js");
		
		Compilable compEngine=(Compilable)engine;
		try {
			CompiledScript myscript=compEngine.compile("var date=new Date();" +
					"d=date.getHours();" +
					"if(d<12)" +
					"println('Good Morning!');" +
					"else if (d<16)" +
					"println('Good After Noon');" +
					"else " +
					"println('Good Evening!')");
			
			for(int i=0;i<=2;i++)
			myscript.eval();
		} catch (ScriptException e) {
			
			e.printStackTrace();
		}
	}
}
