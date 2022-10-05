package com.company.chess;

import com.company.boardgame.Board;
import com.company.chess.pieces.King;
import com.company.chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return mat;
    }

    private void initialSetup() {
        placeNewPiece('a', 6, new Rook(board, Color.WHITE));
        placeNewPiece('b', 6, new King(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.WHITE));
    }

    private void placeNewPiece(char column, int row, ChessPiece chessPiece) {
        board.placePiece(chessPiece, new ChessPosition(column, row).toPosition());
    }
}
