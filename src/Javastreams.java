import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class Javastreams {
	
	public void regular()
	{
	
	

		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijith");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for(int i = 0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("D"));
			{
				count++;
			}
		}
		System.out.println(count);
		
		}

	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijith");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		long d = Stream.of("Abhijith","Don","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
		    return false;
		}).count();
		System.out.println(d);
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
@Test
public void StreamMaps()
{
	ArrayList<String> names = new ArrayList<String>();
	names.add("man");
	names.add("Don");
	names.add("women");
	Stream.of("Abhijith","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	List<String> names1 = Arrays.asList("Abhijith","Don","Alekhya","Adam","Rama");
	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEachOrdered(s->System.out.println());
	Stream<String> newStream = Streams.concat(names.stream(), names1.stream());
	boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
	System.out.print(flag);
	Assert.assertTrue(flag);

}

@Test
public void streamCollect()
{
	List<String> ls= Stream.of("Abhijith","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls.get(0));
	List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
	values.stream().distinct().sorted().forEach(s->System.out.println(s));
}
}
	

	



