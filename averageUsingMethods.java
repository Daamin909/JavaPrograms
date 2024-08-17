import java.util.*;
class averageUsingMethods{
	public static void main(String[] args){
		int a, b, c, d, e, f, g, h, i, j, ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("This application gives the average of the ten given numbers");
		System.out.println("Enter the first number:\t");
		a=sc.nextInt();
		System.out.println("Enter the second number:\t");
		b=sc.nextInt();
		System.out.println("Enter the third number:\t");
		c=sc.nextInt();
		System.out.println("Enter the fourth number:\t");
		d=sc.nextInt();
		System.out.println("Enter the fifth number:\t");
		e=sc.nextInt();
		System.out.println("Enter the sixth number:\t");
		f=sc.nextInt();
		System.out.println("Enter the seventh number:\t");
		g=sc.nextInt();
		System.out.println("Enter the eighth number:\t");
		h=sc.nextInt();
		System.out.println("Enter the ninth number:\t");
		i=sc.nextInt();
		System.out.println("Enter the tenth number:\t");
		j=sc.nextInt();
		ans=average(a,b,c,d,e,f,g,h,i,j);
		System.out.print(" average of ten numbers is");
		System.out.print(" ");
		System.out.print(ans);
		
	}
		static int average(int l,int m,int n,int o,int p,int q,int r,int s,int t,int u){
		int z;
		z=l+m+n+o+p+q+r+s+t+u;
		z=z/10;
		return z;
		}
}
