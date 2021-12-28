import java.util.*;
public class constructoroverloadride {  
    //instance variables of the class  
    int id;  
    String name;  
      
    constructoroverloadride(){  
    System.out.println("this a default constructor");  
    }  
      
    constructoroverloadride(int i, String n){  
    id = i;  
    name = n;  
    }  
      
    public static void main(String[] args) {  
    //object creation  
    constructoroverloadride s = new constructoroverloadride();  
    System.out.println("\nDefault Constructor values: \n");  
    System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
      
    System.out.println("\nParameterized Constructor values: \n");  
    constructoroverloadride student = new constructoroverloadride(10, "David");  
    System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
    }  
    }