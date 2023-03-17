import java.util.Scanner;
class EvenOdd1{
	public static void main(String args[]){
		int a;
		System.out.print("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		// Using if-else 
		/*if(a%2==0){
			System.out.println("It is an even number");
		}else{
			System.out.println("It is an odd number");
		}*/
		//Using ternary operator
		String eo = (a%2==0)?"It is an even number.":"It is an odd number.";
		System.out.println(eo);
	}
}