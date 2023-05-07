package miu_fpp;

	public class IsDual extends BaseTest implements FppTest {

		public void test() {
			testResult(new int[] {1, 2, 3, 0}, 1);
			testResult(new int[] {1, 1, 2, 2}, 0);
			testResult(new int[] {1, 3, 2, 2, 4, 0}, 1);
			testResult(new int[] {2, 5, 4, 3, 6, 1, 8, -1}, 1);
		}
		
		void testResult(int[] a, int expected) {
			int result = isDual(a);
			printResult(result, expected, a);
		}
		
		int isDual(int[] a) {
			if(a.length < 4 || a.length % 2 != 0) {
				return 0;
			}
			
			for(int i = 0; i < a.length - 3; i+=4) {
				if((a[i] + a[i + 1]) != (a[i + 2] + a[i + 3])) {
					return 0;
				}
			}
			
			return 1;
		}
	}
