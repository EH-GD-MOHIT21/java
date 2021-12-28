import java.util.*;

class Student {
   String name;
   int id;
   int rollNo;

   Student(String name, int id, int rollNo) {
      this.name = name;
      this.rollNo = rollNo;
      this.id = id;
   }
}

public class ARRAY_OF_object_at_runtime {
   public static void main(String[] args) {
      Student s1 = new Student("Deep", 1234, 4);
      Student s2 = new Student("Shubh", 4321, 20);
      Student s3 = new Student("Riddhi", 1212, 2);

      ArrayList<Student> studentlist = new ArrayList<Student>();

      studentlist.add(s1);
      studentlist.add(s2);
      studentlist.add(s3);

      System.out.println(studentlist);
   }
}
