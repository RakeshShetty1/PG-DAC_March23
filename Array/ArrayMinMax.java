//Printing Min-Max from 1D Array
import java.util.*;
class ArrayMinMax{
public static void main(String main[]){
	Scanner sc = new Scanner(System.in);
   int arr[]=new int[5] ;
   for(int i=0;i<arr.length;i++){
	   System.out.print("Enter Element for index "+i+" : ");
	   arr[i]=sc.nextInt();
   }
   int x = arr[0];
   //For Min
    System.out.print("Min Element: ");
   for(int i=0;i<arr.length;i++){
	   if(arr[i]<x){
		   x=arr[i];	   
	   }
   }System.out.println(x); 
   System.out.print("Min Element: ");   
   for(int i=0;i<arr.length;i++){
	   if(arr[i]>x){
		   x=arr[i];	   
	   }
   }System.out.println(x);     
  }
}