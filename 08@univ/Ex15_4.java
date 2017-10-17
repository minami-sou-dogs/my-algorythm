class Ex15_4{

    public static void printDouble(double x,int p,int w){

	String s=String.format("%"+w+"."+p+"f",x);
	System.out.println(s);
    }

    public static void main(String[] args){
	printDouble(123.45,3,9);
    }
}
