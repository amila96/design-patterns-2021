package com.company.observer;


public class Type2Observer implements Observer{

    @Override
    public void notifyObserver(String news) {

        System.out.println("Wrap the food using the news"+news);
    }

}
