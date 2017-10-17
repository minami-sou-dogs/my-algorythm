［課題番号]教科書１０章

［学籍番号］28114124

［氏名］南田宗太郎

［提出ファイル等の説明］
ファイル名にExとあるものは教科書の演習問題を示しています。例えばEx9_2教科書の演習問題の９章の２番を表しています。TriangleTesterは先生からの問題です。
［プログラムの使い方の説明］
9-1はプログラムを実行すると生成した人間クラスの内容が表示されます。
9-2以降は実行すると入力するべき内容が表示されるので入力してください。

［考察］
9_1は教科書に書いてあった初期化について熟読して生成時に初期化するときは初期化子として人間クラスに渡す引数を入力した。
9_2は教科書のDayクラスをうつして、その機能をすべて使うためにday1とday2というクラス型変数を作成して、day1の内容をtoStringのメソッドを使用して出力してequalのメソッドでday1とday2が等しいか評価した。
9_3はDayクラスを追加した上で銀行クラスにdayクラスのフィールドとtoStrinのメソッドは戻し値を	return String.format("%04d年%02d月%02d日(%s)",year,month,date,wd[day0fWeek()]);とすることでdayクラスのtostringも使用することができてより簡潔にできた.
9_4は9_3と同様
9_5は以下のようにPeriodクラスを追加するとうまくdayクラスも使用することができてより簡潔なプログラミングとなった
    class Period{
	//フィールド //
    private Day from;
    private Day to;
	//　コンストラクタ //
    public Period(Day from,Day to){
	this.from=new Day(from);this.to=new Day(to);
    }
	//印刷のメソッド //
    public String toString(){
	return String.format("開始日は"+from+"終了日は"+to);
    }
}


［自己評価］B

［教えてもらった（あげた）人の学籍番号、氏名］

