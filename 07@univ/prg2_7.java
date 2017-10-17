import java.util.Scanner;
class Ball extends Thread{
    private int distance;
    private int hitting;
    private boolean running=true;

    public Ball(int distance,int hitting){this.distance=distance;this.hitting=hitting;}

    public boolean judge(){
	if(distance==hitting)
	    return true;
	else
	    return false;
    }
    public void run(){
	while(running==true){
	    if(distance>0){
	    for(int i=0;i<distance-1;i++)
		System.out.print(" ");
	    System.out.print("*");
	    System.out.println();
	    }
	    try{
		Thread.sleep(100);
	    }catch(InterruptedException e){
	    }
	    distance-=1;
	}
    }
    public void finish(){
	running=false;
    }

}
public class prg2_7{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	Ball ball=new Ball(15,5);
	System.out.println("hit enter to start:");
	System.out.println("    |");  stdIn.nextLine();
	ball.start();
        stdIn.nextLine();

	if(ball.judge()==true)
	    System.out.println("hit");
	if(ball.judge()==false)
	    System.out.println("miss");
	ball.finish();
    }
}
