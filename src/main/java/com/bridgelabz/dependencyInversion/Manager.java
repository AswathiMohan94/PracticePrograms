package com.bridgelabz.dependencyInversion;

public class Manager  {
    IWorker worker;

    public void setWorker(IWorker workers) {
        worker = workers;
    }

    public void manage() {
        worker.work();
    }
}

