// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW37: PPMP[]
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class maxEnd3{

  public static int[] maxEnd3(int[] nums) {
    if (nums[0] > nums[2]){
      int[] result = {nums[0], nums[0], nums[0]};
      return result;
    }
    else{
      int[] result= {nums[2], nums[2], nums[2]};
      return result;
    }
  }

  public static void main(String[] args) {
    System.out.println(maxEnd3(new int[] {1, 2, 3})); // [3, 3, 3]
    System.out.println(maxEnd3(new int[] {11, 5, 9})); // [11, 11, 11]
    System.out.println(maxEnd3(new int[] {2, 11, 3})); // [3, 3, 3]
  }
}
