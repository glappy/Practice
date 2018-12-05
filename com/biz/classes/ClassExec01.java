package com.biz.classes;

public class ClassExec01 {

	public static void main(String[] args) {

		MyClass01 m = new MyClass01();
		m.show();

		MyClass02 m2 = new MyClass02();
		m2.push(10);
		m2.push(20);
		m2.push(30);
		m2.push(40);
		m2.push(50);
		m2.show();

		MyClass03 m3 = new MyClass03();
		m3.push(50);
		m3.push(60);
		m3.push(70);
		System.out.println(m3.show());

		
		MyClass04 m4 = new MyClass04();
		m4.push("10");
		m4.push("20");
		m4.push("30");
		System.out.println(m4.show());
		
		MyClass05 m5 = new MyClass05();
		m5.push("1");
		m5.push("2");
		m5.push("3");
		System.out.println(m5.show());
		
		MyClass06 m6 = new MyClass06();
		m6.push(100);
		m6.push(200);
		m6.push(300);
		System.out.println(m6.show());
		
		MyClass07 m7 = new MyClass07();
		m7.insert("대한민국");
		System.out.println("=============");
		m7.show();
		
	}
}