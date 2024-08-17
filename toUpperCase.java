import java.util.*;
class toUpperCase{
	public static void main(String[] args){
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("\"This application changes the given word to upper case\"");
		System.out.println("Enter the word:\t");
		name=sc.next();
		System.out.println(name.toUpperCase());
	}
}