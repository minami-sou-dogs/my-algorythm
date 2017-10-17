import java.util.Scanner;
class VariableBaseValue{
    private static int base=10;
    private int value;

    public VariableBaseValue(int v){value=v;}

    public static void setBase(int b){
	if(b>=2||b<=10)
	    base=b;
	if(b<2)
	    base=2;
	if(b>10)
	    base=10;
    }
    public int getBase(){
	return base;
    }
    public int getValue(){
	return value;
    }
    public void setValue(int k){
	value=k;
    }
    //n進数変換//
    public String toString(){
	int v=value;
	String s="";
	do{
	    s=(v%base)+s;
	    v/=base;
	}while(v>0);
	return String.format("%d進数は%s",base,s);
    }
}
class VarBaseValTester{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.println("何進数表示しますか？");
	int n=stdIn.nextInt();
	VariableBaseValue.setBase(n);
	int[] varBaseVals=new int[3];
	for(int i=0;i<varBaseVals.length;i++){
	    System.out.println("何の値を"+n+"進数表示しますか？");
	    varBaseVals[i]=stdIn.nextInt();
	}
	VariableBaseValue a=new VariableBaseValue(varBaseVals[0]);
	VariableBaseValue b=new VariableBaseValue(varBaseVals[1]);
	VariableBaseValue c=new VariableBaseValue(varBaseVals[2]);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println("次は"+varBaseVals[0]+"を違う進数で表示します!何進数表示しますか？");
	int z=stdIn.nextInt();
	VariableBaseValue.setBase(z);
	System.out.println(a.getValue());
	System.out.println(a);
	System.out.println("次は"+z+"進数表示を違う数字で行います？");
	int l=stdIn.nextInt();
	a.setValue(l);
	System.out.println(a);
    }
}
