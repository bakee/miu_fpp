package miu_fpp;

public class IsBunker extends BaseTest implements FppTest {

	public void test() {
		runTest(11, 1);
		runTest(22, 1);
		runTest(8, 0);
	}
	
	void runTest(int n, int expected) {
		int actual = isBunker(n);
		printResult(actual, expected, n);
	}
	
	int isBunker(int n) {
		int element = 1;
		for(int i = 2; element < n; i++) {
			element += (i - 1);
		}
		
		return (element == n) ? 1 : 0;
	}
}
