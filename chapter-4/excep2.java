class excep2 {
public static void main(String args[]) {
try {
doWork();
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Exception: " + e.getMessage());
e.printStackTrace();
}
}
static void doWork() throws ArithmeticException {
int array[] = new int[100];
array[100] = 100;
}
}
