//Search a number from Array
import java.util.*;
class ArraySearch{
public static void main(String main[]){
	Scanner sc = new Scanner(System.in);
   int arr[]=new int[5] ;
   for(int i=0;i<arr.length;i++){
	   System.out.print("Enter Element for index "+i+" : ");
	   arr[i]=sc.nextInt();
   }System.out.print("Enter the element to search: ");
   int x = sc.nextInt();
   int count=0;
   for(int i=0;i<arr.length;i++){
	   if(x==arr[i]){
		  System.out.print("Number: "+x+" is matched at index "+i);
		    count++;
		  break;	
	   }
   }if(count==0){
	   	 System.out.print("Element not found");
   }
  }
}