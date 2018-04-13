package guess.match;

import guess.action.GuessAction;
import guess.player.GuessPlayer;
import guess.result.GuessResult;
import oogames.match.Match;
import oogames.player.Player;

/**
 * <p> {@link Match} of a guess game. In guess game, computes chooses a random number between 0 and
 * 10 and the player must guess this number.
 * 
 * @author paulodamaso
 *
 */
public final class GuessMatch implements Match {

	private final GuessPlayer player;
	private final Integer chosenNumber;
	private final GuessAction action;

	public GuessMatch(Player player) {
		/*
		 * @todo #4 remove null reference in GuessMatch(Player) ctor
		 */
		this.player = new GuessPlayer(player, this);
		this.chosenNumber = new Integer(new Double(Math.random() * 10).intValue());
		this.action = null;
	}

	public GuessMatch(GuessMatch match, GuessAction action) {
		this.player = match.player;
		this.chosenNumber = match.chosenNumber;
		this.action = action;
	}

	@Override
	public GuessResult result() {
		return 
				( this.action.value().intValue() == this.chosenNumber.intValue()) ? 
					new GuessResult("Wow, you've guessed the number! :D", 
							this.chosenNumber, 
							this.action.value()) :
					new GuessResult("Oh no, you're wrong :/", this.chosenNumber, this.action.value())
					;
	}

	@Override
	public GuessMatch play() {
		System.out.println("Guess my number: ");
		return player.act().evaluate().perform();
	}
}
