package miu_fpp;

import java.util.Arrays;

public abstract class BaseTest {
	private String getTestName() {
		return this.getClass().getSimpleName();
	}
	
	private void printTestName() {
		System.out.print(getTestName() + ":: ");
	}
	
	protected void printResult(int actualResult, int expectedResult, int n) {
		printTestName();
		printMessage(String.valueOf(n), expectedResult, actualResult);
	}
	
	protected void printResult(int actualResult, int expectedResult, int[] arr) {
		printTestName();
		printMessage(Arrays.toString(arr), expectedResult, actualResult);
	}
	
	private void printMessage(String input, int expectedResult, int actualResult) {
		boolean isPassed = actualResult == expectedResult;
		if(isPassed) {
			System.out.println("PASSED for input:" + input);
		} else {
			System.out.println("FAILED for input: " + input +
					", expected: " + expectedResult +
					", but was: " + actualResult +
					" !!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}
