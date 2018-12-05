package com.biz.classes;

public class MyClass07 {
	String[] korea1;

	public void insert(String sNation) {

		korea1 = sNation.split("");
	}

	public void show() {

		String last = "";
	
		for (String s : korea1) {
			last += s + ",";
		}
	System.out.println(last + "-4글자");
	}
}
