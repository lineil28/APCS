// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW28: PPMP
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class firstLast6{

  public static boolean firstLast6(int[] nums) {
    if(nums[0]==6 || nums[nums.length-1]==6){
      return true;
    }
    return false;
  }

  public static void main(String[] args){
  	System.out.println( firstLast6(new int[] {1,2,6}) );
  	System.out.println( firstLast6(new int[] {6,1,2}) );
  	System.out.println( firstLast6(new int[] {1,2,3}) );
  }
}
