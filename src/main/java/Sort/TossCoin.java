

package Sort;

import java.util.Random;


public class TossCoin
{

	int nofHeads;
	int noOfTails;

	public void doToss()
	{

		for (int i = 0; i < 10; i++)
		{
			boolean tResult = getTossResult();
			if (tResult)
				noOfTails += 1;
			else
				nofHeads += 1;
		}

	}

	public boolean getTossResult()
	{
		Random r = new Random();
		boolean res = r.nextBoolean();
		// System.out.println("result" + res);
		return res;
	}

	public static void main(String[] args)
	{
		TossCoin tc = new TossCoin();
		int noOfDays = 20;
		int avgHeads;
		int avgTails;
		for (int d = 1; d <= noOfDays; d++)
		{
			tc.doToss();
		}
		avgHeads = tc.nofHeads / noOfDays;
		avgTails = tc.noOfTails / noOfDays;
		System.out.println("Total no of heads for 20 days:" + tc.nofHeads + "\n total no.of tails for 20 days:" + tc.noOfTails + "\n Avg of Tails for 20 days: " + avgTails
				+ ",\n Avg of Heads for 20 days: " + avgHeads);
	}
}
