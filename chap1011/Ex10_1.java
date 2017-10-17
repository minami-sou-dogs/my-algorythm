class Id{
    static int counter=0;
    private int id;

    //コンストラクタ//
    public Id(){
	id=++counter;
    }

    //識別番号の返却 //
    public int getId(){
	return id;
    }

    //最大の識別番号の返却//
    static int getMaxId(){
	return counter;
    }
}
class Ex10_1{
    public static void main(String[] args){
	Id a=new Id();
	Id b=new Id();
	System.out.println("aの識別番号；"+a.getId());
	System.out.println("bの識別番号"+b.getId());

	System.out.println("Id.counter"+Id.counter);
	System.out.println("最後に与えた識別番号は"+Id.getMaxId());
    }
}
