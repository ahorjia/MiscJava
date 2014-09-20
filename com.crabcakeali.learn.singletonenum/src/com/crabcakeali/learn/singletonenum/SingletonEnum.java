package com.crabcakeali.learn.singletonenum;

public enum SingletonEnum {
	
	Instane;
	
	private static String testStr = "";

	public static String getTestStr() {
		return testStr;
	}

	public static void setTestStr(String testStr) {
		SingletonEnum.testStr = testStr;
	}
}
