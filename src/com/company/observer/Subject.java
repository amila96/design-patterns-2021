package com.company.observer;


import java.util.ArrayList;
import java.util.List;

//news paper agency
public class Subject {

    List<Observer> observers=new ArrayList<>();

    //subscribe
    public void subscribe(Observer observer){

        //call database and run the sql query to insert observer
        observers.add(observer);
    }

    //unsubscribe
    public void unsubscribe(Observer observer){
        //call the database and run the sql query to delete this observer
        observers.remove(observer);
    }



    //when a news paper available
    public void notifyObserver(String news){
        for(Observer observer:observers){
            observer.notifyObserver(news);
        }
    }

}
