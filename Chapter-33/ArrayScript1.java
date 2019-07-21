import javax.script.*;
public class ArrayScript1{
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("js");

		String script="var names = java.lang.reflect.Array.newInstance(java.lang.String, 3);"+
"names[0]='Kogent';"+
"names[1]='Prakash';"+
"names[2]='Santosh';"+
"for(i=0;i<names.length;i++)"+
"println(names[i]);";
				
		try {
			engine.eval(script);			


		
		} catch (ScriptException ex) {
		    ex.printStackTrace();
	  	}
			
	}
}
