public class Count7{
  public static int count7(int n) {
    if (n == 0) {
      return 0;
    }
    if (n % 7 != 0){
      System.out.println(count7(n / 10));
      return count7(n / 10);
    }
    else if (n % 7 == 0) {
      System.out.println("divis 7: " + ( 1 + count7(n / 10) ));
      return ( 1 + count7(n / 10) );
    }
    return 0;

  }

  public static void main(String[] args) {
    System.out.println(count7(717));
    System.out.println(count7(77));
  }
}
