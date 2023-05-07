package miu_fpp;

public class IsFibonacci extends BaseTest implements FppTest {
	
	public void test() {
		printResult(3, 1);
		printResult(4, 0);
		printResult(5, 1);
		printResult(6, 0);
		printResult(8, 1);
		printResult(13, 1);
	}
	
	private void printResult(int n, int expectedResult) {
		int actualResult = isFibonacci(n);
		printResult(expectedResult, actualResult, n);
	}
	
	private int isFibonacci(int n) {
		if(n == 1) {
			return 1;
		}
		
		int prev = 1;
		int fibo = 1;
		
		while (fibo < n) {
			int temp = fibo;
			fibo += prev;
			prev = temp;
		}
		
		if(fibo == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
