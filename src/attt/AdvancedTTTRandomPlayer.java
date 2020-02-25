package attt;

import bgame.control.Player;
import bgame.model.Board;
import bgame.model.GameMove;
import bgame.model.GameRules;
import bgame.model.Piece;
import connectn.ConnectNRandomPlayer;

import java.util.List;
import java.util.Random;

/**
 * A random player for Advanced Tic-Tac-Toe. It inherits the functionality from
 * {@link ConnectNRandomPlayer} just by overriding the method
 * {@link #createMove(int, int, Piece)}.
 * 
 * <p>
 * Jugador aleatorio para el juego Tic-Tac-Toe avanzado. Hereda la funcionalidad
 * de {@link ConnectNRandomPlayer} pues sobrescribe solamente el metodo
 * {@link #createMove(int, int, Piece)}.
 *
 */
public class AdvancedTTTRandomPlayer extends Player {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Random random = new Random();

	@Override
	public GameMove requestMove(Piece p, Board board, List<Piece> pieces, GameRules rules) {
		List<GameMove> availableMoves = rules.validMoves(board, pieces, p);
		return availableMoves.get(random.nextInt(availableMoves.size()));
	}}
