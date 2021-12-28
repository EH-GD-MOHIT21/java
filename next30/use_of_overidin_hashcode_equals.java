import java.io.*;
import java.util.*;

class Cosmic
{
	
	String name;
	int id;
	
	Cosmic(String name, int id)
	{
		
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
	// if both the object references are
	// referring to the same object.
	if(this == obj)
			return true;
		
		// it checks if the argument is of the
		// type Cosmic by comparing the classes
		// of the passed argument and this object.
		// if(!(obj instanceof Cosmic)) return false; ---> avoid.
		if(obj == null || obj.getClass()!= this.getClass())
			return false;
		
		// type casting of the argument.
		Cosmic Cosmic = (Cosmic) obj;
		
		// comparing the state of argument with
		// the state of 'this' Object.
		return (Cosmic.name.equals(this.name) && Cosmic.id == this.id);
	}
	
	@Override
	public int hashCode()
	{
		
		// We are returning the Cosmic_id
		// as a hashcode value.
		// we can also return some
		// other calculated value or may
		// be memory address of the
		// Object on which it is invoked.
		// it depends on how you implement
		// hashCode() method.
		return this.id;
	}
	
}

// Driver code
class use_of_overidin_hashcode_equals
{
	public static void main (String[] args)
	{
		
		// creating two Objects with
		// same state
		Cosmic g1 = new Cosmic("aditya", 1);
		Cosmic g2 = new Cosmic("aditya", 1);
		
		Map<Cosmic, String> map = new HashMap<Cosmic, String>();
		map.put(g1, "CSE");
		map.put(g2, "IT");
		
		for(Cosmic Cosmic : map.keySet())
		{
			System.out.println(map.get(Cosmic).toString());
		}

	}
}
  