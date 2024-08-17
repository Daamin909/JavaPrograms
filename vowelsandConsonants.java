import java.util.*;
class vowelsAndconsonants{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char a;
		System.out.println("This application asks for an alphabet and then tells if it is a vowel or consonant");		
		System.out.print("Enter an alphabet:\t");	
		a=sc.next().charAt(0);
		switch  (a){
			case 'A': 
			case 'a':
			    System.out.println("The letter 'A' is a vowel");
			    break;
			case 'B':
			case 'b':
			    System.out.println("The letter 'B' is a consonant");
			    break;
			case 'C':
			case 'c':
			    System.out.println("The letter 'C' is a consonant");
			    break;
			case 'D':
			case 'd':
			    System.out.println("The letter 'D' is a consonant");
			    break;
			case 'E':
			case 'e':
			    System.out.println("The letter 'E' is a vowel");
			    break;
			case 'F':
			case 'f':
			    System.out.println("The letter 'F' is a consonant");
			    break;
			case 'G':
			case 'g':
			    System.out.println("The letter 'G' is a consonant");
			    break;
			case 'H':
			case 'h':
			    System.out.println("The letter 'H' is a consonant");
			    break;
			case 'I':
			case 'i':
			    System.out.println("The letter 'I' is a vowel");
			    break;
			case 'J':
			case 'j':
			    System.out.println("The letter 'J' is a consonant");
			    break;
			case 'K':
			case 'k':
			    System.out.println("The letter 'K' is a consonant");
			    break;
			case 'L':
			case 'l':
			    System.out.println("The letter 'L' is a consonant");
			    break;
			case 'M':
			case 'm':
			    System.out.println("The letter 'M' is a consonant");
			    break;
			case 'N':
			case 'n':
			    System.out.println("The letter 'N' is a consonant");
			    break;
			case 'O':
			case 'o':
			    System.out.println("The letter 'O' is a vowel");
			    break;
			case 'P':
			case 'p':
			    System.out.println("The letter 'P' is a consonant");
			    break;
			case 'Q':
			case 'q':
			    System.out.println("The letter 'Q' is a consonant");
			    break;
			case 'R':
			case 'r':
			    System.out.println("The letter 'R' is a consonant");
			    break;
			case 'S':
			case 's':
			    System.out.println("The letter 'S' is a consonant");
			    break;
			case 'T':
			case 't':
			    System.out.println("The letter 'T' is a consonant");
			    break;
			case 'U':
			case 'u':
			    System.out.println("The letter 'U' is a vowel");
			    break;
			case 'V':
			case 'v':
			    System.out.println("The letter 'V' is a consonant");
			    break;
			case 'W':
			case 'w':
			    System.out.println("The letter 'W' is a consonant");
			    break;
			case 'X':
			case 'x':
			    System.out.println("The letter 'X' is a consonant");
			    break;
			case 'Y':
			case 'y':
			    System.out.println("The letter 'Y' is a consonant");
			    break;
			case 'Z':
			case 'z':
			    System.out.println("The letter 'Z' is a consonant");
			    break;
			default:
				System.out.println("Invalid Command Please try again later");
				break;
				}
	}
}
		
