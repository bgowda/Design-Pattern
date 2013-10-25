package chainOfResponsibility;

/**
 * Chain of Responsibility pattern in which several linked objects (the Chain) are offered the opportunity to
 * respond to a request or hand it off to the object next in line.
 */
public class Client {

    public static void main(String[] args) {
        AbstractBonus casinoBonus = new CasinoBonus();
        AbstractBonus pokerBonus = new PokerBonus();
        AbstractBonus sportsBonus = new SportsBonus();

        casinoBonus.setSuccessor(pokerBonus);
        pokerBonus.setSuccessor(sportsBonus);

        System.out.println(casinoBonus.calculate(15d));

    }
}
