package com.company;

public class Main {


	//  Что такое парадигма ООП? - Совокупность объектов и способы их взаимодействия.
        // Что такое классы в Java? - Класс - представляет с собой множетов объектов имеющих общую структуру и одинаковое поведение.
        // Что такое свойства класса? - Свойство — способ доступа к внутреннему состоянию класса, имитирующий переменную некоторого типа.

        class Class{
            String name; // создание свойств для определенного класса
            String color;

        }

    public static void main(String[] args) {
            Class myObject = new Class(); // Cоздание экземпляра класса
            myObject.name = "evangelina";
    }
}
