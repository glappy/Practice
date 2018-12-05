package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {
	List<String> strMyclass;

	public MyClass06() {
		strMyclass = new ArrayList();
	}

	public void push(int intNum) {
		strMyclass.add(String.valueOf(intNum));
	}

	public String show() {
		String strNum = "";
		for (String s : strMyclass) {
			strNum += s;
		}
		return strNum;

	}
}
