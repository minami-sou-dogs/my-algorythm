public class Prb13_3{
    public static void main(String[] args){
	    int counter=1;
	try{
	    method1(0);
	    counter+=1;
	    method2(0);
	    counter+=1;
	    method3(0);
	}catch(Exception e){
	    System.out.println("method"+counter+"からエラーが起きました。");
	    System.out.println(""+e);
	}
    }
    static void method1(int x)throws Exception{
	throw new Exception();
    }
    static void method2(int x)throws Exception{
    }
    static void method3(int x)throws Exception{
    }
}
