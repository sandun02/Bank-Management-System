package prev_transaction;
import java.util.Scanner;


public class withdraw implements withdraws {
    public double withdrawFunc(int salary) {
        Scanner sc=new Scanner(System.in);
        int withdrawn;

        int balance=0;
        int prev_transaction;

        if(salary!=0) {
            System.out.println("Amount you wanna withdraw: ");
            withdrawn=sc.nextInt();

            try {
                if(withdrawn>0)
                {
                    balance=salary - withdrawn;
                    prev_transaction= balance;

                    System.out.println("After withdraw your balance is "+balance);
                    System.out.println("****************************************** ");
                }
                else
                {
                    throw new MyException("Deposit cannot be in negative");

                }
            }

            catch(MyException e)
            {
                System.out.println(e.getMessage());
                System.out.println("TRANSACTION FAILURE!!");
            }

        }
        return balance;
    }
}

interface withdraws
{
    public double withdrawFunc(int salary);
}





