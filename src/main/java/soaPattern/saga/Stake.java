package soaPattern.saga;

public class Stake implements Event{
    public Double getAmount() {
        return amount;
    }

    private final Double amount;

    public Stake(Double amount) {
        this.amount = amount;
    }
}
