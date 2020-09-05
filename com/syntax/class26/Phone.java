package com.syntax.class26;
public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone makes call");
	}
	
	public void sendText() {
		System.out.println("Phone can send text");
	}
	
	public abstract void navigate();
	
	public abstract void playMusic();
	
	//public abstract void takePicture();
}

class Samsung extends Phone {
	
	public void navigate() {
		System.out.println("Samsung navigates...");
	}
	
	public void playMusic() {
		System.out.println("Samsung plays music from google store");
	}
}

class IPhone extends Phone{
	
	public void navigate() {
		System.out.println("iPhone navigates gps from google apple store");
	}
	
	public void playMusic() {
		System.out.println("iPhone plays music in apple store");
	}
}