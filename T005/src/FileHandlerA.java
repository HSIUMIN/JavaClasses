
public class FileHandlerA extends FileHandler {

	@Override
	public void handleFlie() {

		// 呼叫basicFileHandle
		basicFileHandle();
		System.out.println("Handle file in way A");
	}

}
