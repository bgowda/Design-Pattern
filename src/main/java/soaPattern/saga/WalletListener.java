package soaPattern.saga;

public class WalletListener extends Listener<Stake> {

    @Override
    public void update(Stake stake) {
        System.out.println("Calculate amount");
    }
}
