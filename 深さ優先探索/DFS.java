import java.util.*;
import java.io.*;
class DFSs extends BFSs{
    int[] DFSTree(int root){
	LinkedList<Integer> stack=new LinkedList<Integer>();
	int[] k=new int[getnum()];
	for(int i=0;i<k.length;i++)
	    k[i]=-1;
	k[root]=root;
	stack.addFirst(root);
	try{
	    while(true){
		root=stack.removeFirst();
	for(int i=b[root].getList().size()-1;i>=0;i--){
	    int as=b[root].getnum(i);
	    if(k[as]==-1){
	    k[as]=root;
	    stack.addFirst(as);
	    }
	}
	    }
	}catch(Exception e){
	}

	return k;
    }

   int[] getShotestPath(int start,int end){
	LinkedList<Integer> kyu=new LinkedList<Integer>();
	int[] k=DFSTree(start);
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
}


class DFS{
    public static void main(String[] args){
	String line=args[0];
	System.out.print(line);
	DFSs a=new DFSs();
	a.loadGraph(line);
	int start=150;
	int end=250;
	int[] path=a.getShotestPath(start,end);
	a.ansprint(path,start,end);
    }
}

