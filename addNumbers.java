import java.util.Scanner;
class addNumbers{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("This application generates sum of two numbers given by the user\n");
		System.out.print("Enter first number:\t");
		a=sc.nextInt();
		System.out.print("Enter second number:\t");
		b=sc.nextInt();
		c=addition(a,b);
		System.out.println(" Addition of two numbers is : "+c);
		}
		static int addition(int x,int y){
		return x+y;
		/*This program adds two numbers that are given by the user*/
	}
}