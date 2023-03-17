import java.util.*;
class RevNo13{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	int no = scan.nextInt();
	System.out.println("After reversing the number:");
	int rem=1;
	int rev=0;
	for(;no!=0;no=no/10){
		rem = no%10;
		rev=rev*10+rem;
	}
    System.out.println(rev);
}}