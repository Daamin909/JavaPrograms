import java.io.*;
import java.util.*;
class Shutdown{
	public static void main(String[] args) throws IOException{   
		long a;
		Runtime run = Runtime.getRuntime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the time after which you want the computer to shutdown");
		a=sc.nextLong();
		Process pro = run.exec("shutdown -s -t " + a);
		System.exit(0);		
	}
}