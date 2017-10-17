class UnionFindTester{
    public static void main(String[] args){
	UnionFind a=new UnionFind(5);
	a.unite(0,1);
	a.unite(2,3);
	if(a.sameunit(0,2))
	    System.out.println("0と2は連結しています");
	else
	    System.out.println("0と2は連結していません");
    }
}
