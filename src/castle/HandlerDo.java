package castle;

public class HandlerDo extends Handler {

	private HandlerDoInterface doInterface = null;
	
	public HandlerDo setDoInterface(HandlerDoInterface doInterface) {
		this.doInterface = doInterface;
		return this;
	}

	@Override
	public void doCmd(String word) {
		if (doInterface != null) {
			doInterface.doSomething(word);
		}
	}
}
