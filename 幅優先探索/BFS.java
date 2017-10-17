import java.util.*;
import java.io.*;
class BFSs extends Graph{
    int[] BFSTree(int root){
	Queue<Integer> kyu=new LinkedList<Integer>();
	int[]k;
	k=new int[getnum()];
	for(int i=0;i<k.length;i++)
	    k[i]=-1;
	k[root]=root;
	int fs;
	kyu.add(root);
	while(kyu.peek()!=null){
	    fs=kyu.poll();
	for(int i=0;i<b[fs].getList().size();i++){
	    int as=b[fs].getnum(i);
	    if(k[as]==-1){
	    kyu.add(as);
	    k[as]=fs;
	    }
	}
	}
	return k;
    }
    int[] getShotestPath(int start,int end){
	LinkedList<Integer> kyu=new LinkedList<Integer>();
	int[] k=BFSTree(start);
	int ans[];
	int z;
	z=end;
	while(z!=k[z]){
	    kyu.addFirst(z);
	    z=k[z];
	}
	ans=new int[kyu.size()];
	for(int i=0;i<ans.length;i++){
	    ans[i]=kyu.removeFirst();
	}

	return ans;
    }
    void ansprint(int[] ans,int start,int end){
	int length=2;
	System.out.println();
	System.out.print(start+"->"+ans[0]);
	for(int i=1;i<ans.length;i++){
	    length++;
	    System.out.print("->"+ans[i]);
	}
	System.out.println();
	System.out.println("経路長は"+length+"です");
    }
}

class BFS{


    public static void main(String[] args){
	String line=args[0];
	System.out.print(line);
	BFSs a=new BFSs();
	a.loadGraph(line);
	int start=100;
	int end=300;
	int[] path=a.getShotestPath(start,end);
	a.ansprint(path,start,end);
    }
}
