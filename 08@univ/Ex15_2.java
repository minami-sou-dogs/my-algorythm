import java.util.Scanner;
class Ex15_2{
    public static void main(String[] args){
	Scanner key=new Scanner(System.in);

	System.out.println("文字コードを表示します。文字列をご入力ください");
	String s=key.next();


	for(int i=0;i<s.length();i++){
	    System.out.println(s.charAt(i)+"の文字コードは"+s.codePointAt(i));
	}
    }
}
