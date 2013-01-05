package com.insightfullogic.groovybench

public abstract class Benchmark {

    def name() {
        getClass().getSimpleName()
    }

    def abstract warmup()

    def abstract run()

}
