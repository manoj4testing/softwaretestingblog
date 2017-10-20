package com.java.PGM_friends;

import java.util.Date;

public class KalkiChangeTimeEveryMinute extends Thread{

	public Thread executeThread(String name){
		Thread t = new Thread(this,name);
		t.start();
		return t;
	}
	public void run(){
		
		try{
			while (true) {
				System.out.println("Time: "+new Date());
				Thread.sleep(1000);
			}
		}
		
		catch(Exception e){
			
		}
	}
	
	public static void main(String[] args) {
		KalkiChangeTimeEveryMinute timeChange = new KalkiChangeTimeEveryMinute();
		timeChange.executeThread("Thread1");
		//timeChange.executeThread("Thread2");
	}
}