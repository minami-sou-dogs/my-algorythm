import java.util.*;
class FiboRec{
    public static int fib(int n){
	if(n==3)
	    return 2;
	else if(n==2)
	    return 1;
	else
	    return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
	int n=Integer.parseInt(args[0]);
	Scanner std=new Scanner(System.in);
	System.out.println("ふぃぼなっちすうれつを解きます。");
	long start=System.nanoTime();
	System.out.println(fib(n));
	System.out.println((System.nanoTime()-start)*Math.pow(10,-6)+"ms");
    }
}
