class P10
{
public static void main(String args[]){
	int n = 6;
	for(int i=n;i>=1;i--){
		for(int j=1;j<=i;j++){
			if(i==n||j==1){
			System.out.print("*");
		}else if(j==i){
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
		
	}System.out.println();
}}}