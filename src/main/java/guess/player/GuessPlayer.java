package guess.player;

import java.util.Scanner;

import guess.action.BaseGuessAction;
import guess.action.GuessAction;
import guess.match.GuessMatch;
import oogames.player.MatchPlayer;
import oogames.player.Player;

/**
 * <p> A simple implementation of a guess game player. The player {@link Action} is just to provide
 * a input from the command line representing a number.
 * 
 * @author paulodamaso
 *
 */
public final class GuessPlayer implements MatchPlayer {

	private final Player origin;
	private final GuessMatch match;

	public GuessPlayer(Player origin, GuessMatch match) {
		this.origin = origin;
		this.match = match;
	}

	@Override
	public String name() {
		return this.origin.name();
	}

	@Override
	public GuessAction act() {
		return new BaseGuessAction(this.match, new Scanner(System.in).nextLine());
	}

	@Override
	public GuessMatch match() {
		return this.match;
	}
}
