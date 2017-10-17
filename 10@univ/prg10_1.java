import java.util.*;
class prg10_1{
    public static void main(String[] args){

	LinkedList<Integer> ks=new LinkedList<Integer>();
	System.out.println("逆ポーランド計算機です。計算したい式を入力してください。");
	Scanner key1=new Scanner(System.in);
	String key=key1.nextLine();
	ArrayList<String> list=new ArrayList<String>();

	String[] k=key.split(" ",0);
		for(String name:k){
		    try{
		    ks.addFirst(Integer.parseInt(name));

		}catch(Exception e){

			int a=ks.removeFirst();
			int b=ks.removeFirst();
			if(name.equals("+"))
			   ks.addFirst(a+b);
			if(name.equals("-"))
			   ks.addFirst(a-b);
			if(name.equals("*"))
			   ks.addFirst(a*b);
			if(name.equals("/"))
			   ks.addFirst(a/b);
		    }
		}
		System.out.println("計算結果は"+ks.removeFirst());
    }

}


