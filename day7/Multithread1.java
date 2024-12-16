

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

public class Multithread1 {

	public static void main(String[] args) {
		
		Mythread ref = new Mythread();
		ref.setName("gokul");
		ref.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			
		}
		//ref.suspend();		suspend is not accessable in this version.
		ref.j
		System.out.println("main ends");
	}

}

