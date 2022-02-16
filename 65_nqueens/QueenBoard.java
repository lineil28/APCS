/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */
  public boolean solve()
  {
    int column = 0;
    if (column < _board.length){
      if (solveH()){
        
      }
    }
    return false;
  }


  /**
   *Helper method for solve.
   */
  private boolean solveH( int col )
  {
    // if (col == _board.length - 1){ // base
    //   if (addQueen(0, col)){
    //     return true;
    //   }
    //   else{
    //     removeQueen(0, col);
    //     return false;
    //   }
    // }
    // else { // recursive
    //   return solveH(col + 1);
    // }

    for (int i = 0; i < _board.length; i++){
      if (addQueen(i, col)){
        printSolution();
        removeQueen(i, col);
        return true;
      }
      else{
        removeQueen(i, col);
      }
    }

    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        if (_board[r][c] == 1){
          ans += "Q" + "\t";
        }
        else{
          ans += "_" + "\t";
        }
      }
      ans += "\n";
    }
    return ans;
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * Places a queen at position row x col, and marks off all cells that can no
     longer have a queen (to the right and diagonally)
   * precondition: input row and col within 0 and n
   * postcondition: places Queen, marked with 1, and marks restrictions (-1)
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * If a queen is present at position row x col, that queen is then removed, as well
     as all restrictions that resulted from that queen at that position.
   * precondition: input row and col within 0 and n
   * postcondition: if Queen, removes Queen, sets to 0, and removes restrictions (-1)
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition: _board exists
   * postcondition: overwrites toString() method to show the board as a String
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
       0	1	-1	-2	-1
       0	0	-2	0	0
       0	-1	0	-1	0
       1	-1	-1	-1	-2
       0	-1	0	0	0
    */

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1	-1
       0	0	-1	0	0
       0	0	0	-1	0
       0	0	0	0	-1
       0	0	0	0	0
    */

  }

}//end class
