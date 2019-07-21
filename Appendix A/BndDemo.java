
class GT<G extends Number>
{  
G[] bnd;  
GT(G[] t)
{  
bnd = t;  
}  
double aver()
{  
double sum = 0.0; 
for(int v=0; v < bnd.length; v++)  
sum += bnd[v].doubleValue(); 
return sum / bnd.length; 
}  
}  
class BndDemo
{  
public static void main(String args[])
{  
Integer vnums[] = { 10, 20, 30, 40, 50 }; 
GT<Integer> vob = new GT<Integer>(vnums);   
double j = vob.aver(); 
System.out.println("vob average is " + j); 
Double dnums[] = { 10.1, 20.2, 30.3, 40.4, 50.5 }; 
GT<Double> dob = new GT<Double>(dnums);   
double k = dob.aver(); 
System.out.println("dob average is " + k); 
}  
}
