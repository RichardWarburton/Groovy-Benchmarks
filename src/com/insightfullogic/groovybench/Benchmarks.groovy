package com.insightfullogic.groovybench

class Benchmarks {

    public static void main(String[] args) {
        [
            new Fibonacci(),
            new FibonacciNoTypes(),
            new StaticFibonacci(),
        ].each { benchmark ->
            benchmark.warmup()

            long start = System.currentTimeMillis()
            benchmark.run();
            long time = System.currentTimeMillis() - start

            printf("%s run in %d ms", benchmark.name(), time)
        }
    }

}
