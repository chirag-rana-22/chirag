import java.util.*;

class Stringorder {
    public static void main(String args[])
    {
        
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the String:");
        String str=s.nextLine();

        char a[]=str.toCharArray();
        char temp;
        for(int i=0;i<a.Length;i++)
        {
            for(int j=i+1;j<a.Length;j++)
            {
                if (a[j]<a[i])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.print("String in Sorted Order:"+a);
    }    
}
