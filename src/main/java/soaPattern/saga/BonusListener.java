package soaPattern.saga;

public class BonusListener extends Listener<Stake> {


    @Override
    public void update(Stake stake) {
        System.out.println("Calculate bonus");
    }
}
