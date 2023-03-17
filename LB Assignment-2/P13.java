class P13
{
public static void main(String args[]){
	int n = 6;
	for(int i=1;i<=n;i++){
		for(int j=n;j>i;j--){
			System.out.print("  ");
		}for(int k=1;k<=i;k++){
			if(i==n||k==1){
			System.out.print("*   ");
			}else if(k==i){
				System.out.print("*   ");
			}else{
				System.out.print("    ");
			}
	}System.out.println();
	}
}}