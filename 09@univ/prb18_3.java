import java.io.*;
public class prb18_3{
    public static void main(String[] args){
	public final int m=1000;
	if(args.length!=1){
	    System.out.println("使用法：java prb18_3 作成ファイル");
	    System.exit(0);
	}

	String filename=args[0];
	try{
	    PrintWriter writer=new PrintWriter(new BufferedWriter(new FileWriter(filename)));
	    writePrime(writer);
	    writer.close();

	}catch(IOException e){
	    System.out.println(e);
	}
    }
    public static void WritePrime(PrintWriter writer){
	boolean[] prime=new boolean[m];
	for(int i=0;n<m;n++){
	    prime[n]=true;
	}
	prime[0]=false;
	prime[1]=false;
	for(int n=0;n<m;n++){
	    if(prime[n]){
		writer.println(n);
		for(int i=2;i*n<m;i++){
		    prime[i*n}=false;
		}
	    }
	}
    }
}
