package com.bridgelabz.WrongDependencyInversion;

public class Manager {
    Worker worker;
    public void setWorker(Worker normalWorker) {
        worker=normalWorker;
        System.out.println("control worker");
    }
    public void manage(Worker normalWorker) {
        worker=normalWorker;
        worker.work();
        System.out.println("control worker");
    }


    public void ControlWorker() {
        System.out.println("control worker");
    }
    public void ControlFreshers() {
        System.out.println("control worker");
    }
    public void checkProduction() {
        System.out.println("control worker");
    }

}
