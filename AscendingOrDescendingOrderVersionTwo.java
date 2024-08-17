import java.util.*;
class AscendingOrDescendingOrderVersionTwo{
		static int a, b, check, x=1, z=9, temp;
		static String asdDsd;
		int[] num=new int [10];
		Scanner sc=new Scanner (System.in);
		
		void getData(){
			for(b=0; b<=9; b++){
				System.out.println("Enter the"+" "+x+" "+"number:\t");
				num[b]=sc.nextInt();
				x++;
			}
			System.out.println("Please enter \"A\" for ascending order and \"D\" for descending order:\t");
			asdDsd=sc.next();
			System.out.println(asdDsd);
			if ((asdDsd.equals("d"))|(asdDsd.equals("?d")))
				descendingOrder();
			else if ((asdDsd.equals("d"))|(asdDsd.equals("d")))
				ascendingOrder();
			else if(check==0)
				System.out.println("Invalid input. Please try again later");
		}
		void ascendingOrder(){
			x=1;
			b=0;
			a=0;
			for (b=0; b<=10; b++){
				for (a=0; a<=z; a++){
					if (num[b]<num[x]){
						temp=num[x];
						num[x]=num[b];
						num[b]=temp;
						z--;
						x++;
						check=20;
					}
				}
			}
			putData();
		}
		void descendingOrder(){
			x=1;
			b=0;
			a=0;
			for (b=0; b<=10; b++){
				for (a=0; a<=z; a++){
					if (num[b]<num[x]){
						temp=num[x];
						num[x]=num[b];
						num[b]=temp;
						z--;
						x++;
						check=20;
						System.out.println(num[0]+"\t"+num[1]+"\t"+num[2]+"\t"+num[3]+"\t"+num[4]+"\t"+num[5]+"\t"+num[6]+"\t"+num[7]+"\t"+num[8]+"\t"+num[9]);
					}
				}
			}
			putData();	
		}
		void putData(){
			if (check==10){
				System.out.println("The following are arranged in ascending order");
				System.out.println(num[0]+"\t"+num[1]+"\t"+num[2]+"\t"+num[3]+"\t"+num[4]+"\t"+num[5]+"\t"+num[6]+"\t"+num[7]+"\t"+num[8]+"\t"+num[9]);
			}
			if (check==20){
				System.out.println("The following are arranged in descending order");
				System.out.println(num[0]+"\t"+num[1]+"\t"+num[2]+"\t"+num[3]+"\t"+num[4]+"\t"+num[5]+"\t"+num[6]+"\t"+num[7]+"\t"+num[8]+"\t"+num[9]);
			}
		}
	public static void main(String[] args){
		AscendingOrDescendingOrderVersionTwo aodovt= new AscendingOrDescendingOrderVersionTwo();
		System.out.println("This application arranges the given number in descending or ascending order\n\n");
		aodovt.getData();

	}
}	