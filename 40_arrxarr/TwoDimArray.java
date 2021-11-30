/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

/*****************************************************
  * Team Green: Abdullah Faruque, Neil Lin, Russell Goychayev
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
    for (int r = 0; r < a.length; r++) {
      System.out.print("" + a[r][0]);
      for (int c = 1; c < a[r].length; c++) {
	       System.out.print("," + a[r][c]);
      }
      System.out.print("\n");
    }
  }

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
	for (int[] r : a) {
      String output = ""; //each row has their own string
      for (int c : r) {
		output += c + ",";
      }
      System.out.println(output.substring(0, output.length()-1));//gets rid of the comma at the end of each row
    }
  }

  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
	  int output=0;
	  for(int r=0;r<a.length;r++){
		  for(int c=0;c<a[r].length;c++){
			  output+=a[r][c];
		  }
	  }
    return output;
  }

  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
	int output=0;
	  for(int r=0;r<m.length;r++){
		  output+=(sumRow(r,m));
	  }
    return output;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
	  int output=0;
		  for(int c=0;c<a[r].length;c++){
			  output+=a[r][c];
		  }
    return output;
  }

  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    int summer = 0;
	for(int c:m[r]){
		summer+=c;
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
