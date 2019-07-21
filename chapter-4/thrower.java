class thrower {
public static void main(String args[]) {
try {
doWork();
} catch(ArithmeticException e) {
System.out.println("Caught in main" + e);
}
}
static void doWork() {
try {
throw new ArithmeticException("exception!");
} catch(ArithmeticException e) {
System.out.println("Caught inside doWork " + e);
throw e;
}
}
}
