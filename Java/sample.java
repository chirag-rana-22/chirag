import java.util.Scanner;

class sample
{
	static float percentage(int sum)
	{
		float per=sum/5;
		return per;
	}
	
	
	static void display(String name,int enro,int sum,float per)
	{
		System.out.println("Name:"+name);
		System.out.println("Enrollment No:"+enro);
		System.out.println("Total:"+sum);
		System.out.println("Percentage:"+per);
		
	} 
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the student Name=");
		String name=scanner.nextLine();
		
		System.out.print("Enter the student Enrollment Number=");
		int enro=scanner.nextInt();
		
		int[] marks=new int[5];
		int sum=0;
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Subject "+(i+1)+" Marks:");
			marks[i]=scanner.nextInt();
			sum+=marks[i]; 
		}
		
		float per=percentage(sum);
		display(name,enro,sum,per);
		
	}
}
