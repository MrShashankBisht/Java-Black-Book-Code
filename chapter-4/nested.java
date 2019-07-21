class nested {
public static void main(String args[]) {
try {
try {
int c[] = {0, 1, 2, 3};
c[4] = 4;
} catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Array index out of bounds: " + e);
}
} catch(ArithmeticException e) {
System.out.println("Divide by zero: " + e);
}
}
}
