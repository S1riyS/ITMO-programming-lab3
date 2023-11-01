package org.example;

import org.example.interfaces.IObservable;
import org.example.interfaces.IObserver;

import java.util.ArrayList;

public class Emma extends Character implements IObservable {
    protected ArrayList<IObserver> observers = new ArrayList<>();

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
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this.name + " уходит в темноту");
        }
    }
}

