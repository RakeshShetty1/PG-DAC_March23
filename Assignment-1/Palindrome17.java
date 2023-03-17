import java.util.*;
class Palindrome17{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = scan.nextInt();
		int rev=0;
		int rem=0;
		int temp=no;
		for(;temp!=0;temp=temp/10){
			rem = temp%10;
			rev=rev*10+rem;
		}
		if(rev==no){
			System.out.println(no+" is a Palindrome number.");
		}else{
			System.out.println(no+" is not a Palindrome number.");
		}
			
	}
}