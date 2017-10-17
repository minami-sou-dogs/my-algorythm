public abstract class Equation{

    protected String name;

    public String getName(){
	return name;
    }

    public void setName(String name){
	this.name=name;
    }

    public abstract String toString();

    public abstract String solve();

    public void print(){
	System.out.println(getName()+":"+toString()+"=0");
	System.out.println("解:"+solve());
    }
}
