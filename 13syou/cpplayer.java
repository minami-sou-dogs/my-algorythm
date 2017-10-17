import java.util.Random;
public class cpplayer extends player{


    Random rand=new Random();
    int i=rand.nextInt(3);

	public cpplayer(){sethand(i);}

    public String toString(){
	String[] Shand={"グー","チョキ","パー"};
	return "出した手は"+Shand[i]+"です";
    }
}
