package com.teachme.se.lesson7.figureAbstractClass;

public class Rectangle extends Figure {
   double[] rectangle;

    public Rectangle(double[] rectangle) {
        name = "Rectangle";
        this.rectangle = rectangle;
    }

    @Override
    void ShowName() {
        System.out.println("Rectangle. Displayed from class Rectangle");
    }

    @Override
    double GetSquare() {
        return rectangle[0]*rectangle[1];
    }

    @Override
    double GetPerimeter() {
        return 2*(rectangle[0]+rectangle[1]);
    }

    @Override
    String GetName() {
        System.out.println("Rectangle. Displayed from method GetName");
        return (name);
    }
}
