
public class gen_met {
public static void main(String[] args ) {
Integer[] integers = {1, 2, 3, 4, 5};
String[] strings = {"Melbourne", "Moscow", "Rome", "Cairo"};
print(integers);
print(strings);
}
public static <E> void print(E[] list) {
for (int i = 0; i < list.length; i++)
System.out.print(list[i] + " ");
System.out.println();
}
}
