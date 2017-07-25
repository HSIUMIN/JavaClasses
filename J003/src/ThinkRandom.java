
public abstract class ThinkRandom {
	protected int getRandomNum() {

		return (int) (Math.random()*10+1);
	}

	public abstract void speakRandomNum();

}
