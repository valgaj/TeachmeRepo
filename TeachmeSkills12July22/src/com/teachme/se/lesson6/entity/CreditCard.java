package com.teachme.se.lesson6.entity;

 public class CreditCard {
     int account;
     float balance;
     float addedAmount;
     float withdrawAmount;

     public  CreditCard (int account, float balance, float addedAmount, float withdrawAmount) {

         this.account = account;
         this.balance = balance;
         this.addedAmount = addedAmount;
         this.withdrawAmount = withdrawAmount;

         // System.out.println("Constructor after init. " +"addedAmount=" +addedAmount +" withdrawAmount=" + withdrawAmount);
     }

     /* public int getAccount() {
         return account;
     }

     public void setAccount(int account) {
         this.account = account;
     }

     public float getBalance() {
         return balance;
     }

     public void setBalance(float balance) {
         this.balance = balance;
     }

    public float getAddedAmount() {
         return addedAmount;
    }

    public void setAddedAmount (float addedAmount) {
         this.addedAmount = addedAmount;
    }

    public float getWithdrawAmount() {
         return withdrawAmount;
    }

     public void setWithdrawAmount(float withdrawAmount) {
         this.withdrawAmount = withdrawAmount;
     } */

     public float addedAmount(int account, float balance, float addedAmount) {
         if (account == this.account) {
             balance = balance + addedAmount;
         }
         return balance;
     }

     public float withdrawAmount(int account, float balance, float withdrawAmount){
         if (account == this.account) { //Проверить осмысленность. Добавила, чтобы убрать предупр. компилятора о том,
                                        // что account не используется. Удалять параметр account не хотелось бы.
             balance = balance - withdrawAmount;
         }
         return balance;
     }

     @Override
     public String toString() {

         return "CreditCard{" +
                 "account=" + account +
                 ", balance=" + balance +
                 ", addedAmount=" + addedAmount +
                 ", withdrawAmount=" + withdrawAmount +
                 '}';
     }
}
