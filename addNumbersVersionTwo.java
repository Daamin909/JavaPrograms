import java.util.Scanner;
class addNumbersVersionTwo{
	public static void main(String[] args){
		int a,b,c,d,e,f,g,h,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("This application generates sum of ten numbers given by the user\n");
		System.out.println("Enter first number:\t");
		a=sc.nextInt();
		System.out.println("Enter second number:\t");
		b=sc.nextInt();
		System.out.println("Enter third number:\t");
		c=sc.nextInt();
		System.out.println("Enter fourth number:\t");
		d=sc.nextInt();
		System.out.println("Enter fifth number:\t");
		e=sc.nextInt();
		System.out.println("Enter sixth number:\t");
		f=sc.nextInt();
		System.out.println("Enter seventh number:\t");
		g=sc.nextInt();
		System.out.println("Enter eighth number:\t");
		h=sc.nextInt();
		System.out.println("Enter ninth number:\t");
		i=sc.nextInt();
		System.out.println("Enter tenth number:\t");
		j=sc.nextInt();
		k=addition(a,b,c,d,e,f,g,h,i,j);
		System.out.println("Addition of ten numbers is :\t "+k);
		}
		static int addition(int l, int m, int n, int o, int p, int q, int r, int s, int t, int u){
		return l+m+n+o+p+q+r+s+t+u;
		/*This program adds ten numbers that are given by the user*/
	}
}