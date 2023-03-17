import java.util.*;
class EvenSeries19{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Start Number: ");
		int no1 = scan.nextInt();
		System.out.print("End Number: ");
		int no2 = scan.nextInt();
		System.out.println("Printing Even Numbers from "+no1+" to "+no2);
		for(;no1<=no2;no1++){
			if(no1%2==0){
				System.out.println(no1);
			}
		}
		
	}
}