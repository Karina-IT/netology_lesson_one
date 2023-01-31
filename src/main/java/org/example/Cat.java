package org.example;

public class Cat {
    String name;
    Integer legs;
    Integer tail;

    public Cat(String name, Integer legs, Integer tail) {
        this.name = name;
        this.legs = legs;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "org.example.Cat{" +
                "name='" + name + '\'' +
                ", legs='" + legs + '\'' +
                ", tail='" + tail + '\'' +
                '}';
    }
}
