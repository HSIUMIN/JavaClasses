/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：
 * 設計規格：
 * 設計想法：
 * 虛擬碼：
 *  
 */

/**
 * @author user
 *
 */
import java.util.Scanner;

public class scanner {
	private static Scanner scanner;

	public static void main(String[] args) {
	        int num1, num2, num3;
	        scanner = new Scanner(System.in);
	        
	        System.out.println("請輸入三個數字(以空白鍵分開)：");
	        num1 = scanner.nextInt();
	        num2 = scanner.nextInt();
	        num3 = scanner.nextInt();
	        System.out.println("您輸入第一個數字為：" + num1 );
	        System.out.println("您輸入第二個數字為：" + num2 );
	        System.out.println("您輸入第三個數字為：" + num3 );

	    }
}
