package com.company.application;

import com.company.boardgame.Board;
import com.company.boardgame.Position;
import com.company.chess.ChessMatch;
import com.company.chess.ChessPiece;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}
