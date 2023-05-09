package miu_fpp;

public class DecodeNumber extends BaseTest implements FppTest {

    public void test() {
        runTest(new int[] {0,0,0,0}, 1234);
        runTest(new int[] {4,3,2,1}, 5555);
        runTest(new int[] {8,0}, 92);
    }
    
    void runTest(int[] a, int expected) {
        int actual = deCodeNumber(a);
        printResult(actual, expected, a);
    }
    
    int deCodeNumber(int[] a) {
        int number = 0;
        for(int i = 0; i < a.length; i++) {
            number *= 10;
            int digit = (a[i] + i + 1);
            if(digit > 9 || digit < 0) {
                return -1; // illegal encoding
            }
            number += digit;
        }
        
        return number;
    }

}
