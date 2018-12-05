package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass05 {

	List<String> strNum;

	public MyClass05() {
		strNum = new ArrayList();

	}

	public void push(String num) {
		strNum.add(num);
	}

	public String show() {
		String total = "";
		int size = strNum.size();
		for (int i = 0; i < size; i++) {
			total = total + strNum.get(i);
		}
		return total;
	}

}