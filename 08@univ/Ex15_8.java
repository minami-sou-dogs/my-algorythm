import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
class Ex15_8{
    public static void main(String[] args){
	GregorianCalendar today=new GregorianCalendar();
	System.out.println("カレンダーを表示します");
	int a;
	int b;
	int p=12;
	int r=1;
	for(String q:args)
	    r+=1;

	try{
	    a=Integer.parseInt(args[0]);
	    }catch(ArrayIndexOutOfBoundsException e){
	    a=today.get(YEAR);
	}
	try{
	    b=Integer.parseInt(args[1]);
	    }catch(ArrayIndexOutOfBoundsException e){
	    b=today.get(MONTH)+1;
	}
	if(r==2){
	    b=1;
	    p=1;
	}
	for(;p<=12;p++,b++){
	    System.out.println(a+"年"+b+"月のカレンダーを表示されます。");
	int max=a>=1995?a:1995;
        int min=a<=1995?a:1995;
	int j=0;
	for(int i=min;i<max;i++){
	    if((i%4==0)&&(i>=0)){
	    if(i%100==0 && i%400>0)
	        j=j;
	    else
		j=j+1;
	    }
	}
	int z=(max-min)*365+j;
	int maxa=b>=1?b:1;
        int mina=b<=1?b:1;
	int k=0;
	for(int i=mina;i<maxa;i++){
	    if(i==4||i==6||i==9||i==11)
		k=k-1;
	    if(i==2){
		if(a%4==0){
	    if(a%100==0 && a%400>0)
	        k=k-3;
	    else
		k=k-2;
	    }
		else
		    k=k-3;
	}
	}
	int x=(maxa-mina)*31+k;
	int y=0;
	if((b>=1)&&(a>=1995))
	    y=x+z;
	if((b>1)&&(a<1995))
	    y=-z+x;
	if((b<=1)&&(a>=1995))
	    y=z-x;
	if((b<=1)&&(a<1995))
	    y=-z-x;
		System.out.println(b+" "+a);
		System.out.println("S  M  Tu We Th F Sa ");
 
		if(b==4||b==6||b==9||b==11){
	    if(y%7==0){
		System.out.println("1  2  3  4  5  6  7 ");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30");
	    }
	    if(y%7==1||y%7==-6){
		System.out.println("   1  2  3  4  5  6 ");
		System.out.println("7  8  9  10 11 12 13");
		System.out.println("14 15 16 17 18 19 20");
		System.out.println("21 22 23 24 25 26 27");
		System.out.println("28 29 30");
	    }
	    if(y%7==2||y%7==-5){
		System.out.println("      1  2  3  4  5");
		System.out.println("6  7  8  9  10 11 12");
		System.out.println("13 14 15 16 17 18 19");
		System.out.println("20 21 22 23 24 25 26");
		System.out.println("27 28 29 30");
	    }
	    if(y%7==3||y%7==-4){
		System.out.println("         1  2  3  4");
		System.out.println("5  6  7  8  9  10 11");
		System.out.println("12 13 14 15 16 17 18");
		System.out.println("19 20 21 22 23 24 25");
		System.out.println("26 27 28 29 30");
	    }
	    if(y%7==4||y%7==-3){
		System.out.println("            1  2  3");
		System.out.println("4  5  6  7  8  9  10");
		System.out.println("11 12 13 14 15 16 17");
		System.out.println("18 19 20 21 22 23 24");
		System.out.println("25 26 27 28 29 30");
	    }
	    if(y%7==5||y%7==-2){
		System.out.println("               1  2");
		System.out.println("3  4  5  6  7  8  9");
		System.out.println("10 11 12 13 14 15 16");
		System.out.println("17 18 19 20 21 22 23");
		System.out.println("24 25 26 27 28 29 30");
	    }
 	    if(y%7==6||y%7==-1){
		System.out.println("                  1");
		System.out.println("2  3  4  5  6  7  8");
		System.out.println(" 9 10 11 12 13 14 15");
		System.out.println("16 17 18 19 20 21 22");
		System.out.println("23 24 25 26 27 28 29");
		System.out.println("30");
	    }

	}
		if(b==1||b==3||b==5||b==7||b==8||b==10||b==12){
	    if(y%7==0){
		System.out.println("1  2  3  4  5  6  7 ");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");
	    }
	    if(y%7==1||y%7==-6){
		System.out.println("   1  2  3  4  5  6 ");
		System.out.println("7  8  9  10 11 12 13");
		System.out.println("14 15 16 17 18 19 20");
		System.out.println("21 22 23 24 25 26 27");
		System.out.println("28 29 30 31");
	    }
	    if(y%7==2||y%7==-5){
		System.out.println("      1  2  3  4  5");
		System.out.println("6  7  8  9  10 11 12");
		System.out.println("13 14 15 16 17 18 19");
		System.out.println("20 21 22 23 24 25 26");
		System.out.println("27 28 29 30 31");
	    }
	    if(y%7==3||y%7==-4){
		System.out.println("         1  2  3  4");
		System.out.println("5  6  7  8  9  10 11");
		System.out.println("12 13 14 15 16 17 18");
		System.out.println("19 20 21 22 23 24 25");
		System.out.println("26 27 28 29 30 31");
	    }
	    if(y%7==4||y%7==-3){
		System.out.println("            1  2  3");
		System.out.println("4  5  6  7  8  9  10");
		System.out.println("11 12 13 14 15 16 17");
		System.out.println("18 19 20 21 22 23 24");
		System.out.println("25 26 27 28 29 30 31");
	    }
	    if(y%7==5||y%7==-2){
		System.out.println("               1  2");
		System.out.println("3  4  5  6  7  8  9");
		System.out.println("10 11 12 13 14 15 16");
		System.out.println("17 18 19 20 21 22 23");
		System.out.println("24 25 26 27 28 29 30");
		System.out.println("31");
	    }
 	    if(y%7==6||y%7==-1){
		System.out.println("                  1");
		System.out.println("2  3  4  5  6  7  8");
		System.out.println(" 9 10 11 12 13 14 15");
		System.out.println("16 17 18 19 20 21 22");
		System.out.println("23 24 25 26 27 28 29");
		System.out.println("30 31");
	    }
	}
	if(b==2){
	    if(a%4>0){
	    if(y%7==0){
		System.out.println("1  2  3  4  5  6  7 ");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("");
	    }
	    if(y%7==1||y%7==-6){
		System.out.println("   1  2  3  4  5  6 ");
		System.out.println("7  8  9  10 11 12 13");
		System.out.println("14 15 16 17 18 19 20");
		System.out.println("21 22 23 24 25 26 27");
		System.out.println("28");
	    }
	    if(y%7==2||y%7==-5){
		System.out.println("      1  2  3  4  5");
		System.out.println("6  7  8  9  10 11 12");
		System.out.println("13 14 15 16 17 18 19");
		System.out.println("20 21 22 23 24 25 26");
		System.out.println("27 28");
	    }
	    if(y%7==3||y%7==-4){
		System.out.println("         1  2  3  4");
		System.out.println("5  6  7  8  9  10 11");
		System.out.println("12 13 14 15 16 17 18");
		System.out.println("19 20 21 22 23 24 25");
		System.out.println("26 27 28 ");
	    }
	    if(y%7==4||y%7==-3){
		System.out.println("            1  2  3");
		System.out.println("4  5  6  7  8  9  10");
		System.out.println("11 12 13 14 15 16 17");
		System.out.println("18 19 20 21 22 23 24");
		System.out.println("25 26 27 28 ");
	    }
	    if(y%7==5||y%7==-2){
		System.out.println("               1  2");
		System.out.println("3  4  5  6  7  8  9");
		System.out.println("10 11 12 13 14 15 16");
		System.out.println("17 18 19 20 21 22 23");
		System.out.println("24 25 26 27 28 ");
	    }
 	    if(y%7==6||y%7==-1){
		System.out.println("                  1");
		System.out.println("2  3  4  5  6  7  8");
		System.out.println(" 9 10 11 12 13 14 15");
		System.out.println("16 17 18 19 20 21 22");
		System.out.println("23 24 25 26 27 28");
		System.out.println("");
	    }
	    }
	    if((a%4==0)&&(a>=0)){
		if((a%100==0 && a%400>0)){
	    if(y%7==0){
		System.out.println("1  2  3  4  5  6  7 ");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("");
	    }
	    if(y%7==1||y%7==-6){
		System.out.println("   1  2  3  4  5  6 ");
		System.out.println("7  8  9  10 11 12 13");
		System.out.println("14 15 16 17 18 19 20");
		System.out.println("21 22 23 24 25 26 27");
		System.out.println("28");
	    }
	    if(y%7==2||y%7==-5){
		System.out.println("      1  2  3  4  5");
		System.out.println("6  7  8  9  10 11 12");
		System.out.println("13 14 15 16 17 18 19");
		System.out.println("20 21 22 23 24 25 26");
		System.out.println("27 28");
	    }
	    if(y%7==3||y%7==-4){
		System.out.println("         1  2  3  4");
		System.out.println("5  6  7  8  9  10 11");
		System.out.println("12 13 14 15 16 17 18");
		System.out.println("19 20 21 22 23 24 25");
		System.out.println("26 27 28 ");
	    }
	    if(y%7==4||y%7==-3){
		System.out.println("            1  2  3");
		System.out.println("4  5  6  7  8  9  10");
		System.out.println("11 12 13 14 15 16 17");
		System.out.println("18 19 20 21 22 23 24");
		System.out.println("25 26 27 28 ");
	    }
	    if(y%7==5||y%7==-2){
		System.out.println("               1  2");
		System.out.println("3  4  5  6  7  8  9");
		System.out.println("10 11 12 13 14 15 16");
		System.out.println("17 18 19 20 21 22 23");
		System.out.println("24 25 26 27 28 ");
	    }
 	    if(y%7==6||y%7==-1){
		System.out.println("                  1");
		System.out.println("2  3  4  5  6  7  8");
		System.out.println(" 9 10 11 12 13 14 15");
		System.out.println("16 17 18 19 20 21 22");
		System.out.println("23 24 25 26 27 28");
		System.out.println("");
	    }
		}
		else{
	    if(y%7==0){
		System.out.println("1  2  3  4  5  6  7 ");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29");
	    }
	    if(y%7==1||y%7==-6){
		System.out.println("   1  2  3  4  5  6 ");
		System.out.println("7  8  9  10 11 12 13");
		System.out.println("14 15 16 17 18 19 20");
		System.out.println("21 22 23 24 25 26 27");
		System.out.println("28 29");
	    }
	    if(y%7==2||y%7==-5){
		System.out.println("      1  2  3  4  5");
		System.out.println("6  7  8  9  10 11 12");
		System.out.println("13 14 15 16 17 18 19");
		System.out.println("20 21 22 23 24 25 26");
		System.out.println("27 28 29");
	    }
	    if(y%7==3||y%7==-4){
		System.out.println("         1  2  3  4");
		System.out.println("5  6  7  8  9  10 11");
		System.out.println("12 13 14 15 16 17 18");
		System.out.println("19 20 21 22 23 24 25");
		System.out.println("26 27 28 29");
	    }
	    if(y%7==4||y%7==-3){
		System.out.println("            1  2  3");
		System.out.println("4  5  6  7  8  9  10");
		System.out.println("11 12 13 14 15 16 17");
		System.out.println("18 19 20 21 22 23 24");
		System.out.println("25 26 27 28 29");
	    }
	    if(y%7==5||y%7==-2){
		System.out.println("               1  2");
		System.out.println("3  4  5  6  7  8  9");
		System.out.println("10 11 12 13 14 15 16");
		System.out.println("17 18 19 20 21 22 23");
		System.out.println("24 25 26 27 28 29");
	    }
 	    if(y%7==6||y%7==-1){
		System.out.println("                  1");
		System.out.println("2  3  4  5  6  7  8");
		System.out.println(" 9 10 11 12 13 14 15");
		System.out.println("16 17 18 19 20 21 22");
		System.out.println("23 24 25 26 27 28 29");
		System.out.println("");
	    }
		}
	    }
	}
	}
    }
}
