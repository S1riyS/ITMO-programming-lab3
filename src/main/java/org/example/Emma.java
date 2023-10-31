package org.example;

import java.util.ArrayList;

public class Emma extends Character implements Observable {
    protected ArrayList<Observer> observers = new ArrayList<>();

    public Emma(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(this.name + " прибежал(а).");
        System.out.println(this.name + " что-то бормочет.");
        System.out.println(this.name + " заковылял(а) в темноту.");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.name + " уходит в темноту");
        }
    }
}

