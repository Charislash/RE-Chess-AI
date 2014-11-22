/**
 * 
 */
package chess;

/**
 * Class to create a chess board object composed of spaces.
 * @author Robert Coords
 */
public class ChessBoard {
	
	// Final defensive values for each piece.
	// TODO: Determine defensive values for each piece.
	final int KING_VAL = 0;
	final int QUEEN_VAL = 0;
	final int ROOK_VAL = 0;
	final int BISHOP_VAL = 0;
	final int KNIGHT_VAL = 0;
	final int PAWN_VAL = 1;
	
	Space [][] board;
	
	/**
	 * Constructor to create a chess board object.
	 */
	public ChessBoard() {
		board = new Space[8][8];
	}
	
	/**
	 * Function to initialize the chess board at the game's start.
	 */
	public void init() {
		// TODO: Initialize Chess Board.
		
	}
	
	/**
	 * Updates chess board after a move is made.
	 * @param move the most recent move made.
	 */
	public void moveUpdate(String move) {
		
	}
}
