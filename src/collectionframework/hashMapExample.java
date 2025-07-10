package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm =new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "goddby");
		hm.put(2, "morning");
		hm.put(3, "eveming");
        System.out.println(hm.get(3));
        System.out.println(hm.remove(2));
        hm.get(2);
        System.out.println(hm);
        System.out.println("-------------------");
        Set s=hm.entrySet();
        Iterator it =s.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        	Map.Entry mp= (Map.Entry)it.next();
        	System.out.println(mp.getKey());
        	System.out.println(mp.getValue());
        }
        
	}

}
