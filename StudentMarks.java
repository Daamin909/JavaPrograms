import java.util.*;
class StudentMarks{
		int a;
		String[] name;
		int[] rn;
		int[] english;
		int[] maths;
		int[] science;
		int[] result;
		Scanner sc=new Scanner (System.in);
		

		void getStudents(){
			System.out.println("Enter the number of students:\t");
			a=sc.nextInt();
			name =new String [a];
			rn =new int[a];
			english =new int[a];
			maths =new int[a];
			science =new int[a];
			result =new int[a];
		}

		void getData(){
			int x=1;
			for (int b=0; b<a;b++){
				System.out.print("\n\nEnter the name of the" +" " +x+" " +"student:\t");
				name[b]=sc.next();
				System.out.print("Enter the roll no of "+" "+name[b]+"\t");
				rn [b]=sc.nextInt();
				System.out.print("Enter the English marks of "+" "+name[b]+"\t");
				english [b]=sc.nextInt();
				System.out.print("Enter the maths marks of "+" "+name[b]+"\t");
				maths [b]=sc.nextInt();
				System.out.print("Enter the science marks of "+" "+name[b]+"\t");
				science [b]=sc.nextInt();
				result [b]=english [b]+maths [b]+science [b];
				x++;
			}
		}
		
		void putData(){
			for (int c=0; c<a; c++){
				System.out.println(name [c]);
				System.out.println(rn [c]);
				System.out.println(result [c]+"\n\n");
			}
		}
	public static void main(String[] args){
		StudentMarks sm= new StudentMarks();
		System.out.println("This application displays the result of the students given by the user\n\n");
		
		sm.getStudents();	
		sm.getData();
		sm.putData();

	}
}	