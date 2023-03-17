import java.util.*;
class DigitSum10{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	int no = scan.nextInt();
	int sum =0;
	for(;no>0;no/=10){
	int rem=no%10;
	sum+=rem;
	}
	System.out.println("The sum of the digits is:");
	System.out.println(sum);
	}
}