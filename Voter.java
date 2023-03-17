//Write a java program to identify the eligibility of voter for coming elections.
import java.util.*;
class Voter{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter age for voting eligibility: ");
		int a = scan.nextInt();
		String age = (a>=18)?"You are eligibile.":"You are not eligibile.";
		System.out.print(age);
		
	}
}
