import java.util.*;
import java.io.*;
class Graph{
    Node[] b;
    public int num=0;
    class Edge{
	private int to;
	private double weight;
	Edge(int to,double weight){this.to=to;this.weight=weight;}
	int To(){return to;}
	double Weight(){return weight;} 
    }

    class Node{
	int id;
	ArrayList<Edge> list=new ArrayList<Edge>();
	Node(int id){this.id=id;}
	void addToList(int nid,double weight){list.add(new Edge(nid,weight));}
        ArrayList<Edge> getList(){return list;}
	int getnum(int k){return list.get(k).To();}
	double getweight(int k){return list.get(k).Weight();}
	void printGraph(){
	    try{
	    System.out.print(id+":"+getnum(0)+"@"+getweight(0));
	    for(int k=1;k<list.size();k++){
		System.out.print(","+getnum(k)+"@"+getweight(k));
	    }
	    }catch(Exception e){
		System.out.print(id+":");
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
		double k1;
	    try{
		while(true){
		    String[] z=line.get(n).split(":",0);
		    k=Integer.parseInt(z[0]);
		    b[n]=new Node(k);
		    try{
		    String[] x=z[1].split(",",0);
		    for(int i=0;i<x.length;i++){
			String[] l=x[i].split("@",0);
			k=Integer.parseInt(l[0]);
			k1=Double.parseDouble(l[1]);
			b[n].addToList(k,k1);
		    }
		    }catch(Exception e){
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
