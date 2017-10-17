import java.io.*;
class prg2_9_1{
    public static void main(String[] args){
	if(args.length!=2){
	    System.out.println("使用法：java prg2_9_1 コピー元ファイル　コピー先ファイル");
	    System.exit(0);
	}
	String scrfilename=args[0];
	String dstfilename=args[1];
	try{
	    BufferedReader reader=new BufferedReader(new FileReader(dstfilename));
	    System.exit(0);
	}catch(FileNotFoundException e){
	}
	try{
	    BufferedReader reader=new BufferedReader(new FileReader(scrfilename));
	    PrintWriter writer=new PrintWriter(new BufferedWriter(new FileWriter(dstfilename)));
	    String line;
	    while((line=reader.readLine())!=null){
		writer.println(line);
	    }
	    reader.close();
	    writer.close();
	}catch(FileNotFoundException e){
	    System.out.println(e);
	}catch(IOException e){
	    System.out.println(e);
	}
    }
}
