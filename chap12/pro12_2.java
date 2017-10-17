public class pro12_2{
    public static void main(String[] args){
	LinearRobot robots[]={new LinearRobot(),new SlowRobot(2),new SleepyRobot(2)};

	for(int c=0;c<5;c++){
	    for(LinearRobot r: robots){
		r.move();

		System.out.println("このロボットは"+r.getName()+"移動した距離は"+r.getX()+"時刻は"+r.getClock());
	    }
	    LinearRobot.nextClock();
	}
	System.out.println("直線に進むロボットの移動距離は"+robots[0].getX());
	System.out.println("遅延しながら進むロボットの移動距離は"+robots[1].getX());
	System.out.println("休み休み進むロボットの移動距離は"+robots[2].getX());
    }
} 
