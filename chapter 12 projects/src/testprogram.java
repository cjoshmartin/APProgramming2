
public class testprogram {

		
	
	public static void main(String[] args) {
		int[] nums= new int[8];
		nums[0]= 0;
		int n =1; 
		while (n < nums.length)
		{
			int k;
			
			for (k =n; k < 2*n; k++)
				{
				System.out.println("K = " + k + " Nums[k] b =  " + nums[k]);
				nums[k] = nums[k-n]+ 1;
				System.out.println(" nums[k] a = " + nums[k]);
				}
			n=k;
			System.out.println("N = " + n);
			
		}
	}//end of main

}
