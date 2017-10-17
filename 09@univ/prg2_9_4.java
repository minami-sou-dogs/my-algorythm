import java.io.*;
class prg2_9_4{


    public static String searchDir(String dirname,int l){
	File dir=new File(dirname);
	String z="";
	String s="";
	z+=dirname+'/';
	String[] dirlist=dir.list();
	for(int i=0;i<dirlist.length;i++){
	    File dirs=new File(z+dirlist[i]);
	    String[] dirlists=dirs.list();
	try{
	    if(dirlists[0]==null){
	    }
	    for(int k=0;k<l;k++)
		s+="  ";
	    s+=dirlist[i]+"/"+'\n';
	    s+=searchDir(z+dirlist[i],l+1);
	}catch(NullPointerException e){
	    for(int k=0;k<l;k++)
		s+="  ";
	       s+=dirlist[i]+'\n';

	}
    }
    return s;
    }


    public static void main(String[] args){
	String  dirname=args[0];
	String dstfilename=args[1];
	String z= searchDir(dirname,0);
	try{
	PrintWriter writer=new PrintWriter(new BufferedWriter(new FileWriter(dstfilename)));
	writer.print(z);
	writer.close();
	BufferedReader reader=new BufferedReader(new FileReader(dstfilename));
	String line;
	while((line=reader.readLine())!=null){
	    System.out.println(line);
		}
	}catch(FileNotFoundException e){
	    System.out.println(e);
	}catch(IOException e){
	    System.out.println(e);
	}
    }
}
