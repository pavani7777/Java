import java.util.*;

public class VectorDemo
{
	public static void main(String[] args)
	{
		Vector<Double> obj=new Vector<Double>();
	Double dobj1=new Double(77.5);
	Double dobj2=new Double(68.1);
	Double dobj3=new Double(52.8);
	Double dobj4=new Double(40.2);
	System.out.println("Size of Vector is:"+ obj.size());
	obj.add(dobj1);
	obj.add(dobj2);
	obj.add(dobj3);
	obj.add(dobj4);
	obj.add(dobj1);
	System.out.println("\nVector after adding the objects:"+obj);
	System.out.println("Size of Vector after adding objects:"+obj.size());
	obj.remove(dobj1);
	obj.remove(dobj3);

	System.out.println("\nVector after removing the object:"+obj);
	System.out.println("\nSize of Vector after removing object:"+obj.size());
	System.out.println("\nThe final Vector: ");
	Iterator i=obj.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	}
}