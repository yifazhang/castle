package castle;

public class HandlerDo extends Handler{

	public HandlerDo(Game game) {
		super(game);
	}

	@Override
	public void doCmd(String word) {
		game.goRoom(word);
	}
	
	
}
