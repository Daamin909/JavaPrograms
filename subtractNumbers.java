import java.util.Scanner;
class subtractNumbers{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("This application generates differrence of two given numbers");
		System.out.println("Enter the first number:\t");
		a=sc.nextInt();
		System.out.println("Enter the second number:\t");
		b=sc.nextInt();
		c=subtract(a,b);
		System.out.println("Difference of two given numbers is:\t"+c);
		}
		static int subtract(int x,int y){
		return x-y;
	}
}
		