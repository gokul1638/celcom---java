package com.day7;

class Mthread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}

public class Multithread2 {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		Mthread t1 = new Mthread();
		t1.setName("T1");
		t1.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		
		t1.join();
		System.out.println("main ends");

	}

}
