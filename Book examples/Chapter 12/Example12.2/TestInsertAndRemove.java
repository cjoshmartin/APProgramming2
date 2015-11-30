// Example 12.2: Test insertions and removals

public class TestInsertAndRemove{
   
   public static void main(String[] args){

      // Create an initial array with 3 positions
      String[] array = new String[3];          
      int logicalSize = 0;
      boolean successful = false;

      // Insert strings at positions 0, 1, 1, and 0
      successful = insertItem(array, logicalSize, 0, "Jack");
      if (successful)
         logicalSize++;  
      successful = insertItem(array, logicalSize, 1, "Jill");
      if (successful)
         logicalSize++;  

      successful = insertItem(array, logicalSize, 1, "sees");
      if (successful)
         logicalSize++;  

      successful = insertItem(array, logicalSize, 0, "Before");
      if (successful)
         logicalSize++;  

      // Display new logical size and contents
      System.out.println(logicalSize);                  
      for (int i = 0; i < logicalSize; i++) 
         System.out.print(array[i] + " ");
   }

   // Definitions of array methods go here
   private static boolean insertItem(Object[] array, int logicalSize, 
                                     int targetIndex, Object newItem){
      
	  if (logicalSize== array.length)
		  return false;
	  if(targetIndex < 0 || targetIndex > logicalSize)
		  return false;
	  for(int i= logicalSize; i > targetIndex; i--)
		  array[i]=a[i-1];
	  array[targetIndex] = newItem;
	  logicalSize++;
	   return true;

   }

   private static boolean removeItem(Object[] array, int logicalSize, 
                                     int targetIndex){
	  
	   if(targetIndex < 0 || targetIndex >= logicalSize)
		   return false;
	   
	   for (int i = targetIndex; i < logicalSize - 1; i++)
		   array[i] = array[i+1];
	   
	   logicalSize-- ;
      return true;                                   
   }

}
