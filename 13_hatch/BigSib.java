/* DN (Humans: Neil, Ari; Ducks: Hatch , Javier)
APCS
HW 13 -- Where do BigSibs Come From?
2021 10 06
DISCO
	Constructors can be useful for making more efficient code
	Remove the need for repeating code in the main file
QCC
	 Still cannot exaclty wrap my head around exact details about constructors
*/
public class BigSib {

	private String msg;

	public BigSib(String phrase) {
/*	setMsg(phrase);   */
    msg = phrase;
	}

/*
  public void setMsg(String phrase) {
		msg = phrase;
	}
*/
	public String greet(String name) {
		return msg + " " + name;
	}
}
