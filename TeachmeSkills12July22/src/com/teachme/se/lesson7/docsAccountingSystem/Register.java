package com.teachme.se.lesson7.docsAccountingSystem;

public class Register {
    /* Создать класс Регистр, который будет иметь методы:
           - сохранения документа в регистре
           - предоставление информации о документе.
             Класс регистр должен содержать внутри себя массив и при добавлении документа в регистр этот
      добавляемый документ должен добавляться в массив;
             Массив для класса регистра должен быть размером 10;
             В методе предоставления информации о документе следует выводить на экран информацию о
     переданном входным параметром документе;
        */

    public Register() {

        }
    Document[] documents = new Document[10];
    int size = 0;
    public void addDocumentToRegister(Document document){

        if (size < documents.length) {
            documents[size] = document;
            size ++;
        }
            else {System.out.println("Increase size of Register");
            }
        System.out.println("Register size after adding =" + size);
    }
}
