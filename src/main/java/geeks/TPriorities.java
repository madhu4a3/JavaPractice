package geeks;

class NThread implements Runnable
{

	Thread t;
	String name;
	private volatile boolean running = true;
	int count = 0;

	NThread(int p)
	{

		t = new Thread(this);
		t.setPriority(p);

	}


	public void run()
	{
		// TODO Auto-generated method stub
		while (running)
		{
			count++;
		}
	}

	public void start()
	{
		t.start();
	}

	public void stop()
	{
		running = false;
	}
}

public class TPriorities
{
	public static void main(String[] a)
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		NThread hi = new NThread(Thread.NORM_PRIORITY + 2);
		NThread lo = new NThread(Thread.NORM_PRIORITY + 2);
		lo.start();
		hi.start();
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException ie)
		{
			System.out.print("Thread Intrrupted");
		}
		hi.stop();
		lo.stop();
		System.out.println("Count of High priority thread:" + hi.count);
		System.out.println("Count of Low priority thread:" + lo.count);
		if (hi.count > lo.count)
		{
			System.out.println("Priority worked");
		}
	}

}
