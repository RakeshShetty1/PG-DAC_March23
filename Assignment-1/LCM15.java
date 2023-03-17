import java.util.*;
class LCM15{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		int n1 = scan.nextInt();
		System.out.print("Enter 2st Number:");
		int n2 = scan.nextInt();
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++){
			if(n1%i==0 && n2%i==0){
				gcd=i;
			}
		}int lcm=(n1*n2)/gcd;
				System.out.println("The LCM of "+n1+" and "+n2+" is:");
System.out.println(lcm);
	}
}
