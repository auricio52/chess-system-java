package com.company.application;

import com.company.boardgame.Board;
import com.company.boardgame.Position;

public class Program {
    public static void main(String[] args) {
        Board board = new Board(8,8);

        System.out.println(board);
    }
}
