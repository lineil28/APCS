
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib freshman = new BigSib();
    freshman.setHelloMsg("Word up");

    greeting = freshman.greet("freshman");
    System.out.println(greeting);

    BigSib space = new BigSib();
    space.setHelloMsg("Salutations");

    greeting = space.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib kong = new BigSib();
    kong.setHelloMsg("Hey ya");

    greeting = kong.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib mom = new BigSib();
    mom.setHelloMsg("Sup");

    greeting = mom.greet("mom");
    System.out.println(greeting);

  } //end main()
} //end Greet
