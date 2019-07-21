import javax.script.*;
public class SwingDemo{
	public static void main(String args[]){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("js");
		
		try {
		engine.eval("importPackage(javax.swing);" +
				"importClass(javax.swing.JFrame);"+
				"var frame=new JFrame('Welcome');"+
				"var label=new JLabel('Welcome to JavaScript');"+
				"frame.getContentPane().add(label);"+
				"frame.pack();"+
				"frame.setVisible(true);"+
				"var optionPane = " +
				"JOptionPane.showMessageDialog(null, 'Hello! JavaScript');");
		} catch (ScriptException ex) {
		    ex.printStackTrace();
	  	}
			
	}
}
