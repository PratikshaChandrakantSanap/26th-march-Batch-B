package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
v.add("velocity");
v.add(344);
v.add('B');
v.add(null);
v.add(null);
v.add(3.4);
System.out.println(v);
System.out.println("=======");

for(int i = 0;i<=v.size()-1;i++)
{
System.out.println(v.get(i));	
	}
System.out.println("==-=");
//using iterator
Iterator it = v.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
System.out.println("======");
//using list iterator
ListIterator lst = v.listIterator();
while(lst.hasNext())
{
	System.out.println(lst.next());
	}
System.out.println("=============");

Enumeration ele = v.elements();
while(ele.hasMoreElements())
{
System.out.println(ele.nextElement());	
}
System.out.println("====");

for(Object z:v)
{
	System.out.println(z);
}
	};

}
