import java.util.Scanner;
class Account{
    private String name;
    private String no;
    private long balance;
    Account(String n,String num,long z){
	name=n;
	no=num;
	balance=z;
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

    void deposit(long k){
	balance+=k;
    }
    void withdraw(long k){
	balance-=k;
    }
}

class TimeAccount extends Account{
    private long timeBalance;

    TimeAccount(String name,String no,long balance,long timeBalance){
	super(name,no,balance);
	this.timeBalance=timeBalance;
    }

    long getTimeBalance(){
	return timeBalance;
    }

    void cancel(){
	deposit(timeBalance);
	timeBalance=0;
    }
}

class Ex12_2{

    static int compBalance(Account a,Account b){
	if(a instanceof TimeAccount){
	    if((((TimeAccount)a).getBalance()+((TimeAccount)a).getTimeBalance())>(((TimeAccount)b).getBalance()+((TimeAccount)b).getTimeBalance()))
	    return 1;
	    else if((((TimeAccount)a).getBalance()+((TimeAccount)a).getTimeBalance())==(((TimeAccount)b).getBalance()+((TimeAccount)b).getTimeBalance()))
	    return 0;
	else 
	    return -1;
	}
	else{
	    if((a.getBalance())>(b.getBalance()))
	    return 1;
	else if((a.getBalance())==(b.getBalance()))
	    return 0;
	else 
	    return -1;
	}
    }
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	System.out.println("誰かの銀行口座を作ります");
	System.out.println("誰の銀行口座を作りますか？");
	String a0=stdIn.next();
	System.out.println("口座番号はいくつですか？");
	String a1=stdIn.next();
	System.out.println("いくら預金しますか？");
	Long a2=stdIn.nextLong();
	Account az=new Account(a0,a1,a2);

	System.out.println("誰かの銀行口座を作ります");
	System.out.println("誰の銀行口座を作りますか？");
	String b0=stdIn.next();
	System.out.println("口座番号はいくつですか？");
	String b1=stdIn.next();
	System.out.println("いくら預金しますか？");
	Long b2=stdIn.nextLong();
	Account bz=new Account(b0,b1,b2);

	switch(compBalance(az,bz)){
	case 1:System.out.println(az.getName()+"の方が"+bz.getName()+"より多くお金を持っている"); break;
	case 0:System.out.println(az.getName()+"と"+bz.getName()+"は同じ金額を持っている"); break;
	case -1:System.out.println(bz.getName()+"の方が"+az.getName()+"より多くお金を持っている");
	}
    }
}



