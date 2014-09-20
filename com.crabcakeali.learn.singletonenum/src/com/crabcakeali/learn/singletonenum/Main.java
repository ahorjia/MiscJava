package com.crabcakeali.learn.singletonenum;

public class Main {

	public static void main(String[] args) {

		SingletonEnum.setTestStr("hello1");
		
		ShowValue sv1 = new ShowValue();
		sv1.showValue();
		
		ShowValue sv2 = new ShowValue();
		sv2.showValue();
		
		SingletonEnum.setTestStr("hello2");
		
		sv1.showValue();
		sv2.showValue();
	}
}
