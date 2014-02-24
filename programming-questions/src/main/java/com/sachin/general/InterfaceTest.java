package com.sachin.general;

public class InterfaceTest {
	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.sayHello("Sachin");
	}
}

class Derived extends Contract2 implements Contract1{

	public void sayHello(String name) {
		super.sayHello(name);
		System.out.println( "Hello from derived : " + name);
	}
	
}

interface Contract1{
	void sayHello(String name);
}

class Contract2{
	void sayHello(String name){
		System.out.println("Hello from Contract2 " + name);
	}
}