import java.io.*;
import java.util.*;
class Solver{
    int capacity,answer;
    int[] weight,value;
    public Solver(int n,int[] weight,int[] value,int capacity){
	this.weight=new int[n]; this.value=new int[n];
	this.weight=weight; this.value=value;
	this.capacity=capacity;
    }
    int solve(){
	int[][] d=new int[weight.length+1][capacity+1];
	for(int i=0;i<=capacity;i++){
	    d[0][i]=0;
	}

	for(int i=1;i<=weight.length;i++){
	    for(int j=1;j<=capacity;j++){
		if(j<weight[i-1]){
		    d[i][j]=d[i-1][j];
		}else{
		    d[i][j]=Math.max(d[i-1][j],d[i-1][j-weight[i-1]]+value[i-1]);
		}
	    }
	}
	return d[weight.length][capacity];
    }
}






public class KP{
    public static void main(String[] args){
	int num,capacity,answer;
	int[] weight,value;
	Scanner reader=new Scanner(System.in);
	String line;
	line=reader.nextLine();
	String[] k=line.split(" ",0);
	num=Integer.parseInt(k[0]);
	capacity=Integer.parseInt(k[1]);
	weight=new int[num];
	value=new int[num];
	int i=0;
	try{
	    while(true){
	    line=reader.nextLine();
	    k=line.split(" ",0);
	    weight[i]=Integer.parseInt(k[0]);
	    value[i]=Integer.parseInt(k[1]);
	    i++;
	    }
	}catch(Exception e){
	}
	Solver s= new Solver(num,weight,value,capacity);
	answer=s.solve();
	System.out.println(answer);
    }
}
