package geeks;

class Abc implements Runnable
{
	Thread t;
	String name;

	Abc(String tname)
	{
		name = tname;
		t = new Thread(this, name);
		System.out.println("I'm Running:" + t.getName());
		t.start();
	}

	public void run()
	{
		// TODO Auto-generated method stub

		try
		{
			for (int i = 5; i > 1; i--)
				System.out.println(name + ":" + i);
			Thread.sleep(1000);
		}
		catch (InterruptedException ie)
		{
			System.out.println("Thread is interrupted");
		}

		System.out.println(t.getName() + "ended");

	}
}

public class MultipleThreads
{
	public static void main(String args[])
	{
		System.out.println("Running in:" + Thread.currentThread().getName());
		Abc a = new Abc("Thread1");

		Abc b = new Abc("Thread2");

		Abc c = new Abc("Thread3");
		try
		{

			a.t.join();

			b.t.join();
			c.t.join();
		}
		catch (InterruptedException ie)
		{
			System.out.println("Thread is interrupted");
		}
		System.out.println("Main Thread is Ended");
	}

}
