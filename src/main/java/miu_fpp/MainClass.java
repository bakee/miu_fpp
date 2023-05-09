package miu_fpp;

public class MainClass {

    public static void main(String[] args) {
        FppTest[] tests = new FppTest[] { 
                new IsFibonacci(),
                new IsTwin(),
                new IsComplete(),
                new IsDual(),
                new IsBunker(),
                new IsHollow(),
                new HasNValues(),
                new DecodeNumber(),
                new FilterArray()
            };

        for (FppTest fppTest : tests) {
            fppTest.test();
        }
    }
}
