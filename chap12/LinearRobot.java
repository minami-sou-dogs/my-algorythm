public class LinearRobot{
    protected static int step=10;
    protected static int clock=0;

    protected int x=0;

    public static void nextClock(){clock++;}

    public void move(){x+=step;}

    public LinearRobot(){}

    public int getX(){return x;}

    public int getClock(){return clock;}
    public String getName(){return "Linearrobot";}
}
