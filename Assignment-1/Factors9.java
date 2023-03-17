import java.util.*;
class Factors9{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	int no = scan.nextInt();
	System.out.println("The factors of "+no+" are:");
	for(int i=1;i<=no;i++){
		if(no%i==0){
			System.out.println(i);
		}
	}
}
}