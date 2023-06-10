package org.example.homework.lesson5;

public class BankAccount {
    int id = 1;
    String name = "Petr";
    double balance = 100;

    void popolnenieScheta(double summaPopolnenya) {
        System.out.println("Баланс до пополнения " + balance);
        System.out.println("Баланс пополняется на " + summaPopolnenya);
        balance += summaPopolnenya;
        System.out.println("Баланс после пополнения " + balance);
        System.out.println();
    }

    void snyatieSoScheta(double summaSnyatia) {
        System.out.println("Баланс до снятия " + balance);
        System.out.println("Баланс уменьшается на " + summaSnyatia);
        balance -= summaSnyatia;
        System.out.println("Баланс после снятия " + balance);
        System.out.println();
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.popolnenieScheta(1500);
        bA.snyatieSoScheta(380);
    }


}


