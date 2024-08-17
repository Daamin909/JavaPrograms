import java.util.*;
class toLowerCase{
	public static void main(String[] args){
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("\"This application changes the given word to lower case\"");
		System.out.println("Enter the word:\t");
		name=sc.next();
		System.out.println(name.toLowerCase());
	}
}