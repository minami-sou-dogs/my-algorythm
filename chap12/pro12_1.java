class pro12_1{
    public static void main(String[] args){
	LunchA a=new LunchA("イタリアン",500);
	LunchA bAsA=new LunchB("ペペロンチーノ",500,"トマトサラダ",200);
	LunchA cAsA=new LunchC("イカスミ",600,"シーザーサラダ",250,"エスプレッソ",120);

	a.print();
	bAsA.print();
	cAsA.print();
    }
}
