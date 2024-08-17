import java.util.*;
class StringConcatination{
		
	static String q1, q2, ans;
	Scanner sc=new Scanner(System.in);	

	void doAll(){
		System.out.println("This program asks for two strings and concatinates them");
		System.out.println("Enter the first String");
		q1=sc.next();
		System.out.println("Enter the second String");
		q2=sc.next();
		printer();
	}
	void printer(){	
		ans=new StringBuilder().append(q1).append(q2).toString();
		System.out.println(ans);
	}
		
	public static void main(String[] args){
		StringConcatination strc=new StringConcatination();
		strc.doAll();
	}
}