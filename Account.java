package P1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Acount {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    /*set and get the customer number */

    public int setCustomerNo(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNo(){
        return customerNumber;
    }

    /*set and get the pin number */

    public int setPinNO(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNo(){
        return pinNumber;
    }

    /*get checking & saving account balance */

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return savingBalance;
    }

    /* calaculating checking and saving account deposites */

    public double calcCheckingDeposite(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    
    public double calcsavingDeposite(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    /*checking account and savinga account withdraw inputs */

    public void getCheckingWithdrawInput(){
        System.out.println("checking account balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from checking account");
        double amount = input.nextDouble();
        if((checkingBalance - amount) >= 0) {
            calcCheckingDeposite(amount);
            System.out.println("New checking balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative: " + "\n");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving account balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from saving account");
        double amount = input.nextDouble();
        if((savingBalance - amount) >= 0) {
            calcsavingDeposite(amount);
            System.out.println("New Saving balance: " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance cannot be negative: " + "\n");
        }
    }
    /* Customer Checking account deposite */
    
    public void getCheckingDepositeInput() {
        System.out.println("Checking Account Balance " + moneyFormat.format(checkingBalance));
        System.out.print("Account you want to deposite from Checking account");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposite(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance cannot be negative" + "\n");
        }
    }

    public void getSavingDepositeInput() {
        System.out.println("Saving Account Balance " + moneyFormat.format(checkingBalance));
        System.out.print("Account you want to deposite from Saving account");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0) {
            calcsavingDeposite(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

}
