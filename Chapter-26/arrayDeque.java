import java.util.*;
class arrayDeque
{
public static void main(String args[])
{
ArrayDeque<String> arrdeque= new ArrayDeque<String>();
arrdeque.push("Item 0");
arrdeque.push("Item 2");
arrdeque.push("Item 3");
arrdeque.push("Item 4");
arrdeque.push("Item 5");
arrdeque.push("Item 6");

System.out.println("Popping the stack: ");

while (arrdeque.peek() != null)
{
	System.out.println(arrdeque.pop() + " ");
}
   System.out.println(); 
}
}
