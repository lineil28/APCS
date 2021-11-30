/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

/*****************************************************
  * Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
  * APCS pd8
  * HW40 -- Demand A Raise
  * 2021-11-29
  * time spent - 0.7 hours
  *
  * Disco- foreach loops are for(variable type + name : what your're in))
  *
  * QCC- ...
  *
  *****************************************************/


public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i = 0; i < a.length; i++) {
      System.out.print("" + a[i][0]);
      for (int n = 1; n < a[i].length; n++) {
	       System.out.print("," + a[i][n]);
      }
      System.out.print("\n");
    }
  }

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
	for (int[] num : a) {
      String output = ""; //each row has their own string
      for (int nums : num) {
		output += nums + ",";
      }
      System.out.println(output.substring(0, output.length()-1));//gets rid of the comma at the end of each row
    }
  }

  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
	  int output=0;
	  for(int a1=0;a1<a.length;a1++){
		  for(int a2=0;a2<a[a1].length;a2++){
			  output+=a[a1][a2];
		  }
	  }
    return output;
  }

  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
	int output=0;
	  for(int a1=0;a1<m.length;a1++){
		  output+=(sumRow(a1,m));
	  }
    return output;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
	  int output=0;
		  for(int a2=0;a2<a[r].length;a2++){
			  output+=a[r][a2];
		  }
    return output;
  }

  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    int summer = 0;
	for(int nums:m[r]){
		summer+=nums;
	}
    return summer;
  }

  public static void main( String [] args )
  {
    int [][] m1 = new int[4][2];
    int [][] m2 = { {2,4,6}, {3,5,7} };
    int [][] m3 = { {2}, {4,6}, {1,3,5} };
    print1(m1);
    print1(m2);
    print1(m3);
    print2(m1);
    print2(m2);
    print2(m3);
    System.out.println(sumRow(1,m3));///tests sumrow
    System.out.println(sumRow2(1,m3));

    System.out.print("testing sum1...\n");
    System.out.println("sum m1 : " + sum1(m1));
    System.out.println("sum m2 : " + sum1(m2));
    System.out.println("sum m3 : " + sum1(m3));

    System.out.print("testing sum2...\n");
    System.out.println("sum m1 : " + sum2(m1));
    System.out.println("sum m2 : " + sum2(m2));
    System.out.println("sum m3 : " + sum2(m3));

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
