package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List_Study {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("velocity");
		a.add('A');
		a.add(123);
		a.add(12.5f);
		a.add(true);
		a.add(null);
		a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(123));
		System.out.println(a.contains(12));
		System.out.println(a.get(1));
		System.out.println(a.indexOf(null));
		System.out.println(a.indexOf(true));
		System.out.println(a.lastIndexOf(null));
		System.out.println("======");
		
		
		for(int i = 0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("===");
		//using iterator
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====");
		//using listiterator
		ListIterator ltr = a.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("====");
		for(Object P:a)
		{
			System.out.println(P);
		}
		

	}

}
