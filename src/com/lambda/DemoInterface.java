package com.lambda;

interface Phone{
	void call();
	//In java 8 we can define method inside interface using default keyword
	default void message() {
		System.out.println("Sent");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		System.out.println("Calling");
	}
}

public class DemoInterface {
	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}
}
