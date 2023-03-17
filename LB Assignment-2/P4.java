class P4{
public static void main(String args[]){
	int n = 9;
	for(int i =1;i<=n;i++){
		for(int j =n;j>i;j--){
		System.out.print("  ");
		}for(int k=1;k<i;k++){
			System.out.print(k+" ");
		}for(int z=i;z>=1;z-- ){
			System.out.print(z+" ");
		}
		System.out.println();
		
	}
}
}