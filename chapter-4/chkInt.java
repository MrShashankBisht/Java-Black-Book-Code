import java.util.*;
public class chkInt
{
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
		System.out.print("Enter an integer: ");
		int i = chkInt();
		System.out.println("You entered " + i);
    }

	public static int chkInt()
	{
		while (true)
		{
			try
			{
				return sc.nextInt();
			}
			catch (InputMismatchException e)
			{
				sc.next();
				System.out.print("That's not an integer. "
					+ "Try again: ");
			}
		}
	}

}
