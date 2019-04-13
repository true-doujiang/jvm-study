package org.fenixsoft.clazz;

public class TestStringPool {
	
	public static void main(String[] args){
		String str = "abc" + new String("abc");
		System.out.println(str);
	}
}
