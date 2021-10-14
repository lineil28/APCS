public class Greet {
    public static void main(String[] args) {

        String greeting;

        BigSib richard = new BigSib("Word Up");
        BigSib tracy = new BigSib("Salutations");
        BigSib grizz = new BigSib("Hey ya");
        BigSib dotCom = new BigSib("Sup");

        greeting = richard.greet("freshman");
        System.out.println(greeting);
        greeting = tracy.greet("Dr. Spaceman");
        System.out.println(greeting);
        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);
        greeting = dotCom.greet("mom");
        System.out.println(greeting);
    }
}
