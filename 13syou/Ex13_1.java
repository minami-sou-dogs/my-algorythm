import java.util.Scanner;
class Ex13_1{

    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.println("図形をいくつ作りますか？");
	int z=stdIn.nextInt();
	Shape[] p=new Shape[z];
	int x;
	int y;
	for(int i=0;i<p.length;i++){
	    System.out.println((i+1)+"番の図形の種類（1...点/2...水平直線/3...垂直直線/4...長方形");
	    x=stdIn.nextInt();
	    if(x==1){
		p[i]=new Point();
	    }
	    if(x==2){
		System.out.println("長さは？");
		y=stdIn.nextInt();
		p[i]=new HorzLine(y);
	    }
	    if(x==3){
		System.out.println("長さは？");
		y=stdIn.nextInt();
		p[i]=new VertLine(y);
	    }
	    if(x==4){
		System.out.println("幅は？");
		y=stdIn.nextInt();
		System.out.println("高さは?");
		z=stdIn.nextInt();
		p[i]=new Rectangle(y,z);
	    }
	    p[i].print();
	    System.out.println();
	}
    }
}
