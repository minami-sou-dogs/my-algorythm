public class Trigonometric extends Equation{
    private double b=0;
    private String bs;

    public Trigonometric(double b){this.b=b;setName("TrigonometricEquation");setb(this.b);}
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
    public String solve(){
	return "x="+Math.asin(-b);
    }

    public String toString(){
	return "sinx"+bs;
    }
}
