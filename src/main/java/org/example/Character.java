package org.example;

import java.util.Objects;

public abstract class Character implements Action {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    @Override
    public abstract void performAction();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character character = (Character) obj;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + 42;
    }

    @Override
    public String toString() {
        return String.format("%s {name='%s'}", getClass().getName(), this.name);
    }
}

