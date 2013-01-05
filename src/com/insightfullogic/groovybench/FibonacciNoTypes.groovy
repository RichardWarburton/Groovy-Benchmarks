package com.insightfullogic.groovybench

class FibonacciNoTypes extends Benchmark {

    @Override
    def warmup() {
        4000.times {fib(2)}
        println("warmed up")
    }

    @Override
    def run() {
        return fib(45)
    }

    def fib(n) {
        if (n <= 1)
            return 1
        else
            return fib(n - 1) + fib(n - 2);
    }
}
