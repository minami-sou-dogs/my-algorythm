public class Prb13_2{
    public static void main(String[] args){
	int[] myarray=new int[3];
	System.out.println("代入します");
	myAssign(myarray,100,0);
	System.out.println("終了します");
    }
    static void myAssign(int[] arr,int index,int value){
	try{
	    System.out.println("myAssignにきました");
	    arr[index]=value;
	    System.out.println("代入しました");
	    System.out.println("myAssignに帰ります");
	}catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("代入できませんでした");
	    System.out.println("例外は"+e+"です。");
	}

    }
}
