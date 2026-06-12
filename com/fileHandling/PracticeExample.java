package com.fileHandling;

 interface Camera{
	void takePhoto();
}
interface Phone{
	void receiveCall();
}
 interface MusicPlayer{
	void playMusic();
}
class SmartPhoe implements Camera,Phone,MusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("playMusic..........");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("receiveCall.........");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("takePhoto..........");
		
	}
	
}
public class PracticeExample {

	public static void main(String[] args) {
		SmartPhoe sm=new SmartPhoe();
		sm.takePhoto();
		sm.playMusic();
		sm.receiveCall();
	}

	
}
