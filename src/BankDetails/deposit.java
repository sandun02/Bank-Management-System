package BankDetails;
import java.util.Scanner;
import java.lang.Exception;

public class deposit implements depo {
    public void depositFunc(int salary) {

        Scanner sc=new Scanner(System.in);
        int balance = 0;
        int dep;
        int prev_transaction;
        if(salary!=0) {
            System.out.println("Your current salary is : "+salary );
            System.out.println("Amount you wanna deposit: ");
            dep=sc.nextInt();
            try {
                if(dep>0) {
                    balance=salary + dep;

                    prev_transaction= balance;

                    System.out.println("After deposit your balance is "+balance);
                    System.out.println("******************************************* ");
                }
                else {
                    throw new prev_transaction.MyException("Deposit cannot be in negative");

                }
            }
            catch(prev_transaction.MyException e) {
                System.out.println(e.getMessage());
                System.out.println("TRANSACTION FAILURE!!");
            }

        }
    }
}

interface depo {
    public void depositFunc(int salary);
}

class MyException extends Exception {
    MyException(String message)
    {
        super(message);
    }
}

