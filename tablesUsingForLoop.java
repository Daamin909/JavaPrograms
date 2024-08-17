import java.util.*;
class tablesUsingForLoop{
	public static void main(String[] args){
		int a, b, product;
		Scanner sc= new Scanner (System.in);
		System.out.println("This application generates Table of any number as per your input");
		System.out.println("Enter a number:\t");
		b=sc.nextInt();
		for (a=1; a<=10; a++)
		{
			product=b*a;
			System.out.println(b+"*"+a+"="+product);
		}
	}
}

