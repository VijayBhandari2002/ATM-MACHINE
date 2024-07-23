82package P1;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class OptionMenu extends Acount{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    /* validate login information and pin no */
    public void getLogin() throws IOException{
        int x = 1;
        do{
            try{
                data.put(826966, 0001);
                data.put(845005, 0001);
                System.out.println("welcome to your account");

                System.out.println("Enter your customer number");
                setCustomerNo(menuInput.nextInt());

                System.out.println("Enter your pin");
                setPinNO(menuInput.nextInt());

            }catch(Exception e){
                System.out.println("\n"+"INVALID CHARACTERS(s).Only Numbers"+"\n");
                x = 2;
            }
            for (Entry<Integer,Integer> entry : data.entrySet()) {
                if (entry.getKey()==getCustomerNo()&&entry.getValue()==getPinNo()){
                    getAccountType();
                }
            } System.out.println("\n"+"Wrong Username or pin"+"\n");
        }while(x==1);
    }
    /*display the account type menu with sections */
    public void getAccountType(){
        System.out.println("Select what account you want to access: ");
        System.out.println("Type 1 - Checking account");
        System.out.println("Type 2 - Savings account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");
         
        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for visiting");
                break;    
        
            default:
                System.out.println("\n"+"Invalid choice"+"\n");
                getAccountType();
        }
    }
    /*Display checking account with Selections */

    public void getChecking(){
        System.out.println("checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposite Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance" + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for visiting");
        
            default:
                System.out.println("\n"+"Invalid choice"+"\n");
                getChecking();
        }
    }
    /* Display saving account with selections */

    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposite Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance" + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for visiting");
        
            default:
                System.out.println("\n"+"Invalid choice"+"\n");
                getSaving();
        }
    }
    int selection;
}
