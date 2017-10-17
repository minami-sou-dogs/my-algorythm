public class QuadraticEquation extends Equation{
    private double a;
    private double b;
    private double c;
    private String bs;
    private String cs;
    private double z;
    private double d;

    public QuadraticEquation(double a,double b,double c){this.a=a;this.b=b;this.c=c;setName("QuadraticEquation");setb(this.b);setc(this.c);}
    public void setb(double b){
    if(b>0){
	bs="+"+b;
    }
    if(b<0){
	bs=""+b;
    }
    if(b==0){
	bs="";
    }
    }

    public void setc(double c){
    if(c>0){
	cs="+"+c;
    }
    if(c<0){
	cs=""+c;
    }
    if(c==0){
	cs="";
    }
    }

    public String solve(){
	d=Math.pow(b,2)-(4*a*c);
	if(a==0)
	    return "二次方程式ではありません";

        if(d>0){
	    return "x="+(-b+Math.pow(d,0.5))/2*a+"  x="+(-b-Math.pow(d,0.5))/2*a;
	}
	else if(d==0){
	    return "x="+(-b/2*a);
	}
	else{
	    return "x="+(-b/2*a)+"+"+Math.pow(-d,0.5)/2*a+"i"+"x="+(-b/2*a)+"-"+Math.pow(-d,0.5)/2*a+"i";
	}
    }



   public String toString(){
	return a+"x^2"+bs+"x"+cs;
    }
}
