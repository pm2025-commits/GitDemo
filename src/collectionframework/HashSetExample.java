package collectionframework;

//hashset, linkedlist ,linedlist implement set interface
//does not accept duplicate values
//there is not gurantee element stored in seqential order :-random
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("USA");
		hs.add("Uk");
		hs.add("India");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
	//	System.out.println(hs.remove("Uk"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		System.out.println("-----------------");
		Iterator<String> i= hs.iterator();
	/*	System.out.println(i.next());
		System.out.println(i.next());
	*/
		System.out.println("-----------------");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
