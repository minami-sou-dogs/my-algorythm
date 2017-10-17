import java.io.*;
class prg2_9_2{
    public static void main(String[] args){
	if(args.length!=1){
	    System.out.println("");
	    System.out.println("");
	    System.exit(0);
	}
	int k=0;
	int j=0;
	for(int i=0;i<args[0].length();i++){
	    if(args[0].charAt(i)=='/'){
		k+=1;
	    }
	}
	String[] dirname=new String[k+1];
	dirname[0]="";
	for(int i=0;i<args[0].length();i++){
	    if(args[0].charAt(i)=='/'){
		j+=1;
		dirname[j]="";
	    }else{
		dirname[j]+=args[0].charAt(i);
	    }
	}

	File[] dir=new File[dirname.length];
	dir[0]=new File(dirname[0]);
	String path=dirname[0];
	for(int i=1;i<dirname.length;i++){
	    path+='/'+dirname[i];
	    dir[i]=new File(path);
	}

	for(int i=0;i<dir.length;i++){

	    if(dir[i].mkdir()){
		System.out.println("絶対パスは"+dir[i].getAbsolutePath());
	    }else{
		System.out.println("失敗");
	    }
	}
    }
}
