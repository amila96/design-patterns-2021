package com.company.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Observer observer1=new Type1Observer();
        Observer observer2=new Type1Observer();
        Observer observer3=new Type2Observer();

        Subject subject=new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObserver("Curfew will be impose today");

        Thread.sleep(10000);

        System.out.println("===============================");

        subject.notifyObserver("Curfew will not be impose today");

        Thread.sleep(1000);

        System.out.println("===============================");

        subject.unsubscribe(observer2);

        Thread.sleep(500);

        subject.notifyObserver("Fuel prices gone up");


        //

    }

}
