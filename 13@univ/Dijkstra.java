import java.util.*;
import java.io.*;

class Dijkstras extends Graph{

    int[] slowDijkstra(int start){
	Queue<Integer> kyu=new LinkedList<Integer>();
	int node=0;
	double weight=0;
	int[] d=new int[num];
	double[] mincost=new double[num];
	for(int i=0;i<d.length;i++)
	    d[i]=-1;
	d[start]=start;
	mincost[start]=0;
	try{
	while(true){
	    for(int j=0;j<b[start].getList().size();j++){
		node=b[start].getnum(j);
		weight=b[start].getweight(j);
		if(d[node]==-1){
		    d[node]=start;
		    mincost[node]=mincost[start]+weight;
		    kyu.add(node);
		}else{
		    d[node]=mincost[node]<(mincost[start]+weight)?d[node]:start;
		    mincost[node]=Math.min(mincost[node],mincost[start]+weight);
		}
	    }
	    start=kyu.remove();
	}
	}catch(Exception e){
	}

	return d;
    }

    int[] getShortestPath(int start,int end){
	int[] k=slowDijkstra(start);
	int n=0;
	int ends=end;
	while(true){
	    if(ends==start){
		n++;
		break;
	    }else if(ends==-1){
		int[] error=new int[1];
		error[0]=-1;
		return error;
	    }else{
		n++;
		ends=k[ends];
	    }
	}
	int[] ans=new int[n];
	for(int i=n-1;i>=0;i--){
	    ans[i]=end;
	    end=k[end];
	}
	return ans;
    }
    void ansprint(int end,int[] path){
	System.out.print(end+":");
	if(path[0]!=-1){
	for(int i=0;i<path.length-1;i++){
	    System.out.print(path[i]+",");
	}
	System.out.println(path[path.length-1]);
	}else{
	    System.out.println("そのような経路はありません");
	}
    }
}

class Dijkstra{


    public static void main(String[] args){
	String line=args[0];
	System.out.print(line);
        Dijkstras a=new Dijkstras();
	a.loadGraph(line);
	int start=0;
	System.out.println();
        for(int i=0;i<a.num;i++){
	int[] path=a.getShortestPath(start,i);
	a.ansprint(i,path);
	}
    }
}
