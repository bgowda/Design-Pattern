package chainOfResponsibility;


public class SportsBonus extends AbstractBonus {
    @Override
    public Double calculate(Double depositAmount) {
        System.out.println("Sports Bonus");
        if(depositAmount > 20){
            return    ((depositAmount * .2) + depositAmount);
        } else {
            return this.bonus.calculate(depositAmount);
        }
    }
}
