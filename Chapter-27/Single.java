import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Sngle {
    int value();
}
class Single {
@Sngle(100)
public static void Meth() {
Single obj = new Single();
try{
Method mt = obj.getClass().getMethod("Meth");
Sngle sng = mt.getAnnotation(Sngle.class);
System.out.println(sng.value());
} catch (NoSuchMethodException exc) {
System.out.println ("Method Not Found.");
}
}
public static void main(String args[]) {
Meth();
}
}
