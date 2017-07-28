/**
 * 實作時間記錄：
 * 日期：<07/27>: <12:35>~<12:45>: <00:00>
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：用helloer取代runner使用public void main的工作
 * 設計規格：用helloer取代runner完成輸出"I’m a helloer."
 * 設計想法：
 * 在main外面先設定方法，在用main去呼叫自己的方法
 * 虛擬碼：
 *  設定sayhello方法
 *  "I’m a helloer."方法內print
 *  在main中創建實體hello
 *  呼叫自己的sayhello方法
 */
/**
 * @author user
 *
 */
public class Helloer {
	//設定sayhello方法
	public void sayHello() {
		//"I’m a helloer."方法內print
		System.out.println("I’m a helloer.");
	}
	public static void main(String[] args) {
		//在main中創建實體hello
		Helloer hello = new Helloer();
		//呼叫自己的sayhello方法
		hello.sayHello();
	}

}
