import java.util.*;
class FiboDP{
    public static long fib(int n){
	long[] fib=new long[n];
	fib[0]=1;
	fib[1]=1;
	for(int i=2;i<n;i++)
	    fib[i]=fib[i-1]+fib[i-2];
	return fib[n-1];
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
