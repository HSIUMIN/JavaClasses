
public class Runner {

	public static void main(String[] args) {
		parent parent = new parent("shinobu");
		parent.whoAmI();
		Child child = new Child("ayaneru");
		child.whoAmI();
		parent anotherChild = new Child("saoneru");
		anotherChild.whoAmI();
		parent lover = new parent("rumi");
		lover.whoAmI();
		lover.whatAmI();
	}

}
