public class Rational{
  private static int numer , denom;

  public Rational(){
    this.numer = 0;
    this.denom = 1;
  }

  public Rational(int num, int dem) {
    this.numer = num;
    this.denom = dem;

    if (dem == 0) {
      System.out.println("Invalid denominator.");
    }
  }

  public static String toString(Rational r){
    return (n + "/" + d);
  }

  public static void main(String[] args){
    Rational r = new Rational(2,3);
    System.out.println(toString(r));

  }
}
