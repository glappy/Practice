package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {
	List<String> strMyclass;
	List<Integer> intMyclass;

	public MyClass04() {
		strMyclass = new ArrayList();
		intMyclass = new ArrayList();
	}

	public void push(String strNum) {
		strMyclass.add(strNum);
	}

	public int show() {
		int myLen = strMyclass.size();

		for (int i = 0; i < myLen; i++) {
			intMyclass.add(Integer.valueOf(strMyclass.get(i)));
		}

		int intMul = 1;
		for (int j = 0; j < myLen; j++) {
			intMul *= intMyclass.get(j);
		}
		return intMul;

	}
}
