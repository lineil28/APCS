// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW37: PPMP[]
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class sum3{

  public static int sum3(int[] nums) {
    return (nums[0]+nums[1]+nums[2]);
  }

  public static void main(String[] args) {
    System.out.println(sum3(new int[] {1, 2, 3})); // 6
    System.out.println(sum3(new int[] {5, 11, 2})); // 18
    System.out.println(sum3(new int[] {7, 0, 0})); // 7
  }

}
