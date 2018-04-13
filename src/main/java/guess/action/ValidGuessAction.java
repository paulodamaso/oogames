package guess.action;

import guess.match.GuessMatch;
import oogames.action.ValidAction;

public final class ValidGuessAction implements GuessAction, ValidAction {

    private final GuessAction origin;
	private final Integer value;
	
	public ValidGuessAction(GuessAction origin, Integer value) {
		this.origin = origin;
		this.value = value;
	}

	@Override
	public GuessMatch perform() {
		return origin.perform();
	}

	@Override
	public GuessMatch match() {
		return origin.match();
	}

	@Override
	public Integer value() {
		return this.value;
	}

	@Override
	public ValidGuessAction evaluate() {
		return this;
	}
	
	

}
