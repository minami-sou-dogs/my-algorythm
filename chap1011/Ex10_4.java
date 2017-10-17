import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
import java.util.Scanner;
 class Day1{

     public static boolean isLeap(int y){
	 return y%4==0&&y%100!=0||y%400==0;
     }

     private int year=1;
     private int month=1;
     private int date=1;
     
     GregorianCalendar today=new GregorianCalendar();
    
    //--constract--//
     public Day1()                           {year=today.get(YEAR);month=today.get(MONTH)+1;date=today.get(DATE);}
     public Day1(int year)                   {this.year=year;}
     public Day1(int year,int month)         {this(year);this.month=month;}
     public Day1(int year,int month,int date){this(year,month);this.date=date;}
     public Day1(Day1 d)                     {this(d.year,d.month,d.date);}

     // 日付の調整 //
     public void confirm(int y,int month,int date){
	 if(month>12){
	     this.month=12;
	     month=12;
	 }
	 if(month==2&&date>28){
	     this.date=28;
	 }
	 if(month==2&&date>29&&y%4==0&&y%100!=0||y%400==0){
	     this.date=29;
	 }
	 if(month==4||month==6||month==9||month==11&&date>30){
	     this.date=30;
	 }
	 if(month==1||month==3||month==5||month==7||month==8||month==10||month==12&&date>31){
	     this.date=31;
	 }
     }

     // 経過日数のカウント//
     public int getkeika(Day1 d){
	     int count=d.date;
	 for(int i=1;i<d.month;i++){
	     if(i==2&&d.year%4==0&&d.year%100!=0||d.year%400==0)
		 count+=29;
	     else if(i==2)
		 count+=28;
	     if(i==4||i==6||i==9||i==11)
		 count+=30;
	     if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
		 count+=31;
	 }
	 return count;
     }

     // 残り日数のカウント //
     public int getremain(Day1 d){
	 int remain=0;
	 int count=d.date;
	 int y=d.year;
	 for(int i=1;i<d.month;i++){
	     if(i==2&&d.year%4==0&&d.year%100!=0||d.year%400==0)
		 count+=29;
	     else if(i==2)
		 count+=28;
	     if(i==4||i==6||i==9||i==11)
		 count+=30;
	     if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
		 count+=31;
	 }
	 if(y%4==0&&y%100!=0||y%400==0)
	     remain=366-count;
	 else
	     remain=365-count;
	 return remain;
     }

     //ゲッタ//
    public int getYear(){return year;}
    public int getMonth(){return month;}
    public int getDate(){return date;}

     //セッタ//
    public void setYear(int year){this.year=year;}
    public void setMonth(int month){this.month=month;}
    public void setDate(int date){this.date=date;}

    public void set(int year,int month,int date){
	this.year=year;
	this.month=month;
	this.date=date;
    }
     public boolean isLeap(){return isLeap(year);}
    public int day0fWeek(){
	int y=year;
	int m=month;
	if(m==1||m==2){
	    y--;
	    m+=12;
	}
	return(y+y/4-y/100+y/400+(13*m+8)/5+date)%7;
    }

    public boolean equalTo(Day1 d){
	return year==d.year&&month==d.month&&date==d.date;
    }

    public String toString(){
	confirm(year,month,date);
	String[] wd={"日","月","火","水","木","金","土"};

	return String.format("%04d年%02d月%02d日(%s)",year,month,date,wd[day0fWeek()]);
    }
}


class Ex10_4{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	Day1 d=new Day1();
	System.out.println(d);
	System.out.println("日付を入力してください");
	System.out.println("年は");
	int y=stdIn.nextInt();
	System.out.println("月は");
	int m=stdIn.nextInt();
	System.out.println("日は");
	int dz=stdIn.nextInt();
	Day1 d1=new Day1(y,m,dz);
	System.out.println(d1);
	System.out.println("今年から"+d1.getkeika(d1)+"日たちました");
	System.out.println("あと"+d1.getremain(d1)+"あります");
    }
}
