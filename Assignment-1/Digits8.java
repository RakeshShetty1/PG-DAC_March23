import java.util.*;
class Digits8{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number:");
	int no = scan.nextInt();
	System.out.println("The digits are from right to left:");
	for(;no>0;no/=10){
	System.out.println(no%10);
	}
	}
	}