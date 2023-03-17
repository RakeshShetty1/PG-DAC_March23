import java.util.Scanner;
class SmallestNo11{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = scan.nextInt();
		System.out.println("Enter value of b: ");
		int b = scan.nextInt();
		System.out.println("Enter value of c: ");
		int c = scan.nextInt();
		int min = (a<b?((a<c)?a:c):((b<c)?b:c));
		System.out.println("The smallest value: "+min);
}}
