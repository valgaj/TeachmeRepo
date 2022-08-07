package com.teachme.se.lesson7.figureAbstractClass;
// класс, реализующий окружность, наследует класс Figure
public class Circle extends Figure {
    double radius;

    // конструктор
    public Circle(double radius) {
        name = "Circle";
        this.radius = radius;
    }

    // переопределение абстрактного метода ShowName()
    @Override
    void ShowName() {
        System.out.println("Circle. Displayed from class Circle");
    }

    // переопределение абстрактного метода getSquare()
    @Override
    double GetSquare() {
        double square;
        square = Pi*radius*radius;
        return square;
    }

    // переопределение абстрактного метода getPerimeter()
    @Override
    double GetPerimeter() {
        return 2*(Pi*radius);
    }

    @Override
    String GetName() {
        System.out.println("Circle. Displayed from method GetName");
        return (name);
    }
}
