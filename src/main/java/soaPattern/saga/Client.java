package soaPattern.saga;

public class Client {

    private static Double amount = 10d;

    public static void main(String[] args) {
        Stake stake = new Stake(amount);

        ProcessManager processManager = new ProcessManager();
        processManager.registerListeners(new BonusListener());
        processManager.registerListeners(new SportsBookListener());
        processManager.registerListeners(new WalletListener());

        processManager.eventOccurred(stake);

    }
}
