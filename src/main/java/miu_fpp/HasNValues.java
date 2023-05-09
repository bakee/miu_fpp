package miu_fpp;

public class HasNValues extends BaseTest implements FppTest {

    public void test() {
        runTest(new int[] { 1, 2, 2, 1 }, 2, 1);
        runTest(new int[] { 1, 2, 2, 1 }, 1, 0);
        runTest(new int[] { 1, 2, 2, 1, 3, 3, 3, 4 }, 4, 1);
        runTest(new int[] { 1, 2, 2, 1, 3, 3, 3, 4 }, 3, 0);
        runTest(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 3, 1);
        runTest(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 10, 1);
        runTest(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 2, 0);
        runTest(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 20, 0);
    }

    void runTest(int[] a, int n, int expected) {
        int actual = hasNValues(a, n);
        printResult(actual, expected, a);
    }

    int hasNValues(int[] a, int n) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicateFound = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    isDuplicateFound = true;
                    break;
                }
            }
            if (!isDuplicateFound)
                count++;
        }

        return count == n ? 1 : 0;
    }
}
