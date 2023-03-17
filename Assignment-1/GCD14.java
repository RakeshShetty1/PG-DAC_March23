import java.util.*;
class GCD14{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		int n1 = scan.nextInt();//6
		System.out.print("Enter 2st Number:");
		int n2 = scan.nextInt();//18
		int gcd=1;
		System.out.println("The GCD of "+n1+" and "+n2+" is:");
		for(int i=1;i<=n1 && i<=n2;i++){
			if(n1%i==0 && n2%i==0){
				gcd=i;
			}
		}System.out.println(gcd);
	}
}
