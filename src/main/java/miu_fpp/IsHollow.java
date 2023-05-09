package miu_fpp;

public class IsHollow extends BaseTest implements FppTest {
    public void test() {
        runTest(new int[] { 1, 2, 4, 0, 0, 0, 3, 4, 5 }, 1);
        runTest(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 }, 0);
        runTest(new int[] { 1, 2, 4, 9, 0, 0, 0, 3, 4, 5 }, 0);
        runTest(new int[] { 1, 2, 0, 0, 3, 4 }, 0);
        runTest(new int[] { 1, 2, 0, 0, 1, 5, 6, 2, 0, 0, 3, 4 }, 0);
    }

    void runTest(int[] a, int expected) {
//		int actual = isHollow(a);
        int actual = isHollowSimple(a);
        printResult(actual, expected, a);
    }

    int isHollow(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            if ((a[i] == 0 && a[a.length - 1 - i] != 0) || a[i] != 0 && a[a.length - 1 - i] == 0) {
                return 0;
            } else if (a[i] == 0) {
                return isAllZeroes(a, i, a.length - 1 - i);
            }
        }
        return 0;
    }

    int isAllZeroes(int[] a, int left, int right) {
        if ((right - left) < 2)
            return 0;
        for (int i = left; i <= right; i++) {
            if (a[i] != 0)
                return 0;
        }
        return 1;
    }

    int isHollowSimple(int[] a) {
        int i;
        int leftCount = 0;
        int zeroCount = 0;
        int rightCount = 0;

        for (i = 0; i < a.length; i++) {
            if (a[i] != 0)
                leftCount++;
            else
                break;
        }

        for (; i < a.length; i++) {
            if (a[i] == 0)
                zeroCount++;
            else
                break;
        }

        for (; i < a.length; i++) {
            if (a[i] != 0)
                rightCount++;
            else
                break;
        }

        if (i != a.length || leftCount != rightCount || zeroCount < 3) {
            return 0;
        }

        return 1;
    }
}
