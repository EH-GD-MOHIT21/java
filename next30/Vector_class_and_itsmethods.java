import java.util.Vector;
class Vector_class_and_itsmethods
{
 public static void main( String args[] )
 {
  Vector v = new Vector();
 
  v.addElement(" Coding Atharva "); 
  v.add(007); 
 
  System.out.println(" Capacity= "+v.capacity() );
 
  System.out.println(" Contains= "+v.contains(007) );
   
  System.out.println(" Element At 0= "+v.elementAt(0) );
 
  System.out.println(" Element At 0= "+v.elementAt(0) );  
  
  System.out.println(" Enumeration of Components = "+v.elements() );  
   
  System.out.println(" First Element = "+v.firstElement() );  
   
  System.out.println(" Last Elements = "+v.lastElement() );  
   
  System.out.println(" Index Of = "+v.indexOf(007) );  
   
  v.insertElementAt(1,0);      
  System.out.println(" Elements After Inserting = "+v );
 
  v.removeElementAt(0); 
  System.out.println(" Elements After Removing = "+v );
     
  System.out.println(" Remove Element = "+v.removeElement(007) );  
  System.out.println(" Elements After Removing = "+v );
 
  System.out.println(" Size = "+v.size() );
   
  Object obj[] = new Object[10];
  v.copyInto(obj); 
        
  v.clear(); // Removes all elements
  System.out.println(" Elements After Clearing = "+v );
   
 }
 
}
