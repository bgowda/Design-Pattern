package chainOfResponsibility;


public class PokerBonus extends AbstractBonus {
    @Override
    public Double calculate(Double depositAmount) {
        System.out.println("Poker Bonus");
        if(depositAmount > 10 && depositAmount < 20){
            return    ((depositAmount * .2) + depositAmount);
        } else {
            return this.bonus.calculate(depositAmount);
        }
    }
}
