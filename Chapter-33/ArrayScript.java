import javax.script.*;
public class ArrayScript{
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("js");
		int[] a=new int[5];
		a[0]=2;
		a[1]=3;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		engine.put("num", a);
		try {
			engine.eval("var i, sum=0;"+
				"for(i=0;i<num.length;i++)"+
				"sum=sum+num[i];"+	
				"print('The sum is '+sum);");
		
		} catch (ScriptException ex) {
		    ex.printStackTrace();
	  	}
			
	}
}
