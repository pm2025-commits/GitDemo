package collectionframework;

import java.util.ArrayList;

public class arrayllist {

	public static void main(String[] args) {
		//can accept duplicate values
		//Arraylist,linkedlist , vector :-implementing list interface
		//array have fixed size  where sas arraylist can grow dynamically
		//you can access & insert any value in any index
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rhul");
		a.add("ket");
		System.out.println(a);
        a.add(0, "student");
        System.out.println(a);
//        a.remove(1);
//        System.out.println(a);
//        a.remove("ket");
//        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.contains("testing"));
        System.out.println(a.indexOf("Rhul"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
	}

}
