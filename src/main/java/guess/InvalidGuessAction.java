package guess;

import oogames.action.InvalidAction;
import oogames.player.Player;

public final class InvalidGuessAction implements GuessAction, InvalidAction {

	private final GuessAction origin;

	public InvalidGuessAction(GuessAction origin) {
		this.origin = origin;
	}

	@Override
	public Player player() {
		return origin.player();
	}

	@Override
	public GuessMatch match() {
		return origin.match();
	}

	@Override
	public Integer value() {
		//must return what, if this action is invalid?
		return origin.value();
	}

	@Override
	public GuessMatch perform() {
		// do nothing
		return origin.match();
	}

	@Override
	public InvalidGuessAction evaluate() {
		return this;
	}
}
