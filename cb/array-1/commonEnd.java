// Team Green: Abdullah Faruque, Neil Lin, Russel Goychayev
// APCS
// HW37: PPMP[]
// 2021-11-16
// time spent- 0.2 hour

/*
DISCO:..,
QCC: ...
*/

public class commonEnd{

public static boolean commonEnd(int[] a, int[] b) {
  return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
}

public static void main(String[] args) {
        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {7, 3})); // true
        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2})); // false
        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {1, 3})); // true
    }
}
