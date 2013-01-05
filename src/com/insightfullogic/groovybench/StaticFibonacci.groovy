package com.insightfullogic.groovybench

import groovy.transform.CompileStatic

@CompileStatic
class StaticFibonacci extends Benchmark {

    @Override
    def warmup() {
        4000.times {fib(2)}
        println("warmed up")
    }

    @Override
    def run() {
        return fib(45)
    }

    int fib(int n) {
        if (n <= 1)
            return 1
        else
            return fib(n - 1) + fib(n - 2);
    }

}
