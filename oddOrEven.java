import java.util.Scanner;
class oddOrEven{
	public static void main(String[] args){
		int no, a;
		Scanner sc=new Scanner(System.in);		
		System.out.print("\nThis application generates if the given number is odd or even\n");
		System.out.print("\nEnter the number:\t");
		no=sc.nextInt();
		a=no % 2;
		if (a==0)
			System.out.println("\nThe given number is even\n");
		else if (a!=0)
			System.out.println("\nThe given number is odd\n");
	}
}
		
		