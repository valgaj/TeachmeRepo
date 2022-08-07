package com.teachme.se.lesson7.figureAbstractClass;

public class FigureMain {
    public static void main(String[] args) {
        // демонстрация использования абстрактных методов getSquare() и ShowName()
        Figure[] figures = new Figure[3];

        figures[0] = new Triangle(3.5, 1.8, 3.0); // экземпляр класса Triangle
        figures[1] = new Circle(3.0); // экземпляр класса Circle

        double[] rectangle = new double[]{5.0, 3.0};
        figures[2] = new Rectangle(rectangle); // экземпляр класса Rectangle

        // Оптимальная запись объявления и инициализации объектов:
        // Figure[] figures1 = {new Triangle(3.5, 1.8, 3.0), new Circle(3.0), new Rectangle(rectangle)};

        double square, perimeter, sumOfPerimeters = 0;
        String name;

        for (Figure fig : figures) {
            System.out.print(System.lineSeparator());

            // вывести названия экземпляров figures[0]-Triangle, figures[1]-Circle, figures[2]-Rectangle
            fig.ShowName();

            name = fig.GetName(); // name  "Triangle", "Circle", "Rectangle"
            System.out.println(name + ". " + "Printed from main class");

            square = fig.GetSquare(); // вычисление площади фигуры
            System.out.println("square=" + square);

            perimeter = fig.GetPerimeter(); // вычисление периметра фигуры
            System.out.println("perimeter=" + perimeter);
            sumOfPerimeters = sumOfPerimeters + perimeter;
        }
            System.out.println("sumOfPerimeters=" + sumOfPerimeters);
    }
}
