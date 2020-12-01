package com.company;

import java.util.Comparator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class ShapeAccumulator {
    private List<Shape> shapes;

    public ShapeAccumulator() {

        shapes = new ArrayList<>();
    }

    public <T extends Shape> void add(T shape) {

        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }

    public void addAll(Collection<? extends Shape> collection) {

        shapes.addAll(collection);
    }

    public Shape getMaxAreaShape() {
        Shape maxAreaShape = null;
        double max = Double.MIN_VALUE;
        for (Shape shape : shapes) {
            if (shape.calcArea() > max) {
                max = shape.calcArea();
                maxAreaShape = shape;
            }
        }
        return maxAreaShape;
    }

    public Shape getMinAreaShape() {
        Shape minAreaShape = null;
        double min = Double.MAX_VALUE;
        for (Shape shape : shapes) {
            if (shape.calcArea() < min) {
                min = shape.calcArea();
                minAreaShape = shape;
            }
        }
        return minAreaShape;
    }

    public Shape getMaxPerimeterShape() {
        Shape maxPerimeterShape = null;
        double max = Double.MIN_VALUE;
        for (Shape shape : shapes) {
            if (shape.calcPerimeter() > max) {
                max = shape.calcPerimeter();
                maxPerimeterShape = shape;
            }
        }
        return maxPerimeterShape;
    }

    public Shape getMinPerimeterShape() {
        Shape minPerimeterShape = null;
        double min = Double.MAX_VALUE;
        for (Shape shape : shapes) {
            if (shape.calcPerimeter() < min) {
                min = shape.calcPerimeter();
                minPerimeterShape = shape;
            }
        }
        return minPerimeterShape;
    }

    public double getTotalArea() {
        double res = 0;
        for (Shape shape : shapes) {
            res += shape.calcArea();
        }
        return res;
    }

    public double getTotalPerimeter() {
        double res = 0;
        for (Shape shape : shapes) {
            res += shape.calcPerimeter();
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("");
        for (Shape shape : shapes) {
            result.append(shape.toString());
            result.append(System.lineSeparator());
        }
        return result.toString();
    }
}
