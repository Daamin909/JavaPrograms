import java.util.Scanner;
class modulusNumbers{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("This application generates modulus of two given numbers");
		System.out.println("Enter the first number:\t");
		a=sc.nextInt();
		System.out.println("Enter the second number:\t");
		b=sc.nextInt();
		c=modulus(a,b);
		System.out.println("Modulus of two given numbers is:\t"+c);
		}
		static int modulus(int x,int y){
		return x%y;
	}
}
		