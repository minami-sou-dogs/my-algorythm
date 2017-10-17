import java.util.*;
import java.io.*;
class Graph{
    Node[] b;
    public int num=0;
    class Edge{
	private int to;
	Edge(int to){this.to=to;}
	int To(){return to;}
    }

    class Node{
	int id;
	ArrayList<Edge> list=new ArrayList<Edge>();
	Node(int id){this.id=id;}
	void addToList(int nid){list.add(new Edge(nid));}
        ArrayList<Edge> getList(){return list;}
	int getnum(int k){return list.get(k).To();}

	void printGraph(){
	    System.out.print(id+":"+getnum(0));
	    for(int k=1;k<list.size();k++){
		System.out.print(","+getnum(k));
	    }
	}
    }
    void loadGraph(String file){
	String f;
	ArrayList<String> line=new ArrayList<String>();
	try{
	BufferedReader reader=new BufferedReader(new FileReader(file));
	    try{
		while(true){
		    if((f=reader.readLine())!=null){
			line.add(f);
			num++;
		    }else{
			throw new Exception();
		    }
		}
	    }catch(Exception e){
		}
		b=new Node[num];
		int n=0;
		int k=0;
	    try{
		while(true){
		    String[] z=line.get(n).split(":",0);
		    k=Integer.parseInt(z[0]);
		    b[n]=new Node(k);
		    String[] x=z[1].split(",",0);
		    for(int i=0;i<x.length;i++){
			k=Integer.parseInt(x[i]);
			b[n].addToList(k);
		    }
		    n++;
		}
	    }catch(Exception e){
		}
	}catch(Exception e){
	    System.out.println("エラー");
	    System.exit(0);
	}

    }
    int getnum(){return num;}

}

class prg2_12_1{

    public static void main(String[] args){
	String line=args[0];
	Graph a=new Graph();
	a.loadGraph(line);
	for(int i=0;i<a.b.length;i++){
	    a.b[i].printGraph();
	    System.out.println();
	}
    }
}
