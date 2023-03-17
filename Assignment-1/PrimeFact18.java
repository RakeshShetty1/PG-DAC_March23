import java.util.*;
class PrimeFact18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int prime = 0;
		System.out.println("Enter a number:");
		int no = sc.nextInt();
		System.out.println("Prime Factors are:");
		
		for(int i=2;i<no/2;i++){
			if(no%i==0)
			prime = 1;
			 
			{for(int j=2;j<i;j++){
				if(i%j==0){
					prime=0;
					break;
				}
			}if(prime==1){
				System.out.println(i);
			}
				
			}
	
}}}