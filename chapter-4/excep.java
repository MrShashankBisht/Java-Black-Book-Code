class excep {
public static void main(String args[]) {
try {
int array[] = new int[100];
array[100] = 100;
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Exception: " + e.getMessage());
e.printStackTrace();
}
}
}
