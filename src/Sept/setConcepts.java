package Sept;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class setConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//treeSet();
		//hashSet();
		//linkedHashSet();
		//arrayList();
		//List<Integer> sint = new ArrayList<Integer>();
		List<Integer> lint = new ArrayList<Integer>();
		lint.add(33);
		lint.add(45);
		lint.add(45);
		lint.add(null);
		lint.add(null);
		System.out.println(lint);
		for (int i = 0; i<=lint.size(); i++)
		{
			System.out.println(lint.get(i));
		}
	  //  sint.add(89);
	    //sint.add(45);
	    //sint.add(67);
	    //sint.set(1,1);
	    //System.out.println(sint);
	

	}
public static void treeSet()
{
	Set <Integer> si = new TreeSet<Integer>();
	si.add(56);
	si.add(67);
	//si.add(null);//null is not accepted in tree set
	//si.add(null);//null is not accepted in tree set
	si.add(67); // duplicate values are accepted in tree set
	System.out.println(si);
}
public static void hashSet()
{
	Set <Integer> hs = new HashSet<Integer>();
	hs.add(78);// duplicate is allowed
	hs.add(78);
	hs.add(87);
	hs.add(null);//null value is allowed
	hs.add(null);
	System.out.println(hs);
}

public static void linkedHashSet()
{
	Set <String> lhs = new LinkedHashSet();
	lhs.add(null); // multiple null value accepted
	lhs.add(null);// null value accepted
	lhs.add("Aarthi");
	lhs.add("Vini");
	lhs.add("Visi");	
	lhs.add("Raj");
	lhs.add("Raj");// duplicate string value accepted
	System.out.println(lhs);
}

}


