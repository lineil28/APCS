public class doubleChar{
  public static String doubleChar(String str) {
    String out = "";
    for (int pos = 1; pos <= str.length(); pos++){
      out += str.substring(pos - 1, pos) + str.substring(pos - 1, pos);
    }
    return out;
  }

  public static void main (String[] args){
    System.out.println(doubleChar("The"));
    System.out.println(doubleChar("AAbb"));
    System.out.println(doubleChar("Hi-There"));
  }
}
