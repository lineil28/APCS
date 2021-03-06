/*
Team Tem: Justin Mohabir, Neil Lin; Turtles: Hans, Hatch
APCS pd07
HW61 -- Instructions so Simple...
2022-02-08
time spent: 1.0 hrs

DISCO:
-IT LIKE WE DO IN CLASS... IT BE MAGIC

QCC:
-N/A
*/

/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
    Merge, assuming the two lists are sorted in ascending order, merges the two lists.
    Sort sorts.
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int aPos = -1, bPos = -1, outPos = 0;
    int[] out = new int[a.length + b.length];
    for(int i = 0; i < out.length; i++){
      if (bPos == b.length-1){
        aPos++;
        out[i] = a[aPos];
      }
      else if (aPos == a.length-1){
        bPos++;
        out[i] = b[bPos];
      }
      else if(a[aPos+1] >= b[bPos+1] ) {
        bPos++;
        out[i] = b[bPos];
      }
      else if(a[aPos+1] < b[bPos+1] ) {
        aPos++;
        out[i] = a[aPos];
      }
    }
    return out;


  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    // base case
    if (arr.length == 1){
      return arr;
    }
    // recursive reduction
    else {
      // split deck in half
      int[] arr_1 = new int[(int)(Math.floor(arr.length / 2.0))];
      for (int i = 0; i < arr_1.length; i++){
        arr_1[i] = arr[i];
      }
      int[] arr_2 = new int[(int)(Math.ceil(arr.length / 2.0))];
      for (int j = 0; j < arr_2.length; j++){
        arr_2[j] = arr[j + arr_1.length];
      }

      return merge(sort(arr_1), sort(arr_2));
    }
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {

      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
