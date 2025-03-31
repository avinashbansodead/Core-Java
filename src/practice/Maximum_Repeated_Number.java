package practice;

public class Maximum_Repeated_Number {
public static void main(String[] args) {
	Integer [] arr = {1,2,7,8,4,3,9,7,1,6,9,4,2,2} ;
	 
	
	 int max= 0;
	 for (int i=0; i< arr.length; i++)
	 {
		 int repeated = -1;
		 int count= 1;
		 for (int j= i+ 1 ; j< arr.length ; j++)
		 {
			 if (arr[i]==arr[j] )
			 {
				 count ++;
			 }
		 }
		 repeated= count;
		 if (repeated> max)
		 {
			 max = repeated;
		 }
		  System.out.println(arr[i] + "is repeated :" + max);
	 }
	 System.out.println("Repeated :" + max);
}
}
