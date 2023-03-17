class P7{
public static void main(String args[]){
	int n = 9;
	int z = n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<i;j++){
			System.out.print(" ");
		}for(int k=n;k>=i;k--){
			System.out.print(z+" ");
		}z--;
		System.out.println();
	}
}
}