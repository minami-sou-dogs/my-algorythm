public class SlowRobot extends LinearRobot{
    private int delayParam;

    public SlowRobot(int k){delayParam=k;}

    @Override public void move(){x+=(step/delayParam);}
    @Override public String getName(){return "slowrobot";}
}
