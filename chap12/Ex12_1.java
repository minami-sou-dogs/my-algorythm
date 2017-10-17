import java.util.Scanner;
class Car{
    private String name;
    private int width;
    private int height;
    private int length;
    protected double x;
    protected double y;
    private double fuel;

    public Car(String name,int width,int height,int length,double fuel){
	this.name=name; this.width=width; this.height=height; this.length=length; this.fuel=fuel; x=y=0.0;
    }

    public double getX(){return x;}
    public double getY(){return y;}
    public double getFuel(){return fuel;}



    public void putSpec(){
	System.out.println("名前："+name);
	System.out.println("車幅："+width+"mm"); 
	System.out.println("車高："+height+"mm");  
	System.out.println("車長："+length+"mm");
    }

    public boolean move(double dx,double dy){
	double dist=Math.sqrt(dx*dx+dy*dy);

	if(dist>fuel)
	    return false;
	else{
	    fuel-=dist;
	    x+=dx;
	    y+=dy;
	    return true;
	}
    }
}

class Carx extends Car{
    private double z=0.0;

    Carx(String name,int width,int height,int length,double fuel){
	super(name,width,height,length,fuel);
    }


    double getZ(double dx,double dy){
	z+=Math.sqrt(dx*dx+dy*dy);
	return z;
    }  
}
class Ex12_1{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	Carx a=new Carx("愛車",2,2,2,100000.0);
	Car b=a;
	int a1=stdIn.nextInt();
	int b1=stdIn.nextInt();
	if(b.move(a1,b1))
	    System.out.println(a.getZ(a1,b1));
	if(b.move(a1,b1))
	    System.out.println(a.getZ(a1,b1));
    }
}


