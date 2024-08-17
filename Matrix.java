import java.util.*;
class Matrix{
		Scanner sc=new Scanner(System.in);
		int ans;
		int[][] matrix=new int[2][2];
		void getData(){		
			System.out.println("Enter the first number");
			matrix[0][0]=sc.nextInt();
			System.out.println("Enter the second number");
			matrix[0][1]=sc.nextInt();
			System.out.println("Enter the third number");
			matrix[1][0]=sc.nextInt();
			System.out.println("Enter the fourth number");
			matrix[1][1]=sc.nextInt();
		}
		void processData(){
			if ((matrix[0][0]>matrix[0][1])&&(matrix[0][0]>matrix[1][0])&&(matrix[0][0]>matrix[1][1]))
				ans=matrix[0][0];
			else if ((matrix[0][1]>matrix[0][0])&&(matrix[0][1]>matrix[1][1])&&(matrix[0][1]>matrix[1][0]))
				ans=matrix[0][1];
			else if ((matrix[1][0]>matrix[0][0])&&(matrix[1][0]>matrix[0][1])&&(matrix[1][0]>matrix[1][1]))
				ans=matrix[1][0];
			else if ((matrix[1][1]>matrix[0][0])&&(matrix[1][1]>matrix[0][1])&&(matrix[1][1]>matrix[1][0]))
				ans=matrix[1][1];
			else if ((matrix[0][0]==matrix[0][1])||(matrix[0][0]==matrix[1][0])||(matrix[0][0]==matrix[1][1])||(matrix[0][1]==matrix[0][0])||(matrix[0][1]==matrix[1][1])||(matrix[0][1]==matrix[1][0])||(matrix[1][0]==matrix[0][0])||(matrix[1][0]==matrix[0][1])||(matrix[1][0]==matrix[1][1])||(matrix[1][1]==matrix[0][0])||(matrix[1][1]==matrix[0][1])||(matrix[1][1]==matrix[1][0])){
				System.out.println("Function Unavailable");
				System.exit(0);
			}
			System.out.println("|"+"\t"+matrix[0][0]+" \t"+matrix[0][1]+"\t|\n|"+"\t"+matrix[1][0]+" \t"+matrix[1][1]+"\t|");
			System.out.println("The greatest Number is"+" "+ans);
		}			
		public static void main(String[] args){
			Matrix m=new Matrix();
			System.out.println("This application asks the user for 4 numbers and then finds the greatest number");
			m.getData();
			m.processData();
	}
}	