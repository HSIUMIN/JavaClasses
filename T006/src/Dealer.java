import java.util.ArrayList;
/*
 * Dealer 發牌員
 * Poker 撲克牌
 */
public abstract class Dealer {
	private ArrayList<String> Poker;
	
	public abstract void deal();//發牌
	public abstract void shuffle();//洗牌
}
