enum Mango {
Brooks, Manilla, Alphanso, Kesar, Maya
}
class apple6 {
public static void main (String args[])
{ Mango ap, ap2, ap3;
System.out.println("Here are all mango constants" + " and their ordinal values: ");
for (Mango a : Mango.values())
System.out.println(a +" " + a.ordinal());
ap = Mango.Alphanso;
ap2 = Mango.Manilla;
ap3 = Mango.Alphanso;

System.out.println();
if(ap.compareTo(ap2) < 0)
System.out.println(ap + " comes before " + ap2);

if(ap.compareTo(ap2) > 0)
System.out.println(ap2 + " comes before " + ap);

if(ap.compareTo(ap2) == 0)
System.out.println(ap + " equals " + ap3);

System.out.println();

if(ap.equals(ap2))
System.out.println("Error");

if(ap.equals(ap3))
System.out.println("Error");

if(ap == ap3)
System.out.println(ap + " = = " + ap3);
}
}
