import java.io.*;
class NewString implements Serializable{
	String data;
	public NewString(String instring){
		data = instring;
	}
	public String toString(){
		return data;
	}
}
