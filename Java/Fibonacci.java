import java.util.*;

class Fibonacci {

    int temp;
    int num1;
    int num2;

   Fibonacci()
    {
        num1=0;
        num2=1;
        temp=0;
    }

    void finbona(int number)
    {
        for(int i=1;i<=number;i++)
        {
            System.out.println(+num1);
            temp=num1+num2;
            num1=num2;
            num2=temp;         
        }
    }
    

    public static void main(String[] args)
    {
        Fibonacci f=new Fibonacci();
        Scanner s=new Scanner(System.in);  
        System.out.println("Enter the number of terms");
        int number=s.nextInt();
        f.finbona(number);

    }
}
