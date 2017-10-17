import java.io.*;
public class prb18_2{
    public static void main(String[] args){
	if(args.length!=2){
	    System.out.println("使用法：java prb18_2 検索文字列　検索対象ファイル");
	    System.exit(0);
	}

	String line;
	String filename;
	try{
	    String line;
	    int linenum=1;
	    BufferedReader reader=new BufferedReader(new FileReader(filename));
	    while((line=reader.readLine())!=null){
		int n=line.indexOf(findstring);
		if(n>=0){
		    System.out.println(linenum+":"+line);
		}
		linenum++;
	    }
	    reader.close();
	}catch(FileNotFoundException e){
	    System.out.println(filename+"が見つかりません");
	}catch(IOException e){
	    System.out.println(e);
	}
    }
}
