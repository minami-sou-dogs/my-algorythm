public class SleepyRobot extends LinearRobot{
    private int  sleepParam;

    public SleepyRobot(int z){sleepParam=z;}

    @Override public String getName(){return "sleepyrobot";}
    @Override public void move(){
	if(clock%sleepParam==0){
	    x+=0;
	}
	else if(clock%sleepParam!=0){
	    x+=step;
	}
    }
}
