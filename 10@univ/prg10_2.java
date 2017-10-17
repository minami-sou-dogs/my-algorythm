import java.util.Scanner;
import java.util.*;
import java.util.Random;
class prg10_2{

    public static void main(String[] args){
	Scanner key=new Scanner(System.in);
	Random rand=new Random();
	System.out.println("");
	int sig=1;
	int j=0;
	int leng=key.nextInt();
	System.out.println();
	int sigsyc=key.nextInt();
	System.out.println();
	int often=key.nextInt();
	Queue<Integer> list=new LinkedList<Integer>();
	for(int i=1;i<=10000;i++){
		if(i%sigsyc==0)
		    sig=sig*(-1);
		if(sig==1){
		    if(i%often==0){
			int z=rand.nextInt(4);
			    if(z==1){
				if(j==leng)
				    break;
				list.add(1);
				j+=1;
			    }
		    }
		}
		if(sig==-1){
		    try{
		    list.remove();
		    j-=1;
		    }catch(Exception e){
		    }
		    if(i%often==0){
			int z=rand.nextInt(4);
			    if(z==1){
				if(j==leng)
				    break;
				list.add(1);
				j+=1;
			    }
		    }
		}
		System.out.println(list);
	}
	System.out.println("終了");
    }
}
