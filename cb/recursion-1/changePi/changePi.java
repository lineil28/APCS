/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class changePi{
  public String changePi(String str) {
    if(str.length() < 2){
      return str;
    }
    else if (str.substring(0,2).equals("pi")){
      return "3.14" + changePi(str.substring(2));
    }
    else{
      return str.substring(0,1) + changePi(str.substring(1));
    }
  }
}
