package chainOfResponsibility;


public abstract class AbstractBonus {

    protected AbstractBonus bonus;

    public void setSuccessor(AbstractBonus bonus){

        this.bonus = bonus;
    }

public abstract Double calculate(Double depositAmount);

}
