class P5{
public static void main(String args[]){
	int n = 9;
	for(int i =n;i>=1;i--){
		for(int j=1;j<i;j++){
		System.out.print("  ");
		}for(int k=i;k<n;k++){
			System.out.print(k+" ");
		}for(int z=n;z>=i;z-- ){
			System.out.print(z+" ");
		}
		System.out.println();
		
	}
}
}