package chainOfResponsibility;

public class CasinoBonus extends AbstractBonus
{
    @Override
    public Double calculate(Double depositAmount) {
        System.out.println("Casino bonus");
        if(depositAmount < 10){
            return    ((depositAmount * .05) + depositAmount);
        } else {
           return this.bonus.calculate(depositAmount);
        }
    }
}
