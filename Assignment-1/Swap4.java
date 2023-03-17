import java.util.*;
class Swap4{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter 1st number to swap: ");
	int a = scan.nextInt();
	System.out.print("Enter 2st number to swap: ");
	int b = scan.nextInt();
	System.out.println("Before Swapping: "+"\n"+"A:"+a+" B:"+b);
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("After Swapping: "+"\n"+"A:"+a+" B:"+b);
}
}
