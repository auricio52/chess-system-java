package com.company.application;

import com.company.chess.ChessException;
import com.company.chess.ChessMatch;
import com.company.chess.ChessPiece;
import com.company.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
           try {
               UI.clearScreen();
               UI.printMatch(chessMatch);
               System.out.println();
               System.out.print("Print source: ");
               ChessPosition source = UI.readChessPosition(scanner);

               boolean[][] possibleMoves = chessMatch.possibleMoves(source);
               UI.clearScreen();
               UI.printBoard(chessMatch.getPieces(), possibleMoves);

               System.out.println();
               System.out.print("Print target: ");
               ChessPosition target = UI.readChessPosition(scanner);

               ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
           } catch (ChessException exception) {
                System.out.println(exception.getMessage());
                scanner.nextLine();
           } catch (InputMismatchException exception) {
               System.out.println(exception.getMessage());
               scanner.nextLine();
           }
        }

//        scanner.close();
    }
}
