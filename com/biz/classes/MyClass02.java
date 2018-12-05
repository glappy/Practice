package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {

	List<Integer> myClass;

	public MyClass02() {
		myClass = new ArrayList();
	}

	public void push(int intNum) {
		myClass.add(intNum);
	}

	public void show() {
		int intMul = 1;
		for (int i : myClass) {
			intMul *= i;

		}
		System.out.println(intMul);

	}
}