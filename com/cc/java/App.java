package com.cc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>(Arrays.asList(new Rectangle(2, 4), new Triangle(5, 6), new Circle(4)));
        shapes.forEach((n) -> output(String.valueOf(n.area())));

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
