class Mainclas
{ 
int mnum; 
Mainclas(int j)
{ 
mnum = j; 
} 
int getnum()
{ 
return mnum; 
} 
}
class Gensub<T> extends Mainclas
{  
T item;  
Gensub(T k, int l)
{  
super(l); 
item = k;  
}  
T getitem()
{  
return item;  
}  
} 
class Subclas
{  
public static void main(String args[])
{  
Gensub<String> h = new Gensub<String>("Black Book", 10); 
System.out.print(h.getitem() + " "); 
System.out.println(h.getnum()); 
}  
}
