package Tasks;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Banks
{
    //Encapsulate private instance Variables
    private String holderName;
    private String ifscCode;
    private long accountNumber;
    private String branch;
    private double balance;
    public Banks(Scanner scan)//Constructor "Banks" is used to Initialise the Details of user
    {
        System.out.println("Enter Account Holder Name:");
        this.holderName = scan.nextLine();

        System.out.println("Enter IFSC code:");
        this.ifscCode = scan.nextLine();

        System.out.println("Enter Account Number:");
        this.accountNumber = scan.nextLong();
        scan.nextLine();

        System.out.println("Enter Branch Name of Bank:");
        this.branch = scan.nextLine();

        System.out.println("Enter the minimum Balance of Your Account:");
        this.balance = scan.nextDouble();
        scan.nextLine();
    }
    public void deposit(Scanner scan)
    {
        System.out.println("Enter Deposit Amount:");
        double depositAmount=scan.nextDouble();
        scan.nextLine();
            if (depositAmount > 0) {
                this.balance += depositAmount;
                System.out.println("Deposited Successfully!" + this.balance);
            } else {
                System.out.println("Invalid Amount Entered!Please Recheck it...");
            }

    }
    public void withdraw(Scanner scan)//It uses 'try-catch' block to handle invalid input(Error-Non numeric values)
    {
        System.out.println("Enter the amount to withdraw:");
        try
        {
            double withdrawalAmount=scan.nextDouble();
            if (withdrawalAmount <= this.balance && withdrawalAmount>0) {
                this.balance -= withdrawalAmount;
                System.out.println("Withdrawal Completed Successfully.Your new Balance is:" + this.balance);
            } else if(withdrawalAmount >this.balance) {
                System.out.println("Insufficient Balance in your Account and your current Balance is: " + this.balance);
            }else {
                System.out.println("Withdrawal amount must be positive");
            }
        }catch(InputMismatchException e)
        {
            System.out.println(e);
            System.out.println("Invalid Input.Please Enter valid number.");
            scan.next();
    }

    }
    public void checkBalance()
    {
        System.out.println("Your current Balance is:"+this.balance);
    }

    
public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        Banks acc=new Banks(scan);
        boolean continueProgram=true;
        System.out.println("Welcome to Bank Menu!!!");
        System.out.println("Please Enter your Account details");

        while(continueProgram)
        {
            System.out.println("Choose an Option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int condition=scan.nextInt();
            scan.nextLine();

            switch(condition)
            {
                case 1:
                    acc.deposit(scan);
                    break;
                case 2:
                   acc.withdraw(scan);
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    System.out.println("4.Exiting...");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
