class point3 extends Thread{
@Override
public void run(){
    for(int i=0;i<10;i++){
	try{
	    Thread.sleep(3000);
	}catch(InterruptedException e){
	}
    System.out.println("***");
    }

}
}
class liner5 extends Thread{
@Override
public void run(){
    for(int i=0;i<10;i++){
	try{
	    Thread.sleep(5000);
	}catch(InterruptedException e){
	}
    System.out.println("=====");
    }

}
}

public class prb16_6{
    public static void main(String[] args){
	new point3().start();
	new liner5().start();
    }
}
