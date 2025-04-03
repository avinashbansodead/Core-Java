package interview.coding_1;

public class Max_Profit {

	public static void main(String[] args) {
		 
		 Integer[] arr= {17,2,3,4,6,2,8,1,1,3} ;
		 
		 int min = arr[0];
		 int max = arr[0];
		 
		 for (int i= 1 ; i< arr.length ; i++)
		 {
			 if (arr[i] < min)
			 {
				 min =arr[i];
				 
				
			 }
			 
		 }
		 
		 for (int j= 1; j< arr.length ; j++)
		 {
			 if ( arr[j]> max)
			 {
				 max = arr[j];
				 
			 }
		 }
		 System.out.println("Min :"+min);
		 System.out.println("Max :" +max);
		 Integer profit = max- min ;
		 System.out.println(profit);

	}

}
