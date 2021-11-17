// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW28: PPMP
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class sum2{

  public static int sum2(int[] nums) {
    int output=0;
    if (nums.length==0) return 0;
    if (nums.length==1) return nums[0];
    for (int i=0;i<2;i++){
      output+=nums[i];
    }
    return output;
  }



  public static void main(String[] args) {
    System.out.println(sum2(new int[] {1, 2, 3})); // 3
    System.out.println(sum2(new int[] {1, 1})); // 2
    System.out.println(sum2(new int[] {1, 1, 1, 1})); // 2
  }

}
