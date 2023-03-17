class PatternStar7{
	public static void main(String args[]){
		int n = 5;
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<i;k++){
				System.out.print("*");
			}
			for(int j=2;j<i;j++){
				System.out.print("*");
			}System.out.println();
		}for(int i=1;i<=n;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--){
				System.out.print("*");
			}
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}System.out.println();
		}
	}
}