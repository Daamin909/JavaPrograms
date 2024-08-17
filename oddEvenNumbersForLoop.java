import java.util.*;
class oddEvenNumbersForLoop{
	public static void main(String[] args){
		int a,c=0;
		String b;
		Scanner sc=new Scanner(System.in);
		System.out.println("This application generates odd or even numbers as per your choice. Please type E for Even numbers and O for Odd numbers.");
		b=sc.next();
		if(b.equals("O"))
			c=1;
		else if(b.equals("E"))
			c=0;
		else
		{
			System.out.println("Wrong Input. Please try again Later");	
			System.exit(0);
		}			
		
		for (a=c; a<=100; a=a+2)
			System.out.println("\t"+a);
	}
}
	