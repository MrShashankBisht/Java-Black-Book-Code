
class TwoPara<G, T>
{ 
G ty1; 
T ty2; 
TwoPara (G g1, T g2) { 
ty1 = g1; 
ty2 = g2; 
} 
void DispTypes()
{ 
System.out.println("G is " + ty1.getClass().getName()); 
System.out.println("T is " + ty2.getClass().getName()); 
} 
G getty1()
{ 
return ty1; 
} 
T getty2()
{ 
return ty2; 
} 
} 
class SimpGen
{ 
public static void main(String args[])
{ 
TwoPara<Integer, String> pgObj = new TwoPara<Integer, String>(2005, "Parameters"); 
pgObj.DispTypes(); 
int i = pgObj.getty1(); 
System.out.println("The value with integer = " + i); 
 String str = pgObj.getty2(); 
System.out.println("The value with string: " + str); 
} 
}

