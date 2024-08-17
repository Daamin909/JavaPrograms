import java.util.*;
class additionUsingMethods{
	public static void main(String[] args){
		int a, b, sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("This application gives the sum of the two given numbers");
		System.out.println("Enter the first number:\t");
		a=sc.nextInt();
		System.out.println("Enter the second number:\t");
		b=sc.nextInt();
		sum=addition(a,b);
		System.out.print(" Addition of two numbers is");
		System.out.print(" ");
		System.out.print(sum);
		
	}
		static int addition(int x,int y){
		int z;
		z=x+y;
		return z;
		}
}
