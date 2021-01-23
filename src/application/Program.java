package application;

import chess.ChessMatch;

/**
 *
 * @author Joao
 */
public class Program {

    public static void main(String[] args) {
        
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
