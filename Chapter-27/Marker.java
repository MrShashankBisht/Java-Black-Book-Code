import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Mark {}
class Marker {
@Mark
public static void Meth () {
	Marker obj = new Marker();
try {
Method mt = obj.getClass () .getMethod ("Meth");
if (mt.isAnnotationPresent (Mark.class))
	System.out.println ("Mark is present.");
} catch (NoSuchMethodException exc) {
	System.out.println ("Method Not Found.");
}
}
public static void main (String args[]) {
    Meth();
}
}
