import java.util.*;
class PosNeg5{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int no = scan.nextInt();
		String ans = (no>=0)?((no>0)?"Positive Number.":"Zero."):"Negative Number.";
		System.out.print(no+" is a "+ans);
		
	}
}