import java.util.Scanner;
    class Period{
    private Day from;
    private Day to;
    public Period(Day from,Day to){
	this.from=new Day(from);this.to=new Day(to);
    }
    public String toString(){
	return String.format("開始日は"+from+"終了日は"+to);
    }
}
class Day{
    private int year=1;
    private int month=1;
    private int date=1;
    //--constract--//
    public Day(){}
    public Day(int year){this.year=year;}
    public Day(int year,int month){this(year);this.month=month;}
    public Day(int year,int month,int date){this(year,month);this.date=date;}
    public Day(Day d){this(d.year,d.month,d.date);}

    public int getYear(){return year;}
    public int getMonth(){return month;}
    public int getDate(){return date;}

    public void setYear(int year){this.year=year;}
    public void setMonth(int month){this.month=month;}
    public void setDate(int date){this.date=date;}

    public void set(int year,int month,int date){
	this.year=year;
	this.month=month;
	this.date=date;
    }
    public int day0fWeek(){
	int y=year;
	int m=month;
	if(m==1||m==2){
	    y--;
	    m+=12;
	}
	return(y+y/4-y/100+y/400+(13*m+8)/5+date)%7;
    }
    public boolean equalTo(Day d){
	return year==d.year&&month==d.month&&date==d.date;
    }
    public String toString(){
	String[] wd={"日","月","火","水","木","金","土"};

	return String.format("%04d年%02d月%02d日(%s)",year,month,date,wd[day0fWeek()]);
    }
}
class Ex9_5{
    public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    System.out.println("開始日を入力せよ。");
    System.out.println("年："); int y=stdIn.nextInt();
    System.out.println("月："); int m=stdIn.nextInt();
    System.out.println("日："); int d=stdIn.nextInt();
    System.out.println("終了日を入力せよ。");
    System.out.println("年："); int y1=stdIn.nextInt();
    System.out.println("月："); int m1=stdIn.nextInt();
    System.out.println("日："); int d1=stdIn.nextInt();
    Day f1=new Day(y,m,d);

    Day f2=new Day(y1,m1,d1);
    Period p=new Period(f1,f2);
    System.out.println(p);
    }
}
