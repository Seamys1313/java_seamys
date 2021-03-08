package ru.stqa.seamys.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Victory");

        Square s = new Square(6);
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

        Rectangle s1 = new Rectangle(6,3);
        s1.a = 2;
        s1.b = 3;
        System.out.println("Площадь прямоугольника со сторонами " + s1.a + " и " + s1.b + " = " + s1.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");

    }


    }



