class Ex15_7{
    public static void main(String[] args){
	double sum=0.0;
	for(String i:args)
	    sum+=Double.parseDouble(i);
	System.out.println("合計は"+sum+"です。");
    }
}
