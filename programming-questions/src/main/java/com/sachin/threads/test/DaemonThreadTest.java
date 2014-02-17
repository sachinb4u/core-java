package com.sachin.threads.test;


/**
 * When you call a thread.start() on a already running thread object 
 * it throws IllegalThreadStateException when thread is in running state.
 * 
 * When t1 is has not completed its execution then main thread which has spawned t1
 * it will block
 * @author sbhosale
 *
 */
public class DaemonThreadTest {

	public static void main(String[] args) {

		daemonTest();
	}

	
	private static void daemonTest(){
		Thread t1 = new Thread("T1"){
			@Override
			public void run() {

				while(true){
					System.out.println("Executing Thread : " + Thread.currentThread().getName());
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		t1.setDaemon(true);
		t1.start();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("*** Exiting Thread : " + Thread.currentThread().getName());
	}
}
