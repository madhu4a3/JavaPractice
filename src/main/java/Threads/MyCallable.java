package Threads;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
public class MyCallable implements Callable<String> {
 
	String name;
	
	public MyCallable(String a){
		name = a;
	}
   
    public String call() throws Exception {
        Thread.sleep(1000);
        //return the thread name executing this callable task
        return name;
    }
     
    public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        //Create MyCallable instance
        Callable<String> callable1 = new MyCallable("Madhu");
        Callable<String> callable2 = new MyCallable("kiran");
        Callable<String> callable3 = new MyCallable("Sanka");
        Callable<String> callable4 = new MyCallable("Hello");
        Callable<String> callable5 = new MyCallable("Morning");
        Callable<String> callable6 = new MyCallable("Raga");
        Callable<String> callable7 = new MyCallable("Tune");
       // for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable1);
            //add Future to the list, we can get return value using Future
            list.add(future);
            Future<String> future1 = executor.submit(callable2);
            list.add(future1);
            Future<String> future2 = executor.submit(callable3);
            list.add(future2);
            Future<String> future3 = executor.submit(callable4);
            list.add(future3);
            Future<String> future4 = executor.submit(callable5);
            list.add(future4);
            Future<String> future5 = executor.submit(callable6);
            list.add(future5);
            Future<String> future6 = executor.submit(callable7);
            list.add(future6);
        //}
        for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
    }
 
}