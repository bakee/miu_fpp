package miu_fpp;

public class IsComplete extends BaseTest implements FppTest {

    public void test() {
        testIsComplete(new int[] { 2, 3, 2, 4, 11, 6, 10, 9, 8 }, 1);
        testIsComplete(new int[] { 2, 3, 3, 6 }, 0);
    }

    private void testIsComplete(int[] a, int expected) {
        int actual = isComplete(a);
        printResult(actual, expected, a);
    }

    int isComplete(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0)
                return 0;
        }

        int maxEvenNumber = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > maxEvenNumber) {
                maxEvenNumber = a[i];
            }
        }

        for (int i = 2; i < maxEvenNumber; i += 2) {
            boolean isFound = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                return 0;
            }
        }

        return 1;
    }
}
