package threads;

import java.util.concurrent.Callable;

public class MyCallable<T> implements Callable<T> {

	private String name ;

	public MyCallable() {
		super();
	}
	
	public MyCallable(String name) {
		super();
		this.name = name;
	}

	@Override
	public T call() throws Exception {
		Long value = 0L;
		for (int i = 0; i < 10000000; i++) {
			value += i ;
		}
		Thread.sleep(2000);
		return (T)(name + value);
	}

}
