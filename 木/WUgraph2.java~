import java.util.*;
import java.io.*;
class WUGraphs2 extends WUGraphs{
    class mycomparator2 implements Comparator{

        public int compare(Object a,Object b){
	    Edge a1=(Edge)a;
	    Edge b1=(Edge)b;
	    if(a1.weight>b1.weight)
		return 1;
	    else if(a1.weight<b1.weight)
		return -1;
	    else
		return 0;
	}
    }
    void sort(){
	for(int k=0;k<b.length;k++){
	    kyu.add(b[k]);
	}
    }
    Queue<Edge> kyu=new PriorityQueue(11,new mycomparator2());
    void printGraph(){
	Edge para;
	sort();
	    System.out.println(numofnodes+","+numofedge);
	    for(int k=0;k<b.length;k++){
		para=kyu.poll();
		System.out.println(para.id+":"+para.nodeU+","+para.nodeV+","+para.weight);
	    }
    }
}


class WUgraph2{

    public static void main(String[] args){
	String line=args[0];
	WUGraphs2 a=new WUGraphs2();
	a.loadGraph(line);
	a.printGraph();
    }
}
