import BankDetails.deposit;
import prev_transaction.withdraw;
import prev_transaction.getprev_transaction;
import loan.Loan;
import java.util.*;

public class BankingApplication {
    public static void main(String args[]) {
        Bank obj = new Bank();
        deposit o = new deposit();
        withdraw w = new withdraw();
        getprev_transaction p = new getprev_transaction();
        Loan l = new Loan();
        int option = '\0';
        int option2 = '\0';
        int option3 = '\0';
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n \t\t\t ****** WELCOME TO UOK BANK******\n");
        obj.openAccount();
        obj.showAccount();
        if( obj.S == false) {
            do {
                System.out.println("\t What would you like to do:");
                System.out.println("\t\t1. Transaction");
                System.out.println("\t\t2. Loan");
                System.out.println("\t\t3. exit");
                System.out.println("-------------------------------------------------------------------------------------------------- ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("\t What would you like to do?");
                        System.out.println("\t\t1. Deposit");
                        System.out.println("\t\t2. Withdraw");
                        System.out.println("\t\t3. Previous Transactions");
                        System.out.println("\t\t4. exit");
                        System.out.println("----------------------------------------------------------------------------------------------- ");
                        option2 = sc.nextInt();
                        switch (option2) {
                            case 1:
                                o.depositFunc(obj.salary);
                                break;
                            case 2:
                                w.withdrawFunc(obj.salary);
                                break;
                            case 3:
                                p.prevFunc(obj.salary);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("OOps! something went wrong!");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("\t Which loan you want?");
                        System.out.println("\t\t1. Home loan");
                        System.out.println("\t\t2. Education loan");
                        System.out.println("\t\t3. Personal loan");
                        System.out.println("\t\t4. exit");
                        System.out.println("----------------------------------------------------------------------------------------------");
                        option3 = sc.nextInt();
                        switch (option3) {
                            case 1:
                                l.loan1();
                                break;
                            case 2:
                                l.loan1();
                                break;
                            case 3:
                                l.loan1();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("OOps! something went wrong!");
                                break;
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("OOps! something went wrong!");
                        break;
                }
            }
            while (option != 3);
        }
        else {
                System.out.println("Invalid Username & Password!");
            }
    }
}

class Account {
    public String name,birth,email,acctype,address,password;
    public int account_no,moNo;
    int salary = 1000;
    boolean S;
}
class Bank extends Account {
    public void showAccount(){
        boolean S = name.equals(name)&& password.equals(password);

        if (name.equals(name)&& password.equals(password)) {
            System.out.println("\n\t\t\t\t *****ACCOUNT DETAILS*****\n");
            System.out.println("You are logged in");
            System.out.println("Name of account holder: " + name);
            System.out.println("Account no.: " + account_no);
            System.out.println("Account type: " + acctype);
            System.out.println("Address: " + address);
            System.out.println("Email: " + email);
            System.out.println("Date of Birth: " + birth);
            System.out.println("Mobile Number: " + moNo);
            System.out.println("Balance: " + salary);
        }
        else{
            System.out.println("Invalid Username & Password!");
        }
    }
    public void openAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n \t\t\t\t ******REGISTRATION****** \n");
        System.out.println("Enter your Name: ");
        name =sc.nextLine();
        System.out.println("Enter your Address: ");
        address =sc.nextLine();
        System.out.println("Enter your Email: ");
        email =sc.nextLine();
        System.out.println("Enter your Date of Birth(mm/dd/yyyy): ");
        birth =sc.nextLine();
        System.out.println("Enter your Account type: ");
        acctype =sc.nextLine();
        System.out.println("Enter your Password: ");
        password =sc.nextLine();
        System.out.println("Enter your account number: ");
        account_no =sc.nextInt();
        System.out.println("Enter your Mobile Number: ");
        moNo =sc.nextInt();
        System.out.println("******************************************* ");
    }
}






