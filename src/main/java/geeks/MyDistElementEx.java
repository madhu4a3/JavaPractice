package geeks;
import java.util.Comparator;
import java.util.TreeSet;


public class MyDistElementEx
{

	public static void main(String a[])
	{

		TreeSet<Price> lhm = new TreeSet<Price>();
		lhm.add(new Price("Banana", 20));
		lhm.add(new Price("Apple", 40));
		lhm.add(new Price("Orange", 30));
		for (Price pr : lhm)
		{
			System.out.println(pr);
		}
		Price duplicate = new Price("Banana", 20);
		System.out.println("inserting duplicate object...");
		lhm.add(duplicate);

		System.out.println("After insertion:");
		for (Price pr : lhm)
		{
			System.out.println(pr);
		}
	}

	static class Compr implements Comparator<Price>
	{

		public int compare(Price p1, Price p2)
		{
			// TODO Auto-generated method stub
			return p1.getItem().compareTo(p2.getItem());
		}

	}
}

class Price implements Comparable<Price>
{

	private String item;
	private int price;

	public Price(String itm, int pr)
	{
		this.item = itm;
		this.price = pr;
	}

	@Override
	public int hashCode()
	{
		System.out.println("In hashcode");
		return item.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("In equals");
		if (obj instanceof Price)
		{
			Price pp = (Price) obj;
			return (pp.item.equals(this.item) && pp.price == this.price);
		}
		else
		{
			return false;
		}
	}

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


	public int compareTo(Price p)
	{
		// TODO Auto-generated method stub
		return this.getItem().compareTo(p.getItem());
	}
}
