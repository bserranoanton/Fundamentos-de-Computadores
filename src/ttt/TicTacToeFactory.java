package ttt;

import java.util.Scanner;

import bgame.control.ConsolePlayerFromListOfMoves;
import bgame.control.Player;
import bgame.model.GameRules;
import connectn.ConnectNFactory;

/**
 * A Factory for Tic-Tac-Toe. It basically the same as the of ConnectN. Except
 * that it uses a different console player, creates different rules, and is
 * restricted to two players only.
 * 
 * <p>
 * Factoría del juego Tic-Tac-Toe (3 en raya). Es fundamentalmente el mismo
 * juego que ConnectN, excepto que utiliza un jugador de modo consola diferente
 * y crea reglas diferentes.
 * 
 */
public class TicTacToeFactory extends ConnectNFactory {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public GameRules gameRules() {
		return new TicTacToeRules();
	}

	@Override
	public Player createConsolePlayer() {
		// unlink ConnectN, we use the console player that shows a list of
		// possible move, etc.
		return new ConsolePlayerFromListOfMoves(new Scanner(System.in));
	}

}
