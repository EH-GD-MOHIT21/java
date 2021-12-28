
import java.lang.Math;

public class Abstract_class_Shape_PrintArea {
    public static void main(String args[]){
        Circle c = new Circle();
        c.a = 5;c.b=7;
        c.printArea();
        Rectangle r = new Rectangle();
        r.a=9;r.b=15;
        r.printArea();
        Triangle t = new Triangle();
        t.a=6;t.b=9;
        t.printArea();
    }
}

abstract class Shape{
    int a,b;
    public void printArea(){};
}

class Rectangle extends Shape{
    public void printArea(){
        System.out.println(a*b);
    }
}

class Triangle extends Shape{
    public void printArea(){
        System.out.println(a*b*0.5);
    }
}

class Circle extends Shape{
    public void printArea(){
        System.out.println(Math.PI*a*b);
    }
}
