package com.bridgelabz.dependencyInversion;

public class Manager  {
    IWorker worker;

    public void setWorker(IWorker w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }
}
