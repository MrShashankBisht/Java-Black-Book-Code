interface Printem 
{
    void printText1();
    void printText2();
}

public class interfaces2 
{
    public static void main(String[] args)
    {
        class2 object2 = new class2();
        object2.printText2();
    }
}

abstract class class1 implements Printem
{
    public void printText1()
    {
        System.out.println("Hello from Java!");
    }
}

class class2 extends class1
{
    public void printText2()
    {
        System.out.println("Hello from Java interfaces!");
    }
}

