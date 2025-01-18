import java.util.Scanner;

class Stringreapeat {
    public static void main(String[] args)
    {
        int flag=0;
        char search;

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=s.nextLine();

        System.out.print("Enter the string Search:");
        search=s.next().charAt(0);


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search) {
                flag++;
            }
        }
        System.out.print("Occurance of the String="+flag);
    }
}
