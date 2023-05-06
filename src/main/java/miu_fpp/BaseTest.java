package miu_fpp;

import java.util.Arrays;

public abstract class BaseTest {
	protected void printResult(boolean isPassed, int actualResult, int expectedResult, int n) {
		if(isPassed) {
			System.out.println("PASSED for input:" + n);
		} else {
			System.out.println("FAILED for input: " + n +
					", expected: " + expectedResult +
					", but was: " + actualResult);
		}
	}
	
	protected void printResult(boolean isPassed, int actualResult, int expectedResult, int[] arr) {
		if(isPassed) {
			System.out.println("PASSED for input:" + Arrays.toString(arr));
		} else {
			System.out.println("FAILED for input: " + Arrays.toString(arr) +
					", expected: " + expectedResult +
					", but was: " + actualResult);
		}
	}
}
