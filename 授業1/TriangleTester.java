import java.util.Scanner;
class Triangle{
    //　初期化　//
    private double a=1.0;
    private double b=1.0;
    private double c=1.0;
    // 多重定義のコンストラクタ　//
    public Triangle(double n){this(n,n,n);}
    public Triangle(double l,double m){this(l,l,m);}
    public Triangle(double a,double b,double c){this.a=a;this.b=b;this.c=c;}
    // ゲッタ //
    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}
    //　セッタ //
    public void setA(double a){this.a=a;}
    public void setB(double b){this.b=b;}
    public void setC(double c){this.c=c;}
    //　印刷のメソッド //
    public String toString(){
	return String.format("生成した三角形の辺の長さは%fと%fと%fです",a,b,c);
    }
    //　求めたい三角形ができているかの確認メソッド //
    public boolean equalTo2(Triangle z){
	return z.b==z.a;
    }
    public boolean equalTo3(Triangle z){
	return z.b==z.a&&z.c==z.b&&z.a==z.c;
    }
    public boolean equalTo4(Triangle z){
	return a==z.a&&b==z.b&&c==z.c;
    }
}
class TriangleTester{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	// クラス型変数の配列 //
	Triangle[] triangles=new Triangle[3];
	System.out.println("3辺の異なる長さを入力ください");
	double y=stdIn.nextInt();
	double m=stdIn.nextInt();
	double d=stdIn.nextInt();
        triangles[0]=new Triangle(y,m,d);
	System.out.println(triangles[0]);
	if(triangles[0].equalTo2(triangles[0]))
	    System.out.println("二等辺三角形はできています");
	if(triangles[0].equalTo3(triangles[0]))
	    System.out.println("正三角形はできています");
	if(triangles[0].equalTo4(triangles[0]))
	    System.out.println("三角形は合っています");
	System.out.println("2辺の異なる長さを入力ください");
	double y1=stdIn.nextInt();
	double m1=stdIn.nextInt();
        triangles[1]=new Triangle(y1,m1);
	System.out.println(triangles[1]);
	if(triangles[0].equalTo2(triangles[1]))
	    System.out.println("二等辺三角形はできています");
	if(triangles[0].equalTo3(triangles[1]))
	    System.out.println("正三角形はできています");
	if(triangles[1].equalTo4(triangles[1]))
	    System.out.println("三角形は合っています");
	System.out.println("1辺の異なる長さを入力ください");
	double y2=stdIn.nextInt();
        triangles[2]=new Triangle(y2);
	System.out.println(triangles[2]);
	if(triangles[0].equalTo2(triangles[2]))
	    System.out.println("二等辺三角形はできています");
	if(triangles[0].equalTo3(triangles[2]))
	    System.out.println("正三角形はできています");
	if(triangles[2].equalTo4(triangles[2]))
	    System.out.println("三角形は合っています");
    }
}
