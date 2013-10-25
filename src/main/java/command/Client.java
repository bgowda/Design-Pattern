package command;

/**
 * Command pattern is data driven behavioural pattern. Request is wrapped in the object as command and passed over to the invoker.
 * Requester doesnt have to know about which method is executed by the command.
 */
public class Client {

    public static void main(String[] args) {
        RegularBonus regularBonus = new RegularBonus();
        ReoccuringBonus reoccuringBonus = new ReoccuringBonus();

        Command issueBonusCommand = new IssueBonusCommand(regularBonus);
        issueBonusCommand.execute();
        Command issueBonusCommand1 = new IssueBonusCommand(reoccuringBonus);
        issueBonusCommand1.execute();
    }
}
