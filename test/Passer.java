/**
Green: Abdullah Faruque, Neil Lin, Russell Goychayev
APCS pd08
2021-11-30
time spent: 0.2 hours
**/
public class Passer{
  public static int x = 5;
  public static String s = "String";

  public static int add1(int x){
    return (x + 1);
  }

  public static String stringSmart(String x){
    return (x + " is smart.");
  }

  public static void main(String[] args){

    System.out.println("x before: " + x);
    System.out.println("add1(x): " + add1(x));
    System.out.println("x after: " + x);

    System.out.println("x before: " + s);
    System.out.println("add1(x): " + stringSmart(s));
    System.out.println("x after: " + s);
  }
}
