package com.javahw;

import java.util.Random;

public class Main {

    private static final Random random = new Random();

    public static void main(String[] args) {
	    /*
	        1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
            Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
            Создать массив из 100 обьектов типа Person заполненных случайными данными
            (Например создать массив на несколько имен и выбирать из него случайным образом).
            1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
            не было человека весом 3 кг и ростом 180 итд.
	    */

        String[] femaleNames = {"Оля", "Ирина", "Лиза", "Мира", "Ангелина", "Мария", "Дарья", "Алина", "Анастасия", "Кира"};
        String[] maleNames = {"Игорь", "Александр", "Андрей", "Егор", "Алексей", "Дима", "Роман", "Евгений", "Ян", "Василий"};
        String[] surnames = {"Стеценко", "Абрамович", "Бойко", "Радд", "Гроза", "Даль", "Вольф", "Зубко", "Барнс", "Скотт"};

        Person[] people = new Person[100];

        for(int i = 0; i < people.length; i++) {
            int genderType = random.nextInt(2);

            int age = random.nextInt(83) + 16;
            int growth = random.nextInt(33) + 152;
            double weight;
            String name;
            String surname = surnames[random.nextInt(surnames.length)];

            if(genderType == 0) {
                name = maleNames[random.nextInt(maleNames.length)];
                weight = (growth - 100) * 1.15;
            } else {
                name = femaleNames[random.nextInt(femaleNames.length)];
                weight = (growth - 110) * 1.15;
            }

            people[i] = new Person(name, surname, age, Math.floor(weight), growth);
            System.out.println(i + 1 + ") " + people[i]);
        }
    }
}