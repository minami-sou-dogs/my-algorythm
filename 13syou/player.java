public abstract class player{

    private int hand;

    public void sethand(int i){
	hand=i;

    }


    public int gethand(){
	return hand;
    }

    public abstract String toString();

    public void print(){
	System.out.println(toString());
    }
}
