package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass03 {
	List<Integer> myClass;
	
	
	public MyClass03() {
		myClass = new ArrayList();
	}

	public void push(int intNum) {
		myClass.add(intNum);
	}

	public int show() {
		int intMul = 1;
		for (int i : myClass) {
			intMul *= i;
		}
		return intMul;

	}
}