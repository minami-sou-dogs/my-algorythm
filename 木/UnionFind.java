class UnionFind{
    private int[] parent;
    private int[] rank;

    UnionFind(int n){
	parent=new int[n];
	rank=new int[n];
	for(int i=0;i<n;i++){
	    parent[i]=i;
	    rank[i]=0;
	}

    }
    int find(int x){
	if(x==parent[x])
	    return x;
	else
	   return  find(parent[x]);
    }

    void unite(int x,int y){
	int rx=find(x);
	int ry=find(y);

	if(rank[rx]<rank[ry])
	    parent[rx]=ry;
	else{
	    parent[ry]=rx;
	    if(rank[rx]==rank[ry])
		rank[rx]++;
	}

    }
    boolean sameunit(int x,int y){
	int rx=find(x);
	int ry=find(y);
	if(rx==ry)
	    return true;
	else 
	    return false;
    }
}




