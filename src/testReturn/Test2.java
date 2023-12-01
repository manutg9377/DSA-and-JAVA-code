//race condition will occure if two thread shared same variables it can be eradicated by using synchronized keyword

package testReturn;

public class Test2 {
	public static void main(String args[]) throws InterruptedException {
		
		Counter c = new Counter();
		
		Runnable call = () -> {
			for (int i = 0; i < 10000; i++) {
				c.increment();
			}

		};
  
		Runnable call2 = () -> {
			for (int i = 0; i < 10000; i++) {
				c.increment();
			}
		};

		Thread t1 = new Thread(call);
		Thread t2 = new Thread(call2);
		

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);
		
	}
}