package miu_fpp;

public class IsTwin extends BaseTest implements FppTest {

	int isTwin(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i]) && hasTwin(arr[i])) {
				if(isPrime(arr[i] - 2) && isPresent(arr, arr[i] - 2)) {
					
				} else if(isPrime(arr[i] + 2) && isPresent(arr, arr[i] + 2)) {
					
				} else {
					return 0;
				}
			}
		}
		
		return 1;
	}
	
	public void test() {
		testIsTwin(new int[]{3, 5, 8, 10, 27}, 1);
		testIsTwin(new int[]{11, 9, 12, 13, 23}, 1);
		testIsTwin(new int[]{5, 3, 14, 7, 18, 67}, 1);
		testIsTwin(new int[]{13, 14, 15, 3, 5}, 0);
		testIsTwin(new int[]{1, 17, 8, 25, 67}, 0);
	}
	
	void testIsTwin(int[] arr, int expected) {
		int result = isTwin(arr);
		printResult(result, expected, arr);
	}
	
	boolean isPrime(int n) {
		for(int i = 2; i * i < n; i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
	boolean isPresent(int[] arr, int n) {
		for(int i = 0; i < arr.length; i++) {
			if(n == arr[i]) return true;
		}
		
		return false;
	}
	
	boolean hasTwin(int n) {
		return isPrime(n - 2) || isPrime(n + 2);
	}
}
