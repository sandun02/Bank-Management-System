package prev_transaction;

interface prev
{
    public void prevFunc(int prev_transaction );

}
public class getprev_transaction implements prev {
    public void prevFunc(int prev_transaction) {

        if (prev_transaction > 0) {
            System.out.println("Amount deposited in the past: " + prev_transaction);
            System.out.println("*******************************************");

        } else if (prev_transaction < 0) {
            System.out.println("Amount Withdrawn in the past : " + Math.abs(prev_transaction));
            System.out.println("******************************************* ");

        } else {
            System.out.println("NO TRANSACTION OCCURED!");
        }
    }
}
