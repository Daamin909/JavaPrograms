import java.util.*;
class yourDetails{
	public static void main(String[] args){
		String name,surname,age,colour;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:\t");
		name=sc.next();
		System.out.println("Enter your surname:\t");
		surname=sc.next();
		System.out.println("Enter your age:\t");
		age=sc.next();
		System.out.println("Enter your favourite colour:\t");
		colour=sc.next();
		System.out.println("\tHi\t"+name.toUpperCase()+"\t"+surname.toUpperCase()+"\nYou are\t"+age.toUpperCase()+"\tyears old\nYour favourite colour is\t"+colour.toUpperCase());
	}
}