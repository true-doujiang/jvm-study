package org.fenixsoft.polymorphic;

/**
 * @author yhh
 *
 */
 interface MyInterface{
	public void interfaceMethod();
}
 class Parent{
	public void parentMethod(){
		System.out.println("parent Method use invokespecial");
	}
}

public class StaticDispatch  extends Parent  implements MyInterface{
	
	static abstract class Human{}
	static class Man extends Human{}
	static class Woman extends Human{}
	
	public void sayHello(Human guy){
		System.out.println("hello guy!");
	}
	public void sayHello(Man guy){
		System.out.println("hello gentleman!");
	}
	public void sayHello(Woman guy){
		System.out.println("hello lady!");
	}
	private void myMethod(){
		System.out.println("private Method use invokespecial");
	}
	@Override
	public void interfaceMethod() {
		System.out.println("interface Method use invokeinterface");
	}
	
	public static void main(String[] args) {
		Human man = new  Man();
		Human woman = new Woman();
		StaticDispatch sr = new StaticDispatch();
		
		sr.sayHello(man);
		sr.sayHello(woman);
		
		sr.sayHello((Man)man);
		sr.sayHello((Woman)woman);
		
		sr.parentMethod();
		sr.myMethod();
		sr.interfaceMethod();
	}
}
