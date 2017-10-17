public class urtn extends tn{

    public urtn(int length){super(length);}


    public String toString(){
	return "右上直角二等辺三角形(Length:"+getLength()+")";
    }

    public void draw(){
	for(int i=1;i<=getLength();i++){
	    for(int k=1;k<i;k++)
		System.out.print(" ");
	for(int j=i;j<=getLength();j++)
	    System.out.print('*');
	System.out.println();
	}
	    }
}
