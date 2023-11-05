package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonDemo {
	public void testThread() {

		Callable<Void> callable1 = new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				getInstance1();
				return null;
			}
		};

		Callable<Void> callable2 = new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				getInstance2();
				return null;
			}
		};

		Callable<Void> callable3 = new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				getInstance3();
				return null;
			}
		};

		List<Callable<Void>> callables = new ArrayList<Callable<Void>>();
		callables.add(callable1);
		callables.add(callable2);
		callables.add(callable3);

		ExecutorService executor = Executors.newFixedThreadPool(3);

		try {
			executor.invokeAll(callables);
		} catch (InterruptedException ie) {
		}

	}

	private void getInstance1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(ThreadSafeSingleton.getInstance());
		}
	}

	private void getInstance2() {
		for (int i = 0; i < 10; i++) {
			System.out.println(ThreadSafeSingleton.getInstance());
		}
	}

	private void getInstance3() {
		for (int i = 0; i < 10; i++) {
			System.out.println(ThreadSafeSingleton.getInstance());
		}
	}

	public static void main(String args[]) {
		SingletonDemo s = new SingletonDemo();
		s.testThread();
	}
}
