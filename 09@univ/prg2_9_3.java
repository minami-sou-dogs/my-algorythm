import java.io.*;
class prg2_9_3{


    public static String searchDir(String dirname,String sw){
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
	   s+=searchDir(z+dirlist[i],sw)+'\n';
	}catch(NullPointerException e){
	   int id=dirlist[i].indexOf(sw);
	   if(id!=-1)
	       s+=dirs.getAbsolutePath()+'\n';

	}
    }
    return s;
    }


    public static void main(String[] args){
	String  dirname=args[0];
	String sw=args[1];
	System.out.println(searchDir(dirname,sw));
    }
}
