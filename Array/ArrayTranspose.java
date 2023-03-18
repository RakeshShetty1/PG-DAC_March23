//Addition of 2D Arrays
import java.util.*;
class ArrayTranspose{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][3];
        int b[][]=new int[3][3];	
        System.out.println("Matrix :");	
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){ 
				System.out.print("Element at index ("+i+","+j+"): ");
				a[i][j]=sc.nextInt();
		}}for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){ 
		   b[i][j]=a[j][i];}}
		   System.out.println();
		
		System.out.println("Displaying Matrix");
       	for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){ 
				System.out.print(a[i][j]+" ");
		}System.out.println();}  
		System.out.println();
  
		System.out.println("Displaying Transpose Matrix");
       	for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){ 
				System.out.print(b[i][j]+" ");
		}System.out.println();}
		System.out.println();
		
	}
}