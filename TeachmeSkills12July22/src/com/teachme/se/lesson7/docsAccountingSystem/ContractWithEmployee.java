package com.teachme.se.lesson7.docsAccountingSystem;

import java.time.LocalDate;
import java.util.Date;

public class ContractWithEmployee extends Document {
    /* Переменные, объявленные в abstract class Documents, доступны и в данном классе - производном от Register:
       - protected  int docNumber;
       - protected  Date docDate;
         Для класса, производного об абстрасного, не создается конструктор с этими папаметрами. Они задаются единожды
       в абстрактном классе, и доступны для всех классов наследников.
    */

    Date contractEndDate;
    String employeeName;

    public ContractWithEmployee(int docNumber, LocalDate docDate, Date contractEndDate, String employeeName) {
        super (docNumber,docDate);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    public ContractWithEmployee() {

    }
    @Override
    void provideInfoAboutDoc() {
        System.out.println("ContractWithEmployee. docNumber-" + docNumber  + " docDate-" + docDate);
        System.out.println("ContractWithEmployee. contractEndDate-" + contractEndDate +
                " employeeName-" + employeeName);
    }

    @Override
    public void analyze() {
            System.out.println("Analysed by HR");
    }
}
