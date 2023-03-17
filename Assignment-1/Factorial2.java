import java.util.*;
class Factorial2{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int no = scan.nextInt();
	int ans =1;
	for(int i = 2;i<=no;i++){
		ans *= i;
	}
	System.out.print("Factorial of "+no+" is: "+ans);
	}
}