package com.javahw;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double weight;
    private int growth;

    public Person(String name, String surname, int age, double weight, int growth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Person { " +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", weight = " + weight +
                ", growth = " + growth +
                " }";
    }
}