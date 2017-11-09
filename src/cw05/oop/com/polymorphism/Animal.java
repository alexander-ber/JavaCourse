package cw05.oop.com.polymorphism;

public class Animal {
	private String voice;

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public void saySomething() {
		System.out.println(voice);
	}
	

}
