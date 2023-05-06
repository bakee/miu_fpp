package miu_fpp;

public class MainClass {

	public static void main(String[] args) {
		FppTest[] tests = new FppTest[] {
				new IsFibonacci()		
		};

		for (FppTest fppTest : tests) {
			fppTest.test();
		}
	}
}
