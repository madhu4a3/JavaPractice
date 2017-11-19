package geeks;

class Q
{
	int n;
	boolean valueSet = false;

	synchronized void get()
	{
		if (!valueSet)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{

			}
		}
		System.out.println("Got:" + n);
		valueSet = true;
		notify();
		return;
	}

	synchronized void put(int n)
	{

		if (valueSet)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{

			}
		}
		this.n = n;
		valueSet = false;

		System.out.println("Put:" + n);
		notify();

	}

}

class Producer implements Runnable
{
	Q q;

	Producer(Q q)
	{
		this.q = q;
		new Thread(this, "producer").start();
	}

	
	public void run()
	{
		// TODO Auto-generated method stub
		int i = 0;
		while (true)
		{
			q.put(i++);
		}

	}

}

class Consumer implements Runnable
{
	Q q;

	Consumer(Q q)
	{
		this.q = q;
		new Thread(this, "consumer").start();
	}

	public void run()
	{
		// TODO Auto-generated method stub
		while (true)
		{
			q.get();
		}

	}

}

public class Tlock
{
	public static void main(String[] a)
	{
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}

}
