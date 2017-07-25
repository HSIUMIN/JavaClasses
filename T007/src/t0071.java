/**
 * 實作時間記錄：
 * 日期：<07/17>: <02:19>~<02:30>: <00:11>
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：
 * 設計規格：
 * 設計想法：
 * 將跟10有關的改成100
 * 虛擬碼：
 * 創一個矩陣，長度100。 array[0]:放0出現的次數，類推
 * 用for產生100次亂數
 * 產生亂數並暫存
 * 按照產生亂數對應的Array[]中更新出現次數
 * 計算出現比例
 * 印出
 */

/**
 * @author user
 *
 */
public class t0071 {
	public static void main (String[] args){
//		 * 創一個矩陣，長度100。 array[0]:放0出現的次數，類推
		int[] iHitCnt = new int[100];
//		 * 用for產生100次亂數
		for (int id = 0; id < 100; id++) {
//		 * 產生亂數並暫存
			int iNum = (int)(Math.random()*100);
//		* 按照產生亂數更新出現次數
			iHitCnt[iNum]++;
		}
//		 * 計算出現比例		 
		for (int id = 0; id < iHitCnt.length; id++) {
			double dbPercent = (iHitCnt[id]/100.0)*100.0;
//		 * 印出
			System.out.println("數字:"+id+"出現比例:"+dbPercent+"%");
		}

	}
}
