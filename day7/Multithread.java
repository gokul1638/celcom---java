package com.day7;

class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Multithread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);

		System.out.println(t.getPriority());
		System.out.println(t.getName());
		System.out.println(t.getState());
		
		Mythread ref = new Mythread();
		ref.setName("gokul");
		ref.start();
		
		Mythread rf = new Mythread();
		rf.setName("gokul1");
		rf.start();
		
		
		System.out.println("main ends");
	}

}
