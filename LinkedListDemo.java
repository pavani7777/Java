import java.util.*;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
     LinkedList<Integer> obj=new LinkedList<Integer>();
	Integer iobj1=new Integer(101);
	Integer iobj2=new Integer(102);
	Integer iobj3=new Integer(103);
	Integer iobj4=new Integer(104);
	System.out.println("Size of TreeSet is:"+ obj.size());
	obj.add(iobj1);
	obj.add(iobj2);
	obj.add(iobj3);
	obj.add(iobj4);
	obj.add(iobj1);
	System.out.println("\nLinkedList after adding the objects:"+obj);
	System.out.println("Size of LinkedList after adding objects:"+obj.size());
	obj.remove(iobj3);
	obj.remove(iobj1);

	System.out.println("\nLinkedList after removing the object:"+obj);
	System.out.println("\nSize of LinkedList after removing object:"+obj.size());
	System.out.println("\nThe final LinkedList: ");
	ListIterator i=obj.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	}
}