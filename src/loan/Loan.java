
package loan;
import java.util.Scanner;

public class Loan implements Loan1
{
    public void loan1()
    {
        Scanner sc=new Scanner(System.in);
        int amount;
        int time;

        double t2 = 0.0;

        double rate = 0.0;
        double total = 0.0;
        double t = 0.0;
        double interest = 0.0;

        System.out.println("Enter the amount");
        amount=sc.nextInt();

        System.out.println("Enter the time period");
        time=sc.nextInt();

        t=time*12;

        if(amount>100000 && amount<500000)
        {
            rate=5.2;
        }

        else if(amount>500000 && amount<1000000)
        {
            rate=7;
        }

        else if(amount>1000000 && amount<20000000)
        {
            rate= 9;
        }

        else

        {
            rate=11.4;
        }

        interest=(amount*rate*t)/100;
        total=interest+amount;
        t2=amount/t;

        System.out.println(amount+" at an interest of "+rate+ "and for a term of "+time+" years, the monthly EMI comes to Rs. "+t2);
        System.out.println("Total: "+total);
        System.out.println("******************************************* ");

    }
}

interface Loan1
{
    public void loan1();
}