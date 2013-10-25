package command;


public class IssueBonusCommand implements Command{
    Bonus receiver;

    public IssueBonusCommand(Bonus receiver){
        this.receiver = receiver;
    }
    public void execute(){
        receiver.issueBonus();
    }
}
