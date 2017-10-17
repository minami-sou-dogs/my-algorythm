public class LunchA{
    private static int count=0;

    private int order;
    private String pasta;
    private int pPasta;

    public LunchA(String pasta,int pPasta){
	order=++count;
	this.pasta=pasta;
	this.pPasta=pPasta;
    }
    public int price(){return pPasta;}

    public void print(){
	System.out.println("Order:"+order);
	System.out.println("Price:"+price());
	System.out.println("Pasta:"+pasta+""+pPasta);
    }
}
