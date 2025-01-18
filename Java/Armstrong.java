import java.util.*;

class Armstrong {
    int rev,sum,temp,remainder;

    Armstrong(){
        rev=0;
        sum=0;
        temp=0;
    }

    void armstrongNumber(int num)
    {
        temp=num;
        while(num>0)
        {
            remainder=num%10;
            sum=sum+remainder*remainder*remainder;
            num=num/10;
        }

        if (temp==sum)
        {
            System.out.println("Number is Armstrong");
        }

        else
        {
            System.out.println("Number is not Armstrong");
        }
    }

    public static void main(String[] args)
    {
        Armstrong a=new Armstrong();
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=s.nextInt();
        a.armstrongNumber(num);
    }
}
