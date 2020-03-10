import java.util.Hashtable;

public class HashTableDemo
{
	public static void main(String[] args)
	{
		Hashtable<Integer, Double> obj=new Hashtable<Integer, Double>();
	Double dobj1=new Double(77.5);
	Double dobj2=new Double(68.1);
	Double dobj3=new Double(52.8);
	Double dobj4=new Double(40.2);
	System.out.println("Size of Hashtable is:"+ obj.size());
	obj.put(55,dobj1);
	obj.put(60,dobj2);
	obj.put(65,dobj3);
	obj.put(70,dobj4);
	obj.put(75,dobj3);
	System.out.println("\nHashtable after adding the objects:"+obj);
	System.out.println("Size of Hashtable after adding objects:"+obj.size());
	obj.remove(65);
	obj.remove(75);

	System.out.println("\nHashtable after removing the object:"+obj);
	System.out.println("\nSize of Hashtable after removing object:"+obj.size());
	
	}
}