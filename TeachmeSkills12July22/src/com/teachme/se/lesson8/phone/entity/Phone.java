package com.teachme.se.lesson8.phone.entity;

import java.util.Arrays;

public class Phone {
    String model, callerName;
    float weight;
    String number;

    public Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String model, float weight, String number) {
        // Вызов конструктора с двумя параметрами.
        this (number, model);
        this.weight = weight;
    }

    public Phone (){
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void showVar(){
        System.out.println("model=" + model + " weight=" + weight + " number=" + number);
    }
    /* добавить методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
       getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
     */
    public String getNumber(String callerName){
        return number;
    }
    public void receiveCall (String callerName){
        System.out.printf("Its %s calling.", callerName);
    }

    /* Добавьте перегруженный метод receiveCall, который принимает два параметра - имя и номер телефона звонящего.
       Вызвать этот метод
      */
     public void receiveCall (String callerName, String number){
        System.out.printf("Its %s calling. Number %s.\n", callerName, number);
     }
}
