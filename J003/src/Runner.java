
public class Runner {
	public static void main(String[] args) {

		EnglishSpeaker englishSpeaker = new EnglishSpeaker();
		playTenTimes(englishSpeaker);
		ChineseSpeaker chineseSpeaker = new ChineseSpeaker();
		playTenTimes(chineseSpeaker);
	}
	public static void playTenTimes(ThinkRandom thinkRandom) {
		for (int id = 0; id < 10; id++) {
			thinkRandom.speakRandomNum();
		}
	}
}
