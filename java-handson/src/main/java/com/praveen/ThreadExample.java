package com.praveen;

import java.util.Date;

/**
 * This class explain thread.
 * 
 * @author PRAVEEN
 *
 */
class ThreadExample extends Thread {
	public void run() {
		Thread t = Thread.currentThread();

		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(t.getName() + " at " + new Date());
			System.out.println(i);
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		ThreadExample t3 = new ThreadExample();
		t1.setName("Hello");
		t1.start();
		try {
			t1.join(500);
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}