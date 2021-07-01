package com.bridgelabz.workshop.tictactoe;

public class TicTacToeGame {
	static char[] board = new char[10];

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");

	}
	static void getBoard() {
        for(int i=0; i<10; i++) {
            board[i]=' ';
        }
    }
}
