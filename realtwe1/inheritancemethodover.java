public class inheritancemethodover {
    public static void main(String[] args) {
        parent p = new parent();
        p.age(40);
        child c = new child();
        c.age(20);
    }
}

class parent{
    public void age(int age){
        System.out.println("Age of Father is "+age+" year");
    }
}

class child extends parent{
    @Override
    public void age(int age){
        System.out.println("Age of Child is "+age+" year");
    }
}