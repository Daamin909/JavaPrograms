import java.util.*; 
class whichOperatorDoYouWant{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,d;
		char operator;
		float c=0;
		System.out.println("This application asks for a operator and three numbers and then give the result");		
		System.out.print("Enter the first number:\t");	
		a=sc.nextInt();
		System.out.print("Enter the second number:\t");	
		b=sc.nextInt();
		System.out.print("Enter the third number:\t");	
		d=sc.nextInt();
		System.out.print("Enter the operator + - * / :\t");	
		operator=sc.next().charAt(0);
		if(operator=='+')
			c=a+b+d;
		else if(operator=='-') 
			c=a-b-d;
		else if(operator=='*') 
			c=a*b*d;
		else if(operator=='/') 
			c=a/b/d;
		else
			System.out.println("Invalid OPERATOR.Quiting.......");
		System.out.println("The result obtained is \t"+c);
		
	}
}
		