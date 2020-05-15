package com.bridgelabz.dependencyInversion;

public class FresherWorker implements IWorker {

    @Override
    public void work() {
        System.out.println("training...");
    }
}
