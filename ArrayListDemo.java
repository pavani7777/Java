import java.util.*;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> obj=new ArrayList<String>();
	String sobj1=new String("Element 1");
	String sobj2=new String("Element 2");
	String sobj3=new String("Element 3");
	String sobj4=new String("Element 4");
	System.out.println("Size of TreeSet is:"+ obj.size());
	obj.add(sobj1);
	obj.add(sobj2);
	obj.add(sobj3);
	obj.add(sobj4);
	obj.add(sobj1);
	System.out.println("\nArrayList after adding the objects:"+obj);
	System.out.println("Size of ArrayList after adding objects:"+obj.size());
	obj.remove(sobj3);
	obj.remove(sobj1);

	System.out.println("\nArrayList after removing the object:"+obj);
	System.out.println("\nSize of ArrayList after removing object:"+obj.size());
	System.out.println("\nThe final ArrayList: ");
	Iterator i=obj.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	}
}