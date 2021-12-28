public class multilevelinheritance {
    public static void main(String[] args) {
        student s = new student();
        s.GainEducation();
        s.puntuality();
        teacher t = new teacher();
        t.manageDisipline();
        smvdu sb = new smvdu();
        sb.manageDisipline();
    }
}

class smvdu{
    public void manageDisipline(){
        System.out.println("Common Functions to maintain discipline in smvdu grand parent class");
    }
}

class teacher extends smvdu{
    public void puntuality(){
        System.out.println("A human being should be puntual.");
    }
}

class student extends teacher{
    public void GainEducation(){
        System.out.println("Student should be ready to gain education.");
    }
}