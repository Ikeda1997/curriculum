//package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
	public class Task extends Calculator{


    /**
     * タスクの実行
     */
    public void doTask() {
    	int taskValue  = plus(10);
    	System.out.println("plusメソッドの引数が一つの場合 :" + taskValue);
    	int taskValue2= plus(15,15);
    	System.out.println("plusメソッドの引数が二つの場合 :" + taskValue2);
    	int taskValue3= plus(20,20,20);
    	System.out.println("plusメソッドの引数が三つの場合 :" + taskValue3);
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

    }
}