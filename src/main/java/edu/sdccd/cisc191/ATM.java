package edu.sdccd.cisc191;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank theBank = new Bank("Miramar Bank");
        User aUser = theBank.addUser("Diego","Torres","0507");
        Account newAcc = new Account("Checking", aUser, theBank);
        aUser.addAccount(newAcc);
    }

}
