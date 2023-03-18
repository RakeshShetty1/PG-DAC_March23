//Printing the Array 1D
import java.util.*;
class ArrayPrint{
public static void main(String main[]){
	Scanner sc = new Scanner(System.in);
   int arr[]=new int[5] ;
   for(int i=0;i<arr.length;i++){
	   System.out.print("Enter Element for index "+i+" : ");
	   arr[i]=sc.nextInt();
   }
    System.out.println("Array Elements:");
   for(int a: arr){
	   System.out.print(a+" ");
   }
}
}