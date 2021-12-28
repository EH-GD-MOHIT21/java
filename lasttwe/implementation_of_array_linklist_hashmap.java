import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class implementation_of_array_linklist_hashmap {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Jane");
        names.add("Thomas");
        names.add("Robin");
        names.add("David");
        names.add("Becky");
        
        System.out.println(names);    
        names.set(1, "Tom");
        System.out.println(names);         

        System.out.format("There are %d elements in the collection%n",
                names.size());

        names.remove(1);
        System.out.format("There are %d elements in the collection%n",
                names.size());            
        
        System.out.println(names.get(3));
        
        System.out.println("****");

        Iterator<String> it = names.iterator();
        
        while (it.hasNext()) {
            
            System.out.println(it.next());
        }   
        LinkedList<Integer> nums = new LinkedList<>();
        
        nums.add(5);
        nums.add(10);
        nums.add(13);
        nums.add(12);
        nums.add(15);
        nums.add(23);
        
        System.out.println(nums);
        
        nums.removeFirst();
        nums.removeLast();
        nums.addFirst(17);
        nums.addLast(77);
        
        System.out.println(nums);    
Map<String, String> domains = new HashMap<>();

        domains.put("de", "Germany");
        domains.put("sk", "Slovakia");
        domains.put("us", "United States");
        domains.put("ru", "Russia");
        domains.put("hu", "Hungary");
        domains.put("pl", "Poland");    
        
        System.out.println(domains.get("pl"));
        
        for (String item : domains.values()) {
            
            System.out.println(item);
        }        
        
        Set keys = domains.keySet();
        
        System.out.println(keys);     
    }
}
