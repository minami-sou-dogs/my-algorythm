import java.util.Scanner;
import java.io.*;
class FileReader{
    void read(String filename)throws FileNotFoundException{
	try{
	Scanner scanner=new Scanner(new File(filename));
	while(scanner.hasNextLine()){
	    String line=scanner.nextLine();
	    System.out.println(line.toUpperCase());
	}
	scanner.close();
	}catch(FileNotFoundException e){
	throw new FileNotFoundException();
	}
    }
}
public class FileReaderTester{
    public static void main(String[] args){
	try{
	FileReader f=new FileReader();
	f.read("aa.txt");
	}catch(FileNotFoundException e){
	    System.out.println("Error");
	}
    }
}
