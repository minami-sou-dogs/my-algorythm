import java.util.Scanner;
class pro13{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	Equation[] p=new Equation[3];
	System.out.println("線形方程式を解きます");
	System.out.println("一次の項の係数は？");
	double a=stdIn.nextDouble();
	System.out.println("定数の項の係数は？");
	double b=stdIn.nextDouble();
        p[0]=new LinearEquation(a,b);
	System.out.println("二次方程式を解きます");
	System.out.println("2次の項の係数は？");
	 a=stdIn.nextInt();
	System.out.println("一次の項の係数は？");
	 b=stdIn.nextInt();
	 System.out.println("定数項の係数は？");
	 double c=stdIn.nextDouble();
	 p[1]=new QuadraticEquation(a,b,c);
	 System.out.println("三角方程式を解きます");
	 System.out.println("sinx+b=0のxを求めます。bに何を入れますか？");
	 b=stdIn.nextDouble();
	 p[2]=new Trigonometric(b);
	 for(Equation s:p){
	     s.print();
	 }
    }
}
