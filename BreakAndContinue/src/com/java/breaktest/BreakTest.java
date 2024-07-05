package com.java.breaktest;

public class BreakTest {

	public static void test() {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("BreakTest : " + i);
		}
	}
	
	public static void main(String[] args) {
		test();
	}
}
