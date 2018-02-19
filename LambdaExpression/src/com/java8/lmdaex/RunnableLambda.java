package com.java8.lmdaex;

public class RunnableLambda {

	public static void main(String[] args) {
		/*
		 * Runnable Interface
		 * 
		 * 
		 */
		
		Runnable runnableLambda = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("Lmda1 => "+i);
			}
		};
		
		Runnable runnableLambda2 = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("Lmda2 => "+i);
			}
		};

		Thread t1=new Thread(runnableLambda);
		Thread t2=new Thread(runnableLambda2);
		t1.start();
		t2.start();
	}
	
}
