import java.util.Scanner;
class Ex15_5{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);

	System.out.println("じゃんけんをします。数字を入力してください０ならばグー１ならばチョキ２ならばパー");

	int k=stdIn.nextInt();

	player j=new humanplayer(k);

	j.print();

	player l1=new cpplayer();

	l1.print();

	player l2=new cpplayer();

	l2.print();

	int a=j.gethand();
	int b=l1.gethand();
	int c=l2.gethand();
	if((a==b&&b==c)||(a!=b&&a!=c&&b!=c)){
	    System.out.println("あいこです");
	}else if((a!=b)&&(c==b)){
	    if(((a-b)==-1)||(a-b==2))
		System.out.println("プレイヤーの一人勝ちです");
	    else
		System.out.println("プレイヤーの一人負けです");
	}else if((b!=c)&&(a==b)){
	    if(((a-c)==-1)||(a-c==2))
		System.out.println("プレイヤーとコンピューターの二人勝ちです");
	    else
		System.out.println("プレイヤーとコンピューターの二人負けです");
	}else if((b!=c)&&(a==c)){
	    if(((a-b)==-1)||(a-b==2))
		System.out.println("プレイヤーとコンピューターの二人勝ちです");
	    else
		System.out.println("プレイヤーとコンピューターの二人負けです");
	}
    }
}
