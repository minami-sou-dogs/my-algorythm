import java.util.Scanner;
class Ex13_2{

    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.println("辺の長さがいくつの直角二等辺三角形を作りますか？");
	int z=stdIn.nextInt();
	Shape[] p=new Shape[4];
	p[0]=new ultn(z);
	p[1]=new urtn(z);
	p[2]=new dltn(z);
	p[3]=new drtn(z);

	for(Shape s:p){
	    s.print();
	    System.out.println();
	}
    }
}
