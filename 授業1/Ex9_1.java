import java.util.Scanner;
    class Human{
	//フィールド//
    private String name;
    private int length;
    private int old;
    private int weight;
    private String sex;
	//コンストラクタ//
    Human(String name,int length,int old,int weight,String sex){
	this.name=name; this.length=length; this.old=old; this.weight=weight;
	this.sex=sex;
    }
	//ゲッタ//
    String getName(){ return name;}
    int getLength(){return length;}
    int getOld(){return old;}
    int getWeight(){return weight;}
    String getSex(){return sex;}
}
class Ex9_1{
    public static void  main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	//生成時に初期化したもの//
	Human[] s={new Human("南田宗太郎",175,20,56,"男"),new Human("名工太郎",24,34,12,"男")};
	for(int i=0;i<s.length;i++){
	    System.out.println("s["+i+"]="+s[i].getName()+"様,"+s[i].getLength()+"cm,"+s[i].getOld()+"歳,"+s[i].getWeight()+"kg,"+s[i].getSex());
	}
	//生成後の要素に値を代入したもの//
	Human[] h;
	h=new Human[]{new Human("南田宗太郎",175,20,56,"男"),new Human("名工太郎",24,34,12,"男")};
	for(int i=0;i<s.length;i++){
	    System.out.println("s["+i+"]="+s[i].getName()+"様,"+s[i].getLength()+"cm,"+s[i].getOld()+"歳,"+s[i].getWeight()+"kg,"+s[i].getSex());
	}
    }
}
