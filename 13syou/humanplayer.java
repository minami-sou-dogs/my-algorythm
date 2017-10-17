public class humanplayer extends player{

    int i;

    public humanplayer(int i){this.i=i;sethand(i);}

    public String toString(){
	String[] Shand={"グー","チョキ","パー"};
	return "出した手は"+Shand[i]+"です";
    }
}
