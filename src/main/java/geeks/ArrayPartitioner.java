package geeks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class ArrayPartitioner
{

	private final int[] arr;

	public ArrayPartitioner(int[] arr)
	{
		if (arr == null)
		{
			throw new IllegalArgumentException("array parameter is NULL");
		}
		this.arr = arr;
	}

	@SuppressWarnings("serial")
	public List<List<Integer>> partition()
	{

		final Queue<SubTask> workingQueue = new LinkedList<SubTask>();

		workingQueue.add(SubTask.createAddedToFirst(arr[0]));
		workingQueue.add(SubTask.createAddedToSecond(arr[0]));

		final Queue<SubTask> oneStepQueue = new LinkedList<SubTask>();

		for (int i = 1; i < arr.length; i++)
		{

			int value = arr[i];

			while (!workingQueue.isEmpty())
			{
				SubTask task = workingQueue.poll();
				System.out.println("Adding value to 1st:" + value);
				oneStepQueue.add(task.addToFirst(value));
				System.out.println("Adding value to 2nd:" + value);
				oneStepQueue.add(task.addToSecond(value));
			}

			workingQueue.addAll(oneStepQueue);
			oneStepQueue.clear();
		}

		for (final SubTask task : workingQueue)
		{

			if (task.isAverageSame())
			{
				return new ArrayList<List<Integer>>()
				{
					{
						add(task.first);
						add(task.second);
					}
				};
			}
		}

		return createEmptyResult();
	}

	@SuppressWarnings("serial")
	private List<List<Integer>> createEmptyResult()
	{
		return new ArrayList<List<Integer>>()
		{
			{
				add(new ArrayList<Integer>());
				add(new ArrayList<Integer>());
			}
		};
	}

	// === NESTED ====

	static class SubTask
	{

		SubTask()
		{
			super();
		}

		SubTask(List<Integer> first, List<Integer> second, int firstSum, int secondSum)
		{
			this();
			this.first = first;
			this.second = second;
			this.firstSum = firstSum;
			this.secondSum = secondSum;
		}

		List<Integer> first = new ArrayList<Integer>();
		List<Integer> second = new ArrayList<Integer>();

		int firstSum = 0;
		int secondSum = 0;

		double getAverage(boolean useFirst)
		{

			if (useFirst)
			{
				if (first.size() == 0)
				{
					return 0;
				}

				return ((double) firstSum) / first.size();
			}

			if (second.size() == 0)
			{
				return 0;
			}

			return ((double) secondSum) / second.size();
		}

		boolean isAverageSame()
		{
			return Double.compare(getAverage(true), getAverage(false)) == 0;
		}

		SubTask addToFirst(int value)
		{
			List<Integer> firstCopy = new ArrayList<Integer>(first);
			firstCopy.add(value);
			System.out.println("1st Copy:" + firstCopy);
			System.out.println("2nd Copy:" + second);
			return new SubTask(firstCopy, new ArrayList<Integer>(second), firstSum + value, secondSum);

		}

		SubTask addToSecond(int value)
		{
			List<Integer> secondCopy = new ArrayList<Integer>(second);
			secondCopy.add(value);
			System.out.println("1st Copy:" + first);
			System.out.println("2nd Copy:" + secondCopy);
			return new SubTask(new ArrayList<Integer>(first), secondCopy, firstSum, secondSum + value);
		}

		static SubTask createAddedToFirst(int value)
		{
			return new SubTask().addToFirst(value);
		}

		static SubTask createAddedToSecond(int value)
		{
			return new SubTask().addToSecond(value);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 2 };
		ArrayPartitioner ap = new ArrayPartitioner(a);
		List<List<Integer>> pr = ap.partition();
		System.out.println(pr);

	}

}
