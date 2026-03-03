package geeks;

class NewThread implements Runnable
{
	Thread t;

	NewThread(String a)
	{
		t = new Thread(this, a);
		t.start();
	}

	
	public void run()
	{
		try
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println(t.getName()+": "+i);
				Thread.sleep(1000);

			}

		}

		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		finally
		{
			System.out.println("Returning to main thread ");
		}
		
	}

}

public class SimpleThread
{
	public static void main(String a[])
	{
		Thread.currentThread().setName("Main Thread");

		NewThread nt = new NewThread("ChildThread");

		try
		{

			for (int i = 0; i < 5; i++)
			{

				System.out.println(Thread.currentThread().getName() + ":" + i);

				Thread.sleep(1000);

			}

		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		finally
		{
			System.out.println("Returning to child thread");
		}
		

	}

}
