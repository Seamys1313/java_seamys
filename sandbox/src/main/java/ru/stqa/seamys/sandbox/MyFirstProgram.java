package ru.stqa.seamys.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(6, 7);
        System.out.println("Расстояние между точками p1 и p2 " + " = " + p2.distance(p1,p2) + " см");
    }
}


