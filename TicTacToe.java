import java.util.Scanner;

public class TicTacToeGame {
	static char[] board = new char[10];
	static char player,computer;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getBoard();
		getPlayer();
		currentBoard();
	}
	
	 static void getBoard() {
		 for (int i = 0; i < 10; i++) {
			 board[i] = ' ';
		 }
	 }
	 
	 static void getPlayer() {
		 System.out.print("Choose an Option x or o : ");
		 player = scanner.next().charAt(0);
		 if (player == 'x')
			 computer='o';
		 else
			 computer ='x';
		 System.out.println("You Selected : " +player);
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
	            if (board[i] !='x' && board[i] !='o')
	                board[i] = Character.forDigit(i, RADIX);
	        }
	        showBoard();
	    }
}
