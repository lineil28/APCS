public class test{
  public static int x = 5;

  public static int add1(int num){
    return (num + 1);
  }

  public static void main(String[] args){

    System.out.println("x before: " + x);
    System.out.println("add1(x): " + add1(x));
    System.out.println("x after: " + x);
  }
}
