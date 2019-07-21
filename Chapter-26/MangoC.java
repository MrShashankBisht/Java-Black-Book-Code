enum Mango {
Brooks, Manilla, Alphanso, Kesar, Maya
}
class MangoC {
public static void main (String args[])
{ Mango ap;
System.out.println("Here are all Mango constant:");
Mango allmangos[] = Mango.values();
for(Mango a : allmangos) 
	System.out.println(a);
System.out.println();
ap = Mango.valueOf(" Kesar");
System.out.println("ap contains"+ap);
}
}
