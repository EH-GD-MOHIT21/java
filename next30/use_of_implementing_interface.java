import java.io.*;

interface In1
{

    final int a = 10;
 
    void display();
}

class use_of_implementing_interface implements In1
{

    public void display()
    {
        System.out.println("hello");
    }
    public static void main (String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}
