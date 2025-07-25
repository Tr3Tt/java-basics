package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сторону a: ");
        double a = sc.nextDouble();

        System.out.println("Введите сторону b: ");
        double b = sc.nextDouble();

        System.out.println("Введите сторону c: ");
        double c = sc.nextDouble();

        if ((a + b <= c) || (a + c <= b) || (b + c <= a)){
            System.out.println("Ошибка: треугольника с такими сторонами не существует.");
        }
        else {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Площадь треугольника: %.2f%n", area);
        }
        sc.close();
    }
}