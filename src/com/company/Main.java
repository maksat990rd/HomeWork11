package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /** Создайте класс Triangle, у класса должны быть поля a, b, c.
         В классе создайте метод "area" который при вызове выводит на консоль площадь треугольника. */

        Triengle perimetr = new Triengle();
        Random ran = new Random();
        perimetr.a = ran.nextInt(1, 20);
        System.out.println("Периметр стороны А: " + perimetr.a);
        perimetr.b = ran.nextInt(1, 20);
        System.out.println("периметр стороны Б: " + perimetr.b);
        perimetr.c = ran.nextInt(1, 20);
        System.out.println("Периметр стороны С: " + perimetr.c);

        Triengle.area(perimetr.a, perimetr.b, perimetr.c);
    }
}

