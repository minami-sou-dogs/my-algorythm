public class LinearEquation extends Equation{
    private double a=0;
    private double b=0;
    private String bs;
    private double z;

    public LinearEquation(double a,double b){this.a=a;this.b=b;setName("LinearEquation");setb(this.b);}
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
	if(a==0)
	    return "変数xの解はありません";
	else {
	    z=-b/a;
	    return "x="+z;
	}
    }

    public String toString(){
	return a+"x"+bs;
    }
}
