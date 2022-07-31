package com.teachme.se.lesson7.docsAccountingSystem;

import java.time.LocalDate;
import java.util.Date;

public class ConsignmentNote extends Document {
    /* Переменные, объявленные в abstract class Documents, доступны и в данном класе-наследнике:
        - protected  int docNumber;
        - protected  Date docDate;
    */
    double monthlyTotal; //Итоговая сумма за месяц
    String departmentCode;

    public ConsignmentNote() {

    }

    public ConsignmentNote(int docNumber, LocalDate docDate, double monthlyTotal, String departmentCode) {
        super(docNumber, docDate);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    void provideInfoAboutDoc() {
        System.out.println("ConsignmentNote: docNumber-" + docNumber  + " docDate-" + docDate);
        System.out.println("ConsignmentNote:" + " monthlyTotal-" + monthlyTotal + " departmentCode-" + departmentCode);
    }

    @Override
    public void analyze() {
        System.out.println("Analysed by accountant");
    }
}

