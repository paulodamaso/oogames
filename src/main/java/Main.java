import guess.match.GuessMatch;

import java.util.Scanner;
import oogames.player.SimplePlayer;

/**
 * Main class for games. This is a really big big big big biggy biggy biggy biggy biggy biggy biggy biggy comment. 
 * 
 * @author paulodamaso
 *
 */
public final class Main {

  public static void main(final String[] args) {

    final Scanner scanner = new Scanner(System.in);
    System.out.println("Write your OO name: ");

    GuessMatch guessMatch = new GuessMatch(new SimplePlayer(scanner.nextLine()));
    System.out.println(guessMatch.play().result());
    scanner.close();
  }

}
