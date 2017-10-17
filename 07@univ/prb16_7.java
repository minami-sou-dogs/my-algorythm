class point3 implements Runnable{
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
class liner5 implements Runnable{
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

public class prb16_7{
    public static void main(String[] args){
	new Thread(new point3()).start();
	new Thread(new liner5()).start();
    }
}
