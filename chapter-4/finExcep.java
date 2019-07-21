import java.util.*;
public class finExcep {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
		try { 
	System.out.print("\nEnter an integer: ");
	int i = getInt();
	System.out.print("Enter another integer: ");
	int j = getInt();
			int answer = divideTheseNumbers(i, j);
		}
		catch (Exception e) {
			System.out.println("...still it didn't work!");
		}
	}
	public static int getInt() {
		while (true)
			try {
				return sc.nextInt();
			}
			catch (InputMismatchException e) {
				sc.next();
			}
	}
	public static int divideTheseNumbers(int a, int b) throws Exception {
		int c;
		try {
			c = a / b;
			System.out.println("\n...It worked!!");
		}
		catch (Exception e) {
			System.out.println("\nOops!! Didn't work!");
			c = a / b;
	//		System.out.println("Oops!! Didn't work again!");
		}
		finally {
			System.out.println("\n...Given my best try.....");
		}
		System.out.println("It worked after all.");
		return c;
	}
}
