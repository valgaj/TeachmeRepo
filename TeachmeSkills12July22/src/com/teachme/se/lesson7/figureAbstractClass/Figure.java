package com.teachme.se.lesson7.figureAbstractClass;

public abstract class Figure {
        // абстрактный класс, который описывает некоторую геометрическую фигуру
        protected String name = ""; // имя фигуры
        protected double Pi = 3.1415; // константа Пи

        // абстрактные методы, которые будут переопределяться в производных классах
        abstract void ShowName(); // вывести имя фигуры
        abstract double GetSquare(); // определение площади
        abstract double GetPerimeter(); // определение периметра

        // метод, возвращающий название фигуры
        abstract String GetName();
}
