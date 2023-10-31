package org.example;

public class MumiTroll extends Character implements Observer {
    public MumiTroll(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(name + " на какое-то мгновение стало не по себе.");
        System.out.println(name + " обо всем забыл.");
    }

    @Override
    public void update(String date) {
        System.out.println(name + " видит: " + date);
    }
}
