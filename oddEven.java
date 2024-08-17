import java.util.Scanner;
class oddEven{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,num;
		System.out.println("\"This application generates even or odd numbers\"");		
		System.out.print("Please type 1 for odd numbers and 2 for even numbers:\t");	
		a=sc.nextInt();
	
		if(a==1)
			System.out.println("First ten odd numbers are: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,");
		if(a==2) 
			System.out.println("First ten even numbers are: 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20");
		if((a!=1)&&(a!=2))
			System.out.println("\"Sorry!!! Wrong input please try again later\"");		
	}
}