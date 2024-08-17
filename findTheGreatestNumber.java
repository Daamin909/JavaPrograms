import java.util.Scanner;
class findTheGreatestNumber{
	public static void main(String[] args){
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("This application generates the largest of two given numbers");
		System.out.println("Enter The First Number:\t");
		a=sc.nextInt();
		System.out.println("Enter The Second Number:\t");
		b=sc.nextInt();

		if(a>b)
			c=a;
		if(b>a)
			c=b;
		System.out.print("The largest number of two given numbers is:\t"+c);		
	}
	
}

	

