public class drtn extends tn{

    public drtn(int length){super(length);}


    public String toString(){
	return "右下直角二等辺三角形(Length:"+getLength()+")";
    }

    public void draw(){
	for(int i=1;i<=getLength();i++){
	    for(int k=getLength();k>i;k--)
		System.out.print(" ");
	for(int j=1;j<=i;j++)
	    System.out.print('*');
	System.out.println();
	}
	    }
}
