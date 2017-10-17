import java.util.Scanner;
class Ex13_3{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);

	System.out.println("じゃんけんをします。数字を入力してください０ならばグー１ならばチョキ２ならばパー");

	int k=stdIn.nextInt();

	player j=new humanplayer(k);

	j.print();

	player l=new cpplayer();

	l.print();

	int a=j.gethand();
	int b=l.gethand();
	if(a!=b){
	    if((a-b)<0&&(a-b)!=-2){
	    System.out.println("人間の勝利です");
	    }else if(a==2&&b==0){
	    System.out.println("人間の勝利です");
	    }else {
	    System.out.println("cpの勝利です");
	}
	}
	if(a==b)
	    System.out.println("あいこです");
    }
}

