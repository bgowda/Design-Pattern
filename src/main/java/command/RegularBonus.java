package command;


public class RegularBonus implements Bonus{
    @Override
    public void issueBonus() {
        System.out.println("Dispatch regular Bonus");
    }
}
