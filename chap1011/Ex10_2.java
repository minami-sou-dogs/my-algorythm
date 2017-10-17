import java.util.Scanner;
class ExId{
    static Scanner stdIn=new Scanner(System.in);
    static int counter=0;
    private int id;
    static  int n=1;
    //識別番号について//
    public ExId(){
	id=n+counter;
	counter=n+counter;
    }
    //識別番号の返却 //
    public int getId(){
	return id;
    }
    // 最大の識別番号の返却 //
    static int getMaxId(){
	return counter;
    }
    //　識別番号の増やし方の変更 //
    static void changeN(){
	System.out.println("識別番号の増やし方をいくつにしますか？");
	n=stdIn.nextInt();
    }
}
class Ex10_2{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.println("いくつのインスタンスを生成しますか？");
	int k=stdIn.nextInt();
	ExId[] a=new ExId[k];
	for(int i=0;i<a.length;i++){
	    if(i==3){
		ExId.changeN();
	    }
	    a[i]=new ExId();
	System.out.println(a[i].getId());
	}

    }
}
