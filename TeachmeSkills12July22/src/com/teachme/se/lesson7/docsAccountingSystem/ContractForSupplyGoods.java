package com.teachme.se.lesson7.docsAccountingSystem;

import java.time.LocalDate;
import java.util.Date;

public class ContractForSupplyGoods extends Document {
    String typeOfGoods;
    int quantityOfGoods;
    /* Переменные, объявленные в abstract class DocumentsAbstractClass, досутпны и в данном производном от Register классе.
       - protected  int docNumber;
       - protected  LocalDate docDate;
    */

    /* Пустой конструктор */
    public ContractForSupplyGoods() {

    }

    public ContractForSupplyGoods(int docNumber, LocalDate docDate, String typeOfGoods, int quantityOfGoods) {
        super (docNumber, docDate);
        this.typeOfGoods = typeOfGoods;
        this.quantityOfGoods = quantityOfGoods;
    }

    @Override
    void provideInfoAboutDoc() {
            System.out.println("ContractForSupplyGoods. docNumber-" + docNumber  + " docDate-" + docDate);
            System.out.println("ContractForSupplyGoods. typeOfGoods-" +typeOfGoods +
                    " quantityOfGoods-" + quantityOfGoods);
    }
    public void analyze() {
        System.out.println("Analysed by product manager");
    }
}
