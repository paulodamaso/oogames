package guess.action;

import guess.match.GuessMatch;
import oogames.action.Action;

/**
 * <p> {@link Action} implementation for a guess game. Just declares overriding methods, narrowing
 * return types to guess game related types.
 *  
 * @author paulodamaso
 *
 */
public interface GuessAction extends Action {
	
  @Override
  public abstract GuessMatch perform();

	@Override
	public abstract GuessMatch match();
	
	@Override
	public abstract GuessAction evaluate();

	public abstract Integer value();
}
