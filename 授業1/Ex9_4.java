import java.util.Scanner;
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
    class Human{
    private String name;
    private int length;
    private int old;
	private Day birthday;
	public Human(String name,int length,int old,Day birthday){
	    this.name=name; this.length=length; this.old=old; this.birthday=new Day(birthday);
    }
    String getName(){ return name;}
    int getLength(){return length;}
    int getOld(){return old;}
	Day getBirthday(){return new Day(birthday);}
	public String toString(){
	    return String.format("%sで身長は%dで年は%d,"+birthday,name,length,old);
}
    }
class Ex9_4{
    public static void  main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.println("人間の情報を入力してください");
	System.out.print("名前は？");  String name=stdIn.next();
	System.out.print("身長は？");  int length=stdIn.nextInt();
	System.out.print("年は？");  int old=stdIn.nextInt();
	System.out.println("誕生日を入力せよ。");
	System.out.println("年："); int y=stdIn.nextInt();
	System.out.println("月："); int m=stdIn.nextInt();
	System.out.println("日："); int d=stdIn.nextInt();
	Day birthday=new Day(y,m,d);
	Human inf=new Human(name,length,old,new Day(birthday));
	System.out.println("inf="+inf);
    }
}
