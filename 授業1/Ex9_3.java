import java.util.Scanner;
class Account{
    private String name;
    private String no;
    private long balance;
    private Day day2;
    Account(String n,String num,long z,Day day){
	name=n;
	no=num;
	balance=z;
	day2=new Day(day);
    }
    String getName(){
	return name;
    }
    String getNo(){
	return no;
    }
    long getBalance(){
	return balance;
    }
	Day getday(){return new Day(day2);}
    void deposit(long k){
	balance+=k;
    }
    void withdraw(long k){
	balance-=k;
    }
    public String toString(){
	return String.format("名前は"+name+"番号は"+no+"預金残高は"+balance+"口座開設日は"+day2);
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
    // ゲッタ//
    public int getYear(){return year;}
    public int getMonth(){return month;}
    public int getDate(){return date;}
    // セッタ//
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
class Ex9_3{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.println("口座情報を入力してください");
	System.out.println("名前を入力ください"); String name=stdIn.next();
	System.out.println("口座番号を入力してください");String num=stdIn.next();
	System.out.println("預金残高を入力してください");long balance=stdIn.nextLong();
	System.out.println("口座開設日を入力せよ。");
	System.out.println("年："); int y=stdIn.nextInt();
	System.out.println("月："); int m=stdIn.nextInt();
	System.out.println("日："); int d=stdIn.nextInt();
	Day day2=new Day(y,m,d);
	Account day1=new Account(name,num,balance,new Day(day2));
	System.out.println("day1="+day1);
    }
}
