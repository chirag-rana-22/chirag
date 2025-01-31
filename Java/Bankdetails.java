import java.util.*;

class Bankdetails{
String accountNumber;
String depositorName;
String accountType;
double balance;

void bankDetails()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the account number:");
    accountNumber=s.nextLine();

    System.out.println("Enter the depositor name:");
    depositorName=s.nextLine();

    System.out.println("Enter the account type:");
    accountType=s.nextLine();

    System.out.println("Enter the initial balance:");
    balance=s.nextDouble();

}

void depositAmount()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the amount to deposit:");
    double amount=s.nextDouble();
    balance+=amount;

    System.out.println("sufficient balance:" +balance);
}

void withdrawAmount()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the amount to withdraw:");
    double amount=s.nextDouble();
    
    if (balance-amount >=500)
    {
        balance-=amount;
        System.out.println("sufficient balance:"+balance);
    }
    else
    {
        System.out.println("Insufficient balance");
    }
}

void display()
{
    System.out.println("Depositor name:"+depositorName);
    System.out.println("Balance:"+balance);
}

public static void main(String args[])
{
    Bankdetails b=new Bankdetails();
    b.bankDetails();
    b.depositAmount();
    b.withdrawAmount();
    b.display();
}


    
}
