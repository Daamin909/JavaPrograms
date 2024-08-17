import java.util.*;
class PrimeOrCompositeNumbers{
		static int a, b, c;
		Scanner sc=new Scanner (System.in);
		void getData(){
			System.out.println("Enter the Number:\t");
			a=sc.nextInt();
		}
		void checkNumbersAndPutData(){
			for (b=2; b<=a/2; b++){
				if (a%b==0)
					c++;
			}	
		}
		void counter(){
			if (c<=1)
				System.out.println("The given number is a prime number");
			else 
				System.out.println("The given number is a composite number");
		}
	public static void main(String[] args){
		PrimeOrCompositeNumbers pm= new PrimeOrCompositeNumbers();
		System.out.println("This application displays that the provided number by the user is a prime number or a composite number\n\n");
		pm.getData();	
		pm.checkNumbersAndPutData();
		pm.counter();
	}
}
											