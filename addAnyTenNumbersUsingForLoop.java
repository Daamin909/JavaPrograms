import java.util.*;
class addAnyTenNumbersUsingForLoop{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a, sum=0, b; 
		System.out.println("This application adds any ten numbers of you choice");
		for (a=1;a<=10;a++)
		{
			System.out.println("Enter The\t"+ a+ "\t Number:\t");
			b=sc.nextInt();
			sum=sum+b;
		}
		System.out.println("The sum of ten numbers is\t"+sum);
	}
}
			