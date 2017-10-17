public class LunchC extends LunchB{
    private String drink;
    private int pDrink;

    public LunchC(String pasta,int pPasta,String salad,int pSalad,String drink,int pDrink){
	super(pasta,pPasta,salad,pSalad);
	this.drink=drink;
	this.pDrink=pDrink;
    }
    @Override public int price(){
	return super.price()+pDrink;}

    @Override public void print(){
	super.print();
	System.out.println("Salad:"+drink+pDrink);
    }
}
