import java.util.Scanner;
class multiplyNumbers{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("This application generates product of two given numbers");
		System.out.println("Enter the first number:\t");
		a=sc.nextInt();
		System.out.println("Enter the second number:\t");
		b=sc.nextInt();
		c=multiply(a,b);
		System.out.println("Product of two given numbers is:\t"+c);
		}
		static int multiply(int x,int y){
		return x*y;
	}
}
		