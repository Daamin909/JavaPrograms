import java.util.Scanner;
class average{
	public static void main (String[] args){
		int a, b, c, d, e, f;
		Scanner sc=new Scanner(System.in);
		System.out.println("\"This application generates average of five given numbers\"");
		System.out.println("Enter the first number:\t");
		a=sc.nextInt();
		System.out.println("Enter the second number:\t");
		b=sc.nextInt();
		System.out.println("Enter the third number:\t");
		c=sc.nextInt();		
		System.out.println("Enter the fourth number:\t");
		d=sc.nextInt();
		System.out.println("Enter the fifth number:\t");
		e=sc.nextInt();
		f=(a+b+c+d+e)/5;
		System.out.println("The average of five given numbers is:\t"+f);
	}
} 

		
		

		












