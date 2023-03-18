//+ , - , * of 2D Arrays
import java.util.*;
class ArrayAddSubMul{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][3];
        int b[][]=new int[3][3];
		int c[][]= new int[3][3];		
        System.out.println("Matrix A:");	
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){ 
				System.out.print("Element at index ("+i+","+j+"): ");
				a[i][j]=sc.nextInt();
		}}
		System.out.println("Displaying Matrix A:");
       	for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){ 
				System.out.print(a[i][j]+" ");
		}System.out.println();}  
		System.out.println();
        System.out.println("Matrix B:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){ 
				System.out.print("Element at index ("+i+","+j+"): ");
				b[i][j]=sc.nextInt();
		}}
		System.out.println("Displaying Matrix B:");
       	for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){ 
				System.out.print(b[i][j]+" ");
		}System.out.println();}
		System.out.println();
		
		System.out.println("Enter 1 or 2:"+"\n"+"1. Addition"+"\n"+"2. Subtraction"+"\n"+"3. Multiplication");
		int z = sc.nextInt();
		
		switch(z){
			case 1:System.out.println("Addition of Matrix"+"\n"+"Matrix C:");
	               for(int i=0;i<3;i++){
			         for(int j=0;j<3;j++){
				      c[i][j]=a[i][j]+b[i][j];
				      System.out.print(c[i][j]+" ");
		         	}System.out.println();
		            };
					break;
			case 2:System.out.println("Subtraction of Matrix"+"\n"+"Matrix C:");
	               for(int i=0;i<3;i++){
			         for(int j=0;j<3;j++){
				      c[i][j]=a[i][j]-b[i][j];
				      System.out.print(c[i][j]+" ");
		         	}System.out.println();
		            };
					break;
			case 3:	System.out.println("Multiplication of Matrix"+"\n"+"Matrix C:");
	               for(int i=0;i<3;i++){
			         for(int j=0;j<3;j++){
				      c[i][j]=a[i][j]*b[i][j];
				      System.out.print(c[i][j]+" ");
		         	}System.out.println();
		            };
					break;	
			default:System.out.println("Enter a valid number");
		}
		
		
	}
}