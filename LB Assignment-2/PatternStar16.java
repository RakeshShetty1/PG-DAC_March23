class PatternStar16
{
	public static void main(String args[]){
		int n = 5;
		for(int i=1;i<=n;i++){
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(i==n||j==1){
					System.out.print("*");	
				}else if(j==i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		}
	}
