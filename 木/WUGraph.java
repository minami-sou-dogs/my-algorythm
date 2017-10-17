import java.util.*;
import java.io.*;
class WUGraphs{
    Edge[] b;
    public int numofnodes=0;
    public int numofedge;

    class Edge{
        int id;
        int weight;
	int nodeU,nodeV;
	Edge(int id,int nodeU,int nodeV,int weight){this.id=id;this.nodeU=nodeU;this.nodeV=nodeV;this.weight=weight;}
    }

  
    void printGraph(){
	    try{
	    System.out.println(numofnodes+","+numofedge);
	    for(int k=0;k<b.length;k++){
		System.out.println(b[k].id+":"+b[k].nodeU+","+b[k].nodeV+","+b[k].weight);
	    }
	    }catch(Exception e){
		System.out.print("kui");
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
		    }else{
			throw new Exception();
		    }
		}
	    }catch(Exception e){
		}
	    String[] z=line.get(0).split(",",0);
	    numofnodes=Integer.parseInt(z[0]);
	    numofedge=Integer.parseInt(z[1]);
	    b=new Edge[numofedge];
		int n=1;
		int k=0;
		double k1;
	    try{
		while(true){
		    String[] z1=line.get(n).split(":",0);
		    n++;
		    k=Integer.parseInt(z1[0]);

		    try{
		    String[] x=z1[1].split(",",0);
		    b[k]=new Edge(k,Integer.parseInt(x[0]),Integer.parseInt(x[1]),Integer.parseInt(x[2]));
		    }catch(Exception e){
		    }
		}
	    }catch(Exception e){
		}
	}catch(Exception e){
	    System.out.println("エラー");
	    System.exit(0);
	}

    }
 

}

class WUGraph{

    public static void main(String[] args){
	String line=args[0];
	WUGraphs a=new WUGraphs();
	a.loadGraph(line);
	a.printGraph();
    }
}
