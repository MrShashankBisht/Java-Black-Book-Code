import java.io.*;
public class ConsoleDemo{

	public static void main(String args[]){
		int MIN_PASSWORD_LENGTH = 8;
		char[] password;
		Console console=System.console();
		do {
			password = console.readPassword( "Enter password (minimum of %d characters): ", MIN_PASSWORD_LENGTH);
			console.printf("Password Length is %d\n", password.length);
		} while (password.length < MIN_PASSWORD_LENGTH);
	}
}


