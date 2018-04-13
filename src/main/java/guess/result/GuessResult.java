package guess.result;

import oogames.result.Result;

/**
 * <p> A result implemented for a guess game.
 * 
 * <p> Results for a guess game have a line saying if the player won the game, the number chosen by 
 * the computer and the player's guess.
 *  
 * @author paulodamaso
 *
 */
public final class GuessResult implements Result {

	private final String matchResult;
	private final Integer chosenNumber;
	private final Integer playerGuess;

	public GuessResult(String result, Integer chosen, Integer guess) {
		this.matchResult = result;
		this.chosenNumber = chosen;
		this.playerGuess = guess;
	}

	@Override
  public String result() {
		return " \nGuess game result: \n" +
				this.matchResult + "\n" +
				"Number Chosen by match: " + this.chosenNumber.intValue() + "\n"+
				"Number Chosen by player" + this.playerGuess.intValue() ;
	}
	
}
