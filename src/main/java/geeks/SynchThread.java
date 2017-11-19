package geeks;
class SynClass
{
	public synchronized void display(String msg)
	{
		try
		{
			System.out.print("[" + msg);
			;
			Thread.sleep(1000);
		}
		catch (InterruptedException ie)
		{
			System.out.print("Thread Interrupted");
		}
		System.out.print("]");
	}
}

class SynTrd implements Runnable
{
	Thread t;
	SynClass sy;
	String tmsg, tn;

	SynTrd(SynClass syn, String imsg, String tname)
	{
		sy = syn;
		tmsg = imsg;
		tn = tname;
		t = new Thread(this, tn);
		t.start();
	}

	
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.print(t.getName() + " ");
		sy.display(tmsg);

	}
}

public class SynchThread
{
	public static void main(String[] a)
	{
		SynClass sc = new SynClass();
		SynTrd st1 = new SynTrd(sc, "hello", "T1");
		SynTrd st2 = new SynTrd(sc, "Synchronized", "T2");
		SynTrd st3 = new SynTrd(sc, "world", "T3");

		try
		{
			st1.t.join();
			st2.t.join();
			st3.t.join();
		}
		catch (InterruptedException ie)
		{
			System.out.print("Thread Interrupted");
		}
	}

}
