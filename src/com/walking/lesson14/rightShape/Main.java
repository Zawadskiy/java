package com.walking.lesson14.rightShape;

import com.walking.lesson14.rightShape.shapes.Shape;
import com.walking.lesson14.rightShape.shapes.Square;
import com.walking.lesson14.rightShape.shapes.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру: 1-прямоугольник, 2-треугольник");
        int shape = scanner.nextInt();
        System.out.println("Введите длину стороны");
        int size = scanner.nextInt();
        draw(shape, size);
    }

    static void draw(int shape, int size) {
        Shape shape1 = null;
        if (shape==1) {
            shape1= new Square();
        } else if (shape==2) {
            shape1= new Triangle();
        }
        if (shape1!=null) {
            shape1.draw(size);
        } else {
            System.out.println("Неизвестный тип фигуры");
        }
    }
}
