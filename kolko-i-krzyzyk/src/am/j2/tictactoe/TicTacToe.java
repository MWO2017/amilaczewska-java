package am.j2.tictactoe;

public class TicTacToe {
	private String[][] board = new String[5][5];
	private int moveNr = 1;

	public int getMoveNr() {
		return moveNr;
	}

	public void makeEmptyBoard() {
		for (int i = 0; i < board.length; i++) {
			if (i % 2 == 0) {
				board[i][0] = "   ";
				board[i][2] = "   ";
				board[i][4] = "   ";
			} else {
				board[i][0] = "---";
				board[i][2] = "---";
				board[i][4] = "---";
			}
			board[i][1] = "|";
			board[i][3] = "|";
		}
	}

	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}System.out.println();
	}
	
	/**
	 * @param x -coordinate for row on a game board (0, 1, 2) 
	 * @param y -coordinate for column on a game board (0, 1, 2)
	 * @return	true if the move is valid, otherwise false 
	*/
	public boolean move(int x, int y) { 
		// metoda pozwalajaca wykonac ruch na planszy - postawienie "x" lub "o" 
		boolean isEmpty = false;
		
		x=x*2;
		y=y*2;
		if (board[x][y].equals("   ")) {
			if (moveNr % 2 == 0) {
				board[x][y] = " o ";
			} else {
				board[x][y] = " x ";
			}
			moveNr++;
			isEmpty = true;
		} else {
			System.out.println("The filed is not empty. Try different field");
			isEmpty = false;
		}
		
		return isEmpty;
	}
	public boolean isNotWinner(String winner) {
		if (winner==null || winner=="   ") {
			return true;
		}else {
			return false;
		}
	}
	
	public String checkWhoWon() {
		String winner=null;
		if(moveNr>=6) {
			for(int i=0; i<3 && isNotWinner(winner); i++) {
				if(board[i*2][0].equals(board[i*2][2]) && board[i*2][2].equals(board[i*2][4]) && board[i*2][0].equals(board[i*2][4])) {
					winner=board[i*2][0];
				}
			}
			for(int i=0; i<3 && isNotWinner(winner); i++) {
				if(board[0][i*2].equals(board[2][i*2]) && board[2][i*2].equals(board[4][i*2]) && board[0][i*2].equals(board[4][i*2])) {
					winner=board[0][i*2];
				}
			}
			if(board[0][0].equals(board[2][2]) && board[2][2].equals(board[4][4]) && board[0][0].equals(board[4][4]) && isNotWinner(winner)) {
					winner=board[0][0];
			}
			if(board[0][4].equals(board[2][2]) && board[2][2].equals(board[4][0]) && board[0][4].equals(board[4][0]) && isNotWinner(winner)) {
				winner=board[0][4];
			}
			if (moveNr==10 && isNotWinner(winner)) {
				winner="tie";
			}
			
		}return winner;
	}
}
