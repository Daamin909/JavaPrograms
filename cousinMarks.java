import java.util.*;
class cousinMarks{
	public static void main(String[] args){
		int a;
		String b;
		Scanner sc=new Scanner(System.in);
		String[] name =new String [10];
		name [0]="Abeer Naqshbandi";
		name [1]="Dawar Ashai";
		name [2]="Daamin Ashai";
		name [3]="Shayaan Tramboo";
		name [4]="Ryan Tramboo";
		name [5]="Zaroon Naqshbandi";
		name [6]="Tahoor Farooqi";
		name [7]="Dawood Farooqi";
		name [8]="Essa Reshi";
		name [9]="Midaah Reshi";
		String[] age =new String [10];
		age [0]="9";
		age [1]="4";
		age [2]="9";
		age [3]="11";
		age [4]="5";
		age [5]="4";
		age [6]="14";
		age [7]="15";
		age [8]="15";
		age [9]="12";
		String[] dawarMarks =new String [3];
		dawarMarks [0]="97.5/100";
		dawarMarks [1]="99.5/100";
		dawarMarks [2]="99/100";
		String[] daaminMarks =new String [3];
		daaminMarks [0]="94.5/100";
		daaminMarks [1]="99.5/100";
		daaminMarks [2]="98.5/100";
		String[] abeerMarks =new String [3];
		abeerMarks [0]="96.5/100";
		abeerMarks [1]="99.5/100";
		abeerMarks [2]="95.5/100";
		String[] shayaanMarks =new String [3];
		shayaanMarks [0]="94.5/100";
		shayaanMarks [1]="99.5/100";
		shayaanMarks [2]="98.5/100";
		String[] zaroonMarks =new String [3];
		zaroonMarks [0]="94.5/100";
		zaroonMarks [1]="99.5/100";
		zaroonMarks [2]="98.5/100";
		String[] ryanMarks =new String [3];
		ryanMarks [0]="94.5/100";
		ryanMarks [1]="99.5/100";
		ryanMarks [2]="98.5/100";
		String[] dawoodMarks =new String [3];	
		dawoodMarks [0]="94.5/100";								
		dawoodMarks [1]="99.5/100";
		dawoodMarks [2]="98.5/100";
		String[] tahoorMarks =new String [3];
		tahoorMarks [0]="94.5/100";
		tahoorMarks [1]="99.5/100";
		tahoorMarks [2]="98.5/100";
		String[] essaMarks =new String [3];
		essaMarks [0]="94.5/100";
		essaMarks [1]="99.5/100";
		essaMarks [2]="98.5/100";
		String[] midaahMarks =new String [3];
		midaahMarks [0]="94.5/100";
		midaahMarks [1]="99.5/100";
		midaahMarks [2]="98.5/100";
		System.out.println("Please enter the password for privacy reasons:\t");
		a=sc.nextInt();
		if (a==1004)
		{
				System.out.println("Daamin/Dawar/Abeer/ Zaroon/ Shayaan/Ryan/Tahoor/Dawood/Essa/Midaah\n\n");
				System.out.println("Type any name from the above list to know there age and marks:\t");	
				b=sc.next();
			if(b.equals("Daamin"))
			{
				System.out.println(name[2]);
				System.out.println("Age\t"+age [2]);
				System.out.println("English\t"+daaminMarks[0]);
				System.out.println("Maths\t"+daaminMarks[1]);
				System.out.println("Science\t"+daaminMarks[2]);
			}
			else if(b.equals("Dawar"))
			{
				System.out.println(name[1]);
				System.out.println("Age\t"+age [1]);
				System.out.println("English\t"+dawarMarks[0]);
				System.out.println("Maths\t"+dawarMarks[1]);
				System.out.println("Science\t"+dawarMarks[2]);
			}
			else if(b.equals("Abeer"))
			{
				System.out.println(name[0]);
				System.out.println("Age\t"+age [0]);
				System.out.println("English\t"+abeerMarks[0]);
				System.out.println("Maths\t"+abeerMarks[1]);
				System.out.println("Science\t"+abeerMarks[2]);
			}
			else if(b.equals("Zaroon"))
			{
				System.out.println(name[5]);
				System.out.println("Age\t"+age [5]);
				System.out.println("English\t"+zaroonMarks[0]);
				System.out.println("Maths\t"+zaroonMarks[1]);
				System.out.println("Science\t"+zaroonMarks[2]);
			}
			else if(b.equals("Shayaan"))
			{
				System.out.println(name[3]);
				System.out.println("Age\t"+age [3]);
				System.out.println("English\t"+shayaanMarks[0]);
				System.out.println("Maths\t"+shayaanMarks[1]);
				System.out.println("Science\t"+shayaanMarks[2]);
			}
			else if(b.equals("Ryan"))
			{
				System.out.println(name[4]);
				System.out.println("Age\t"+age [4]);
				System.out.println("English\t"+ryanMarks[0]);
				System.out.println("Maths\t"+ryanMarks[1]);
				System.out.println("Science\t"+ryanMarks[2]);
			}
			else if(b.equals("Tahoor"))
			{
				System.out.println(name[6]);
				System.out.println("Age\t"+age [6]);
				System.out.println("English\t"+tahoorMarks[0]);
				System.out.println("Maths\t"+tahoorMarks[1]);
				System.out.println("Science\t"+tahoorMarks[2]);
			}
			else if(b.equals("Dawood"))
			{
				System.out.println(name[7]);
				System.out.println("Age\t"+age [7]);
				System.out.println("English\t"+dawoodMarks[0]);
				System.out.println("Maths\t"+dawoodMarks[1]);
				System.out.println("Science\t"+dawoodMarks[2]);
			}
			else if(b.equals("Essa"))
			{
				System.out.println(name[8]);
				System.out.println("Age\t"+age [8]);
				System.out.println("English\t"+essaMarks[0]);
				System.out.println("Maths\t"+essaMarks[1]);
				System.out.println("Science\t"+essaMarks[2]);
			}
			else if(b.equals("Midaah"))
			{
				System.out.println(name[9]);
				System.out.println("Age\t"+age [9]);
				System.out.println("English\t"+midaahMarks[0]);
				System.out.println("Maths\t"+midaahMarks[1]);
				System.out.println("Science\t"+midaahMarks[2]);	
			}
			else
				System.out.println("Incorrect Name.Please try again later");
	}                                                                                                                                                 
	else
	System.out.println("Incorrect Password. Please try again later");
			
	}
}