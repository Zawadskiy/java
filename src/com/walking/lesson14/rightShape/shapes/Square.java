package com.walking.lesson14.rightShape.shapes;

public class Square extends Shape {
	
	@Override
	public void draw(int size) {
		drawHorizontalLine(size);
		drawVerticalLine(size);
		drawHorizontalLine(size);
	}
	
	private void drawHorizontalLine(int size) {
		System.out.print(" " + "-".repeat(size) + " ");
		System.out.println();
	}
	
	private void drawVerticalLine(int size) {
		for (int i = 0; i < size; i++) {
			System.out.println("|" + " ".repeat(size) + "|");
		}
	}
}
