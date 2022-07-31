package com.teachme.se.lesson7.figureAbstractClass;

// класс, реализующий треугольник
class Triangle extends Figure {
    double a, b, c; // стороны треугольника

    // конструктор
    Triangle(double a, double b, double c) {
        name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    // переопределение абстрактного метода ShowName()
    void ShowName() {
        System.out.println("Triangle. Displayed from class Triangle");
        }

    @Override
    // переопределение абстрактного метода getSquare().
    // вычисление площади треугольника
    double GetSquare() {
       // проверка, можно ли образовать треугольник из сторон a, b, c
        if (((a+b)<c) || ((b+c)<a) || ((a+c)<b)) {
        return 0.0;
    }
         double semiPerimeter = (a+b+c)/2; // полупериметр
         System.out.println("semiPerimeter=" +semiPerimeter);

         double square;

         // Формула Герона.Площадь треугольника со сторонами a, b, c равна корню квадратному из полупериметра,
         // умноженного на полупериметр минус a, полупериметр минус b, полупериметр минус c
        square = Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
        return square;
        }

    @Override
    double GetPerimeter() {
        // проверка, можно ли образовать треугольник из сторон a, b, c
        if (((a+b)<c) || ((b+c)<a) || ((a+c)<b)) {
         return 0.0;
        }

        return (a+b+c);
        }
    @Override
    String GetName() {
        System.out.println("Triangle. Displayed from method GetName");
        return (name);
    }
}

