/**
 * class TreeNode
 * SKELETON
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 */

public class TreeNode
{

  //instance variables / attributes of a TreeNode:
  int _cargo;        //this node's data
  TreeNode _lt, _rt; //pointers to left, right subtrees


  /**
   * default constructor
   * Construct a tree node with specified value,
   * with null left and right subtrees.
   */
  TreeNode( int initValue )
  {
    _cargo = initValue;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * overloaded constructor
   * Construct tree node w specified value, left, and right subtrees.
   */
  TreeNode( int initValue, TreeNode initLeft, TreeNode initRight )
  {
    _cargo = initValue;
    _lt = initLeft;
    _rt = initRight;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Returns the left subtree of this node.
   */
  TreeNode getLeft()
  {
    return _lt;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Returns the right subtree of this node.
   */
  TreeNode getRight()
  {
    return _rt;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Returns the value stored in this tree node.
   */
  int getValue()
  {
    return _cargo;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Sets the value of the left subtree of this node.
   */
  void setLeft( TreeNode theNewLeft )
  {
    _lt = theNewLeft;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Sets the value of the right subtree of this node.
   */
  void setRight( TreeNode theNewRight )
  {
    _rt = theNewRight;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Sets the value of this tree node.
   */
  void setValue( int theNewValue )
  {
    _cargo = theNewValue;
    /*** YOUR IMPLEMENTATION HERE ***/
  }

}//end class
