public class dltn extends tn{

    public dltn(int length){super(length);}


    public String toString(){
	return "左下直角二等辺三角形(Length:"+getLength()+")";
    }

    public void draw(){
	for(int i=1;i<=getLength();i++){
	    for(int j=1;j<=i;j++)
		System.out.print('*');
	System.out.println();
	}
	    }
}
