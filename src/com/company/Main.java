package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main  {

    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Triangle(5, 5, 5));
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 3));

        Queue<Square> squares = new ArrayDeque<>();
        squares.add(new Square(3));
        squares.add(new Square(5));

        ShapeAccumulator figures = new ShapeAccumulator();

        figures.addAll(shapes);
        figures.addAll(squares);


        System.out.println("Максимальная площадь:\n" + figures.getMaxAreaShape());
        System.out.println("Минимальная площадь:\n" + figures.getMinAreaShape());
        System.out.println("Максимальный периметр:\n" + figures.getMaxPerimeterShape());
        System.out.println("Минимальный периметр:\n" + figures.getMinPerimeterShape());

        System.out.println("Суммарная площадь фигур: " + figures.getTotalArea());
        System.out.println("Суммарный периметр фигур: " + figures.getTotalPerimeter());

	}
}
