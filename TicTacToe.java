package com.bridgelabz.workshop.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	static char[] board = new char[10];
	static char player,computer;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getBoard();  // call for board
		getPlayer();  // call for option
		currentBoard(); // call for current board
		userMove(); // call for user to make a move 
	}
	
	// method for board 
	 static void getBoard() {
		 for (int i = 0; i < 10; i++) {
			 board[i] = ' ';
		 }
	 }
	 
	 // method to choose the option
	 static void getPlayer() {
		 System.out.print("Choose an Option x or o : ");
		 playerOption = scanner.next().charAt(0);
		 if (playerOption == 'x')
			 computerOption='o';
		 else
			 computerOption ='x';
		 System.out.println("You Selected : " +playerOption);
	 }
	 static void showBoard() {
	        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
	 }
	 private static void currentBoard() {
	        int RADIX = 10;
	        System.out.println("\n");
	        for( int i=1; i<10; i++) {
	            if (board[i] !='x'&&board[i] !='o')
	                board[i] = Character.forDigit(i, RADIX);
	        }
	        //show board method
	        showBoard();
	    }
	 static void userMove() {
	        System.out.print("\nSelect the cell from 1 to 9 : ");
	        int userChoice = scanner.nextInt();
	        if (board[userChoice] != 'x' && board[userChoice] != 'o') {
	            board[userChoice] = playerOption;
	        } else {
	            System.out.println("Invalid Cell");
	        }
	      
	        currentBoard();
	    }
}
