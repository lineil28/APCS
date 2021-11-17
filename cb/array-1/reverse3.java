// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW37: PPMP[]
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class reverse3{

  public static int[] reverse3(int[] nums) {
    int[] result = {nums[2], nums[1], nums[0]};
    return result;
  }

  public static void main(String[] args) {
        System.out.println(reverse3(new int[] {1, 2, 3})); // [3, 2, 1]
        System.out.println(reverse3(new int[] {5, 11, 9})); // [9, 11, 5]
        System.out.println(reverse3(new int[] {7, 0, 0})); // [0, 0, 7]
  }
}
