public class LunchB extends LunchA{
    private String salad;
    private int pSalad;

    public LunchB(String pasta,int pPasta,String salad,int pSalad){
	super(pasta,pPasta);
	this.salad=salad;
	this.pSalad=pSalad;
    }
    @Override public int price(){
	return super.price()+pSalad;}

    @Override public void print(){
	super.print();
	System.out.println("Salad:"+salad+pSalad);
    }
}
