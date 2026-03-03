package geeks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapEx
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("a", 10);
		mp.put("a", 11);
		mp.put("a", 12);
		mp.put("b", 13);
		mp.put("c", 14);
		mp.put("e", 15);
		// List<Integer> list = new ArrayList<Integer>();
		// System.out.print( mp.values());
		Set set = mp.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext())
		{
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + "-->");
			System.out.print(me.getValue());
			System.out.println(mp.get(me.getKey()));
			// list.add( mp.get(me.getKey()));
			// System.out.println(list);

		}

	}
}
