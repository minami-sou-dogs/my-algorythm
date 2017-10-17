import java.util.Scanner;
import java.io.File;
class Dictionary{

    private int wordnum=46725;
    private String[] enword=new String[46725];
    private String[] jpword=new String[46725];
    public Dictionary(String filename){
	try{
	    Scanner scan=new Scanner(new File(filename));
	    for(int i=0;i<wordnum;i++){
		if(!scan.hasNextLine()){
		    break;
		}
		String line=scan.nextLine();
		int j=0;
		enword[i]="";
		for(;;j++){
		    if(line.charAt(j)!='\t'){
			enword[i]=""+enword[i]+(String.valueOf(line.charAt(j)));
		    }else{
			break;
		    }
		}
		jpword[i]="";
		j=j+1;
		for(;;j++){
		    try{
		    if(line.charAt(j)!='\n'){
			jpword[i]=""+jpword[i]+(String.valueOf(line.charAt(j)));
		    }else{
			break;
		    }
		    }catch(StringIndexOutOfBoundsException e){
			break;
		    }
		}
	    }
	}catch(java.io.FileNotFoundException e){
	    System.out.println(e);
	    System.exit(0);
		}
	    }
    public String searchEWord(String s){
	for(int i=0;i<wordnum;i++){
	    if(s.equals(enword[i])){
		return enword[i]+":"+jpword[i];
			}
	}
	    return null;
    }
    public String searchJWord(String s){
	String h="";
	for(int i=0;i<wordnum;i++){
	    int idx=jpword[i].indexOf(s);
	    if(idx>-1){
		h+=enword[i]+":"+jpword[i]+'\n';
			}
	}
	    return h;
    }

}
class prg2_8{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	Dictionary dt=new Dictionary("ejdic-hand-utf8.txt");
	System.out.println("辞書アプリです。和英なら０を英和なら１をご入力ください");
	int p=stdIn.nextInt();
	System.out.println("何の文字列を調べますか？");
	String s=stdIn.next();

	if(p==1){
	    System.out.println(dt.searchEWord(s));

    }
	if(p==0){
	    System.out.println(dt.searchJWord(s));
	}
    }
}
