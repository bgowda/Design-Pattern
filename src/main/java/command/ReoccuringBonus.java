package command;


public class ReoccuringBonus implements Bonus
{
    @Override
    public void issueBonus() {
        System.out.println("Dispatch reoccuring Bonus");
    }
}
