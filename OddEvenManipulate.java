import java.util.*;
class OddEvenManipulate{
		static int a, b, c, e;
		static float d;
		static String z;
		Scanner sc=new Scanner(System.in);
		void oddNumbers(){
			for (a=b; a<=100; a=a+2)
				System.out.println("\t\t\t\t\t"+a);
			d=2500;
			System.out.println("The sum of first hundred odd numbers is:\t"+d);
			d=d/50;
			System.out.println("The average of first hundred odd number is:\t"+d);
			} 
		void evenNumbers(){
			for (a=b; a<=100; a=a+2)
				System.out.println("\t\t\t\t\t"+a);
			d=2550;
			System.out.println("The sum of first hundred even numbers is:\t"+d);
			d=d/51;
			System.out.println("The average of first hundred even number is:\t"+d);
		}
	public static void main(String[] args){
		OddEvenManipulate oem=new OddEvenManipulate();
		Scanner sc=new Scanner(System.in);
		System.out.println("This application gives the sum and average of odd or even numbers upto hundred");
		System.out.println("Please enter O for odd numbers and E for even numbers:\t");
		z=sc.next();
		if ((z.equals("o"))||(z.equals("O")))
		{
			b=1;
			oem.oddNumbers();
		}
		else if ((z.equals("e"))||(z.equals("E")))
		{
			b=0;
			oem.evenNumbers();
		}
		else
			System.out.println("Wrong input. Please try again later...");
	}
}
		
