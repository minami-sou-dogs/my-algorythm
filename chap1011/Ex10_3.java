import java.util.Scanner;
class utility{
    // 二値の最小値は //
    static int mix2(int x,int y){
	return Math.min(x,y);
    }
    // 三値の最小値は //
    static int mix3(int x,int y,int z){
	int mix=x;
	if(y<mix) mix=y;
	if(z<mix) mix=z;
	return mix;
    }
    //　配列の最小値は //
    static int max4(int[] a){
	int min=a[0];
	for(int i=0;i<a.length;i++){
	    if(a[i]<min)
		min=a[i];
	}
	return min;
    }
}
class Ex10_3{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.println("２値の最小を求めるメソッドをテストします.値を入力してください");
	int a=stdIn.nextInt();
	int b=stdIn.nextInt();
	System.out.println(utility.mix2(a,b));
	System.out.println("3値の最小を求めるメソッドをテストします.値を入力してください");
	int a1=stdIn.nextInt();
	int b1=stdIn.nextInt();
	int c1=stdIn.nextInt();
	System.out.println(utility.mix3(a1,b1,c1));
	System.out.println("配列の最小を求めるメソッドをテストします.配列の要素数を入力してください");
	int n=stdIn.nextInt();
	int[] ak=new int[n];
	for(int i=0;i<ak.length;i++){
	    System.out.println("ak["+i+"]の値を入力してください");
	    ak[i]=stdIn.nextInt();
	}
 	System.out.println(utility.max4(ak));
    }
}
