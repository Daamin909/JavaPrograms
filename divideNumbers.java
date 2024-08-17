import java.util.Scanner;
class divideNumbers{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("This application generates quotient of two numbers given by the user\n");
		System.out.print("Enter first number:\t");
		a=sc.nextInt();
		System.out.print("Enter second number:\t");
		b=sc.nextInt();
		c=divide(a,b);
		System.out.println(" Quotient of two numbers is : "+c);
		}
		static int divide(int x,int y){
		return x/y;
		/*This program divides two numbers that are given by the user*/
	}
}