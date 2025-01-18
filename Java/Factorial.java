import java.util.*;

class Factorial {
    int fact;

    Factorial() {
        fact = 1;
    }

    void factorialNumber(int number)
    {
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of number is "+fact);
        
    }

    public static void main(String[] args)
    {
        Factorial f=new Factorial();
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number");
        int number=s.nextInt();
        f.factorialNumber(number);
    }
}
