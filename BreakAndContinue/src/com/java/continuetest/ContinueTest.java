package com.java.continuetest;

public class ContinueTest {

	public static void test() {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("ContinueTest : " + i);
		}
	}

	public static void main(String[] args) {
		test();
	}
}
