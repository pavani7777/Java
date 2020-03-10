import java.util.ArrayDeque;

public class ArrayDequeDemo
{
	public static void main(String[] args)
	{
		ArrayDeque<Double> obj=new ArrayDeque<Double>();
	Double dobj1=new Double(77.5);
	Double dobj2=new Double(68.1);
	Double dobj3=new Double(52.8);
	Double dobj4=new Double(40.2);
	System.out.println("Size of ArrayDeque is:"+ obj.size());
	obj.add(dobj1);
	obj.add(dobj2);
	System.out.println("\nArrayDeque after adding the objects:"+obj);
	System.out.println("Size of ArrayDeque after adding objects:"+obj.size());
	obj.addFirst(dobj3);
	obj.addFirst(dobj4);

	System.out.println("\nArrayDeque after adding  the object first and last:"+obj);
	System.out.println("\nSize of ArrayDeque after object first and last:"+obj.size());
	obj.removeFirst();	
	System.out.println("\nArrayDeque after removing the object first :"+obj);
	System.out.println("\nSize of ArrayDeque after removing object first :"+obj.size());

	}
}