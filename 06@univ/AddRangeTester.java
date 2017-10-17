import java.util.Scanner;
class NotNaturalNumber extends RuntimeException{

    NotNaturalNumber(int n){super("自然数ではない:"+n);}

}

class RangeAdd{
    int add(int a,int b)throws NotNaturalNumber{
	if(a<=0||a%1!=0)
	    throw new NotNaturalNumber(a);
	if(b<=0||b%1!=0)
	    throw new NotNaturalNumber(b);
	int max=a>b?a:b;
	int min=a<b?a:b;
	int sum=0;
	for(int i=min;i<=max;i++)
	    sum+=i;
	return sum;
    }
}





class AddRangeTester{

    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.print("自然数a:"); int a=stdIn.nextInt();
	System.out.print("自然数b:"); int b=stdIn.nextInt();

	RangeAdd r=new RangeAdd();
	try{
	    System.out.println("結果は"+r.add(a,b)+"です。");
	}catch(NotNaturalNumber e){
	    System.out.println("エラーです。"+e.getMessage());
	}
    }
}
