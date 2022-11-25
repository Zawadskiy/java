package com.walking.lesson14.rightShape.shapes;

public class Triangle extends Shape {
    @Override
    public void draw(int size) {
        int i;
        for (i = 0; i < size - 1; i++) {
            System.out.println(" ".repeat(size - i) + "/" + " ".repeat(2 * i) + "\\");
        }
        System.out.println(" ".repeat(size - i) + "/" + "_".repeat(2 * i) + "\\");
    }
}
