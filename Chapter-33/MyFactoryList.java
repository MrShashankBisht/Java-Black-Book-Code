import javax.script.*;
import java.io.*;
import java.util.*;
public class MyFactoryList{
	public static void main(String args[]){

		ScriptEngineManager manager=new ScriptEngineManager();

		List<ScriptEngineFactory> factoryList=manager.getEngineFactories();
		
		for(ScriptEngineFactory factory:factoryList){
			Console console=System.console();
			console.printf("Engine Name: %s%n"+
					"Engine Version: %s%n"+
					"Language Name: %s%n"+
					"Language Version: %s%n"+
					"Extension: %s%n"+
					"Mime types: %s%n"+
					"Names: %s%n", 
					factory.getEngineName(),
					factory.getEngineVersion(),
					factory.getLanguageName(),
					factory.getLanguageVersion(),
					factory.getExtensions(),
					factory.getMimeTypes(),
					factory.getNames()
					);
			ScriptEngine engine=factory.getScriptEngine();
			
		}
	}

}