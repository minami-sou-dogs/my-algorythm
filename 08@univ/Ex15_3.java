import java.util.Scanner;
class Ex15_3{
    public static void main(String[] args){
	Scanner key=new Scanner(System.in);

	System.out.println("文字列s1:");
	String s1=key.next();
	System.out.println("文字列s2:");
	String s2=key.next();

	int idx=s1.indexOf(s2);

	if(idx==-1){
	    System.out.println("s1中にs2は含まれません");
	}else{
	    System.out.println(s1);
	for(int i=1;i<=idx;i++){
	    System.out.print("　");
	}
	System.out.print(s2);
	System.out.println();
	}
    }
}
