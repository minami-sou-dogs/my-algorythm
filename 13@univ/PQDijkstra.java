import java.util.*;
import java.io.*;

class PQDijkstras extends Graph{
    class KV{
	double value;
	int id;
	int parent;
	public KV(int id,double value,int parent){
	    this.id=id;
	    this.value=value;
	    this.parent=parent;
	}
	public double getvalue(){return value;}
    }

    class mycompare implements Comparator{

        public int compare(Object a,Object b){
	    KV a1=(KV)a;
	    KV b1=(KV)b;
	    if(a1.value>b1.value)
		return 1;
	    else if(a1.value<b1.value)
		return -1;
	    else
		return 0;
	}
    }



    int[] fastDijkstra(int start){
        Queue<KV> kyu=new PriorityQueue(11,new mycompare());
	int node=0;
	double weight=0;
	int[] d=new int[num];
	double[] mincost=new double[num];
	KV pr;
	for(int i=0;i<d.length;i++)
	    d[i]=-1;
	kyu.add(new KV(start,0,start));
	while(kyu.isEmpty()!=true){
	    pr=kyu.poll();
	    if(b[pr.id].getList().size()==0)
		if(d[pr.id]==-1){
		    d[pr.id]=pr.parent;
		}
           for(int j=0;j<b[pr.id].getList().size();j++){
	       if(d[pr.id]==-1){
		    node=b[pr.id].getnum(j);
		    weight=b[pr.id].getweight(j)+pr.value;
		    kyu.add(new KV(node,weight,pr.id));
		    if(j==b[pr.id].getList().size()-1)
			d[pr.id]=pr.parent;
		}else{
		}
	    }
	}
	return d;
    }

    int[] getShortestPath(int start,int end){
	int[] k=fastDijkstra(start);
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
class PQDijkstra{


    public static void main(String[] args){
	String line=args[0];
	System.out.print(line);
        PQDijkstras a=new PQDijkstras();
	a.loadGraph(line);
	int start=0;
	System.out.println();
        for(int i=0;i<a.num;i++){
	int[] path=a.getShortestPath(start,i);
	a.ansprint(i,path);
	}
    }
}
