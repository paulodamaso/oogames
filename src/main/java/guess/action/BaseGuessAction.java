package guess.action;

import guess.match.GuessMatch;

/**
 * Base {@link GuessAction} implementation, with extremely basic funcionality. Does not
 * 
 * @author paulodamaso
 *
 */
public final class BaseGuessAction implements GuessAction {

  private final GuessMatch match;
  private final String value;

  public BaseGuessAction(GuessMatch match, String value) {
    this.match = match;
    this.value = value;
  }

  @Override
  public GuessAction evaluate() {
    try {
      return new ValidGuessAction(this, new Integer(value));
    } catch (Exception e) {
      return new InvalidGuessAction(this);
    }
  }

  @Override
  public GuessMatch match() {
    return this.match;
  }

  @Override
  public Integer value() {
    /*
     * @todo #4 BaseGuessAction#value() must return a null value, because it has not been evaluated
     * yet, or it must return #evaluate().value() ?
     */
    return null;
  }

  @Override
  public GuessMatch perform() {
    // cant' perform return same match
    return this.match;
  }

}
