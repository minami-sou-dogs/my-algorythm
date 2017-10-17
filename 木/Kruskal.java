import java.util.*;
import java.io.*;

class Kruskals extends WUGraphs2{
    int totalweight=0;
    int totalnode=0;
    int totaledge=0;
    Queue<Edge> krukyu=new LinkedList<Edge>();
    void kruskal(){
	UnionFind a=new UnionFind(numofnodes);
	int a3=kyu.size();
	for(int i=0;i<a3;i++){
	    Edge para2=kyu.poll();
	    if(a.sameunit(para2.nodeU,para2.nodeV)!=true){
		a.unite(para2.nodeU,para2.nodeV);
		totalweight+=para2.weight;
		totalnode+=1;
		krukyu.add(para2);
	    }
	}
    }
    void printGraph(){
	Edge para;
	sort();
	kruskal();
	System.out.println("TotalWeight:"+totalweight);
	System.out.println("MST:");
	System.out.println(numofnodes+","+totalnode);
	    for(int k=0;k<totalnode;k++){
		para=krukyu.poll();
		System.out.println(para.id+":"+para.nodeU+","+para.nodeV+","+para.weight);
	    }
    }
}

class Kruskal{

    public static void main(String[] args){
	String line=args[0];
	Kruskals a=new Kruskals();
	a.loadGraph(line);
	a.printGraph();
    }
}
