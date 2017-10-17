public class ultn extends tn{

    public ultn(int length){super(length);}


    public String toString(){
	return "左上直角二等辺三角形(Length:"+getLength()+")";
    }

    public void draw(){
	for(int i=getLength();i>0;i--){
	    for(int j=1;j<=i;j++)
		System.out.print('*');
	System.out.println();
	}
	    }
}
