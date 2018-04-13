package guess;

/**
 * <p> {@link GuessAction} implementation.
 * 
 * @author paulodamaso
 *
 */
public final class SimpleGuessAction implements GuessAction {

	private final GuessMatch match;
	private final GuessPlayer player;
	private final String value;

	public SimpleGuessAction(GuessPlayer player, String value) {
		this.match = player.match();
		this.player = player;
		this.value = value;
	}
	
	public SimpleGuessAction(GuessPlayer player) {
		/*
		 * @todo #15 SimpleGuessAction ctor should not use null.
		 */
		this(player, null);
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
	public GuessPlayer player() {
		return this.player;
	}

	@Override
	public GuessMatch match() {
		return this.match;
	}


	@Override
	public Integer value() {
		//and now?
		return this.value;
	}

	@Override
	public GuessMatch perform() {
		//cant' perform return same match
		return this.match;
	}

}
