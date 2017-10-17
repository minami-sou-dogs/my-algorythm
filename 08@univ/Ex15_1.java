import java.util.Scanner;
class Ex15_1{
    public static void main(String[] args){
	Scanner key=new Scanner(System.in);

	System.out.println("文字列を逆順に表示します。文字列をご入力ください");
	String s=key.next();

	int wordlength=s.length();

	String sv="";

	for(int i=wordlength-1;i>=0;i--){
	    sv+=s.charAt(i);
	}
	System.out.println(sv);
    }
}
