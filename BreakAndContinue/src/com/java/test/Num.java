package com.java.test;

public class Num {

	public static void getResult() {

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				// contiue -> if the above condition will get matched ,
				// will not terminate the loop , will go to achieve next iteration.
				continue;
			}
			if (i == 8) {
				// break -> if the above condition is matched, then
				// will break the iteration of loop
				break;
			}
			System.out.println("Printing the result : " + i);
		}
	}

	public static void main(String args[]) {
		getResult();
	}
}
