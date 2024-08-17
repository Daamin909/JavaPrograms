import java.util.*;
class AscendingOrDescendingOrder{
		static int a=0, b=0, d=0, x=1, p=1, m=0;
		static String c;
		static int[] an=new int [3];
		static int[] dn=new int [3];
		Scanner sc=new Scanner (System.in);
		void getDataOne(){
			for (int a=0; a<=2; a++){
				System.out.println("Enter the\t"+p+"\tnumber:\t");
				an [a]=sc.nextInt();
				p++;
				m=11;
			}		
		}
		void getDataTwo(){
			for (int b=0; b<=2; b++){
				System.out.println("Enter the\t"+x+"\tnumber:\t");
				dn [b]=sc.nextInt();
				x++;
				m=12;
			}	
		}
		void descendingOrder(){
			if ((dn[0]>dn[1])&&(dn[0]>dn[2]))
			{
				if (dn[1]>dn[2])
					System.out.println("Highest number is\t"+dn[0]+"\tSecond Highest number is\t"+dn[1]+"\tsmallest number is\t"+dn[2]);
				else
					System.out.println("Highest number is\t"+dn[0]+"\tSecond Highest number is\t"+dn[2]+"\tsmallest number is\t"+dn[1]);
			}
			else if ((dn[1]>dn[0])&&(dn[1]>dn[2]))
			{
				if (dn[0]>dn[2])
					System.out.println("Highest number is\t"+dn[1]+"\tSecond Highest number is\t"+dn[0]+"\tsmallest number is\t"+dn[2]);
				else
					System.out.println("Highest number is\t"+dn[1]+"\tSecond Highest number is\t"+dn[2]+"\tsmallest number is\t"+dn[0]);
			}
			else
			{
				if (dn[1]>dn[0])
					System.out.println("Highest number is\t"+dn[2]+"\tSecond Highest number is\t"+dn[1]+"\tsmallest number is\t"+dn[0]);
				else
					System.out.println("Highest number is\t"+dn[2]+"\tSecond Highest number is\t"+dn[0]+"\tsmallest number is\t"+dn[1]);
			}
		}
		void ascendingOrder(){
			if ((an[0]<an[1])&&(an[0]<an[2]))
			{
				if (an[1]<an[2])
					System.out.println("smallest number is\t"+an[0]+"\tSecond smallest number is\t"+an[1]+"\tHighest number is\t"+an[2]);
				else
					System.out.println("smallest number is\t"+an[0]+"\tSecond smallest number is\t"+an[2]+"\tHighest number is\t"+an[1]);
			}
			else if ((an[2]<an[1])&&(an[2]<an[0]))
			{
				if (an[0]<an[1])
					System.out.println("smallest number is\t"+an[2]+"\tSecond smallest number is\t"+an[0]+"\tHighest number is\t"+an[1]);
				else
					System.out.println("smallest number is\t"+an[2]+"\tSecond smallest number is\t"+an[1]+"\tHighest number is\t"+an[0]);
			}
				else 
			{
				if (an[0]<an[2])
					System.out.println("smallest number is\t"+an[1]+"\tSecond smallest number is\t"+an[0]+"\tHighest number is\t"+an[2]);
				else
					System.out.println("smallest number is\t"+an[1]+"\tSecond smallest number is\t"+an[2]+"\tHighest number is\t"+an[0]);
			}
		}
	public static void main(String[] args){
		AscendingOrDescendingOrder ad=new AscendingOrDescendingOrder();
		Scanner sc=new Scanner (System.in);
		System.out.println("\t\tThis application takes 3 numbers from the user and arrange it in ascending or descending order as per your input\n\n");
		System.out.println("Please enter A for ascending order and D for descending order:\t");
		c=sc.next();
		if ((c.equals("a"))||(c.equals("A")))
			ad.getDataOne();
		else if ((c.equals("d"))||(c.equals("D")))
			ad.getDataTwo();
		else
			System.out.println("Wrong input. Please try again later....");
		if (m==11)
			ad.ascendingOrder();
		if (m==12)
			ad.descendingOrder();
	}
}