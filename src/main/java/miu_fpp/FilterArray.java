package miu_fpp;

public class FilterArray extends BaseTest implements FppTest {

    public void test() {
        runTest(new int[] {1,2,3,4,8}, new int[] {4,0,1,1,0}, new int[] {2,3});
        runTest(new int[] {8,3}, new int[] {2,1,1}, new int[] {8,3});
        runTest(new int[] {8,3}, new int[] {2,0,1}, new int[] {3});
        runTest(new int[] {8,3}, new int[] {2,1,0}, new int[] {8});
        runTest(new int[] {8,3}, new int[] {2,0,0}, new int[] {});
        runTest(new int[] {8,3,-12}, new int[] {2,1,1}, new int[] {8,3});
        runTest(new int[] {1,2}, new int[] {3,1,1,1}, null);
        runTest(new int[] {1,2}, new int[] {3,1,1,0}, null);
        runTest(new int[] {1,0,3,-2}, new int[] {4,0,1,0,1}, new int[] {0,-2});
    }
    
    void runTest(int[] a, int[] filter, int[] expected) {
        int[] actual = filterArray(a, filter);
        printResult(actual, expected, a, filter);
    }

    int[] filterArray(int[] a, int[] filter) {
        if((filter.length -1) > a.length) return null;
        int resultSize = 0;
        for(int i = 1; i < filter.length; i++) {
            if(filter[i] == 1) resultSize++;
        }
        
        int[] result = new int[resultSize];
        int resultIndex = 0;
        for(int i = 1; i < filter.length; i++) {
            if(filter[i] == 1) {
                result[resultIndex++] = a[i - 1];
            }
        }
        
        return result;
    }

}
