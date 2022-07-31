package com.teachme.se.lesson7.docsAccountingSystem;

import java.time.LocalDate;
import java.util.Date;

public abstract class Document implements Analysable{

    public int docNumber;

    public LocalDate docDate;

    public Document(int docNumber, LocalDate docDate) {
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

    public Document() {
    }

    /* В методе предоставления информации о документе следует выводить
        на экран информацию о переданном входным параметром документе;
        Конкретная реализация - в классах-наследниках
    */
    abstract void provideInfoAboutDoc();

}
