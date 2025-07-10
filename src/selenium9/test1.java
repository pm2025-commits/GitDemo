package selenium9;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class test1 {
    @Test
	public void regular()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("abhijit");
		names.add("aman");
		names.add("shweta");
		names.add("anky");
		names.add("rupa");
		
		int count =0;
		for(int i =0;i<names.size();i++)
		{
			String actual= names.get(i);
			if(actual.startsWith("a"))
			{
				count++;
			}
		}
		System.out.println(count);
		System.out.println("-----------------");
	}
    
    @Test
    public void streamFilter()
    {
    	ArrayList<String> names= new ArrayList<String>();
		names.add("abhijit");
		names.add("aman");
		names.add("shweta");
		names.add("anky");
		names.add("rupa");
		
		Long c=names.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		System.out.println("--------end---------");
		
		names.stream();
		Long d=Stream.of("abhijit","don","alekhy","adam","ram").filter(s->
		{s.startsWith("a");
			return true;
		}).count();
		System.out.println(d);
		System.out.println("--------start---------");
		//System.out.println(c);
		//print all the names of arraylist	
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("--------ga---------");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		System.out.println("--------aa---------");
    }
    @Test
    public void streamMap()
    {
    	ArrayList<String> names = new ArrayList<String>();
    	names.add("man");
    	names.add("don");
    	names.add("women");
    	
    	//print names which have last letters as 'a' with uppercase
    	Stream.of("abhijit","dona","alekhy","adam","rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
    	.forEach(s->System.out.println(s));
    	System.out.println("-----------------");
    	
    	//print names which have last letters as 'a' with uppercase and sorted
    	List<String> names1=Arrays.asList("abhijit","dona","alekhy","adam","rama");
    	names1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
       	System.out.println("-----------------");
       	
    	//mergimg 2 diffferent lists
    	Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
    	
    	//newStream.sorted().forEach(s->System.out.println(s));
    	boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("ad21qam"));
    	//System.out.println(flag);
    	//Assert.assertTrue(flag);
    	System.out.println("-----------------");
    	
    }
    @Test
    public void streamCollect()
    {
    	List<String> li=Stream.of("abhijit","dona","alekhy","adam","rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
    			.collect(Collectors.toList());
    	System.out.println(li.get(0));
    	
    	/*famoues interview questions
    	
    	sort the array - 3rd index - 1,2,3,5,7,9
    	values.stream().distinct().foreach(s->System.out.println(s));
    	*/
    	List<Integer> values= Arrays.asList(3,2,2,7,5,1,9,7);
    	List<Integer> li1=values.stream().distinct().sorted().collect(Collectors.toList());
    	System.out.println(li1.get(2));
    	
    }
	public static void main(String[] args) {
		
      test1 a = new test1();
      a.regular();
      a.streamFilter();
      a.streamMap();
      a.streamCollect();
      
	}

}
