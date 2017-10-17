public class prb16_5 extends Thread{
    public static void main(String[] args){
	prb16_5[] ct={new prb16_5(),new prb16_5(),new prb16_5()};
	ct[0].start();
	ct[1].start();
	ct[2].start();
	for(int i=0;i<10;i++){
	    System.out.println("main:i="+i+"どのスレッドによるものか"+currentThread().getName());
	}
    }
@Override
public void run(){
    for(int i=0;i<10;i++){
	System.out.println("run:i="+i+"どのスレッドによるものか"+getName());
    }
}
}
