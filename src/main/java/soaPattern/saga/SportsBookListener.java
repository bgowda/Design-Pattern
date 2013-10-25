package soaPattern.saga;

public class SportsBookListener extends Listener<Stake> {

    @Override
    public void update(Stake stake) {
        System.out.println("Calculate sportsbook");
    }
}
