/*
* Creative Name - Julia Kozak, Neil Lin (Flopsy, Hatch)
* APCS
* HW24 -- What Does Equality Look Like?
* 2021-10-25
*
* DISCO: 
*
* QCC: 
*
*/

public class Driver {

	Coin coin = new Coin();
	Coin otherCoin = new Coin();
	
  public static void main( String[] args ) {

	coin.match(otherCoin);
  System.out.println(coin.getFlipCtr() + "\n" + coin.getValue() + "\n" + coin.getHeadsCtr() + "\n" + coin.getTailsCtr());
      System.out.println(otherCoin.getFlipCtr() + "\n" + otherCoin.getValue() + "\n" + otherCoin.getHeadsCtr() + "\n" + otherCoin.getTailsCtr());

  }//end main()

}//end class
