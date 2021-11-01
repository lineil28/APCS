public class endOther{

  public static boolean endOther(String a, String b) {

    a = a.toLowerCase();
    b = b.toLowerCase();

    if ( b.equals(a) ) {
      return true;
    }


    if ( a.length() > b.length() ) {

      if ( b.equals( a.substring( a.length() - b.length(), a.length() ) ) ){
        return true;
      }
      return false;
    }
    else{
      if ( a.equals( b.substring( b.length() - a.length(), b.length() ) ) ){
        return true;
      }
      return false;

    }

  }


  public static void main (String[] args){
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc", "abXabc"));
  }

}
