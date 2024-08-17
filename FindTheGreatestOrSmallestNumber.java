import java.util.*;
class FindTheGreatestOrSmallestNumber{
		static int a, b, c, d, p;
		static String e;
		Scanner sc=new Scanner(System.in);
		void getData(){
			System.out.println("Enter The First Number:\t");
			a=sc.nextInt();
			System.out.println("Enter The Second Number:\t");
			b=sc.nextInt();
			System.out.println("Enter The Third Number:\t");
			c=sc.nextInt();
			System.out.println("Please enter S for smallest number And L for largest number:\t");
			e=sc.next();
		}
		int smallestNumber(){
			p++;
			if ((a<b)&&(a<c))
				d=a;
			else if ((b<a)&&(b<c))
				d=b;
			else 
				d=c;
			return d;
		}
		int greatestNumber(){
			p=p+2;
			if ((a>b)&&(a>c))
				d=a;
			else if ((b<a)&&(b>c))
				d=b;
			else
				d=c;
			return d;
		}
		void putData(){
			if (p==1)
				System.out.println("The smallest number of three given numbers is:\t"+d);
			if (p==2)
				System.out.println("The largest number of three given numbers is:\t"+d);
		}	
	public static void main(String[] args){
		FindTheGreatestOrSmallestNumber fn=new FindTheGreatestOrSmallestNumber();
		System.out.println("This application generates the largest or smallest of three given numbers");
		fn.getData();
		if ((e.equals("s"))||(e.equals("S")))
			fn.smallestNumber();
		else if ((e.equals("l"))||(e.equals("L")))
			fn.greatestNumber();
		fn.putData();
		
	}
	
}