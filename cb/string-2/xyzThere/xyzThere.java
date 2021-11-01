public class xyzThere{

  public static boolean xyzThere(String str) {
    boolean lastChar = false;

    for(int i = 0; i < str.length() - 2; i++) {
      if(str.charAt(i) == '.') {
        lastChar = true;
      }
      else {
        if(lastChar != true && str.substring(i, i+3).equals("xyz")) {
          return true;
        }
        lastChar = false;
      }
    }

    return false;
  }

  public static void main (String[] args){
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("xyz.abc"));
  }

}
