package guess.action;

import guess.match.GuessMatch;
import oogames.action.InvalidAction;

/**
 * <p> An invalid guess action. These actions didn't passed in validations of the 
 * {@link GuessAction#evaluate()} method implementation.
 *  
 * @author paulodamaso
 *
 */
public final class InvalidGuessAction implements GuessAction, InvalidAction {

	private final GuessAction origin;

	public InvalidGuessAction(GuessAction origin) {
		this.origin = origin;
	}

	@Override
	public Integer value() {
		/*
		 * @todo #4 InvalidGuessAction#value() must return a null value, because it is invalid, or 
		 * just the origin value?
		 */
		return null;
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

	@Override
	public GuessMatch match() {
		return origin.match();
	}
}
