class LabelPrinter extends Thread{

    String label="no label";

    LabelPrinter(String label){
	this.label=label;
    }

@Override public void run(){
    while(true){
	System.out.println(label);
	try{
	Thread.sleep(1000);
	}catch(InterruptedException e){
	}
    }
}
}

public class prb16_3 {
    public static void main(String[] args){
	LabelPrinter[] th={new LabelPrinter("おはよう!"),new LabelPrinter("こんにちは！"),new LabelPrinter("こんばんは！")};
	th[0].start();
	th[1].start();
	th[2].start();
    }
}
