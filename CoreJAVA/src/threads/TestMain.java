package threads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		List<Future<String>> futureList = new ArrayList<>();
		Set<Callable<String>> callableList = new HashSet<>();
		
        for(int i=0; i< 30; i++){
        	MyCallable<String> callable = new MyCallable<>("Thread : " + i + " ");
        	callableList.add(callable);
        }

        futureList = executor.invokeAll(callableList);
        
        while (true) {
        	int i = 0;
        	for (Future<String> future : futureList) {
				if(future.isDone()) {
					System.out.println(future.get());
					i++;
				} 
			}
        	System.out.println("=====================================================================");
        	if(i==30) {
        		break;
        	}
        }
        
        executor.shutdownNow();
	}
}