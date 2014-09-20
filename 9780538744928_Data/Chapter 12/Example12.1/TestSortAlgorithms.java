// Example 12.1: Test sort algorithms

import java.util.Random;

public class TestSortAlgorithms{

   public static void main(String[] args){
      Random gen = new Random();
      int[] a = new int[20];

      //Initialize the array to random numbers between 0 and 99
      for (int i = 0; i < a.length; i++)
         a[i] = gen.nextInt(100);

      printArray(a);
      //selectionSort(a);            // Pick one of three to test
      //bubbleSort(a);
      insertionSort(a);
      printArray(a);
   }

   private static void printArray(int[] a){
      for (int i : a)
         System.out.print(i  + " ");
      System.out.println("");
   }

   // private static sort methods and their helpers go here

   private static void selectionSort(int[] a){
      for (int i = 0; i < a.length - 1; i++){
         int minIndex = findMinimum(a, i);
         if (minIndex != i)
            swap(a, i, minIndex);
      }
   }

   private static void bubbleSort(int[] a){
      // Exercise
   }

   private static void insertionSort(int[] a){
      int itemToInsert, j;
      boolean stillLooking;

      // On the kth pass, insert item k into its correct position among 
      // the first k entries in array.

      for (int k = 1; k < a.length; k++){
          // Walk backwards through list, looking for slot to insert a[k] 
         itemToInsert = a[k];
         j = k - 1;
         stillLooking = true;

         while ((j >= 0) && stillLooking )
            if (itemToInsert  < a[j]) {
               a[j + 1] = a[j];              
               j--;
            }else
               stillLooking = false;
            // Upon leaving loop, j + 1 is the index 
            // where itemToInsert  belongs
            a[j + 1] = itemToInsert;
      }
   }

   private static int findMinimum(int[] a, int first){
      int minIndex = first; 

      for (int i = first + 1; i < a.length; i++)
         if (a[i] < a[minIndex])
            minIndex = i;

      return minIndex;
   }  


   private static void swap(int[] a, int x, int y){
      int temp = a[x];
      a[x] = a[y];
      a[y] = temp;
   }  
  

}
