import java.lang.*;
import java.io.*;
import java.util.*;
class DecimalToBinary{

	static long decimal, binary, c, a, b;
	static String result=" ";
	Scanner sc=new Scanner(System.in);
	
	
	void doAll(){
		System.out.println("This application converts a decimal number to binary");
		try{
		System.out.println("Enter the decimal number:");
		decimal=sc.nextLong();
		}

		catch(InputMismatchException ime){
			System.out.println("Invalid Input, Please try again");
			System.exit(0);
		}

		if (decimal==1){
			System.out.println("\n1");
			System.exit(0);
		}
		else if(decimal==0){
			System.out.println("\n0");
			System.exit(0);
		}

		for(a=0; a<=2147483647; a++){

			if((decimal!=0)&&(decimal!=1)){
				c=decimal%2;
				decimal=decimal/2;
				result= result.concat(Long.toString(c));

			}
			else if(decimal==1){
				decimal=0;
				result= result.concat("1");
			}
			else if(decimal<=0){
				StringBuilder ans = new StringBuilder();
				ans.append(result);
				ans.reverse();
				System.out.println("\n\n\n"+ans);
				System.exit(0);	
			}		
		}
	}
	public static void main(String[] args){
		DecimalToBinary binary=new DecimalToBinary();
		binary.doAll();
	}
}								