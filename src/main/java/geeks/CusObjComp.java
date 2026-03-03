package geeks;

import java.util.ArrayList;
import java.util.Comparator;


public class CusObjComp
{

	public static void main(String a[])
	{

		ArrayList<Fruits> lhm = new ArrayList<Fruits>();
		lhm.add(new Fruits("Banana", 20));
		lhm.add(new Fruits("Apple", 40));
		lhm.add(new Fruits("Orange", 30));

		System.out.println("After Sorting:");
		for (Fruits pr : lhm)
		{
			System.out.println(pr);
		}
	}

	static class Compr implements Comparator<Fruits>
	{

		
		public int compare(Fruits p1, Fruits p2)
		{
			// TODO Auto-generated method stub
			return p1.getPrice() > p2.getPrice() ? 1 : (p1.getPrice() < p2.getPrice() ? -1 : 0);
		}

	}
}

class Fruits implements Comparable<Fruits>
{

	private String item;
	private int price;

	public Fruits(String itm, int pr)
	{
		this.item = itm;
		this.price = pr;
	}

	/*
	 * public int hashCode(){ System.out.println("In hashcode"); return
	 * item.hashCode(); } public boolean equals(Object obj){
	 * System.out.println("In equals"); if (obj instanceof Price) { Price pp =
	 * (Price) obj; return (pp.item.equals(this.item) && pp.price ==
	 * this.price); } else { return false; } }
	 */

	public String getItem()
	{
		return item;
	}

	public void setItem(String item)
	{
		this.item = item;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "item: " + item + "  price: " + price;
	}

	
	public int compareTo(Fruits p)
	{
		// TODO Auto-generated method stub
		return this.getPrice() > p.getPrice() ? 1 : (this.getPrice() < p.getPrice() ? -1 : 0);
	}
}
