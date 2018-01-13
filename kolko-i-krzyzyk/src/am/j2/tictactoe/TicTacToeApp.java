package am.j2.tictactoe;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Random;

public class TicTacToeApp {

	public static void main(String[] args) {

		System.out.println("this is a game TicTacToe\nYou will play against computer");
		final TicTacToe playTTT = new TicTacToe();
		String winner = null;
		playTTT.makeEmptyBoard();
		playTTT.printBoard();
		while (playTTT.isNotWinner(winner)) {
			makeMove(playTTT);
			winner = playTTT.checkWhoWon();
			playTTT.printBoard();
		}

		playTTT.printBoard();
		System.out.println("The winner is: " + winner);
		System.out.println("Congrats!");

	}

	public static void makeMove(TicTacToe playTTT) {

		boolean isOK = false;

		if (playTTT.getMoveNr() % 2 != 0) {
			while (!isOK) {
				System.out.print("Choose row - ");
				int x = readNumber("[123]");
				System.out.print("Choose column - ");
				int y = readNumber("[123]");
				isOK = playTTT.move(x, y);
			}
		} else {
			Random random = new Random();
			while (!isOK) {
				isOK = playTTT.move(random.nextInt(3), random.nextInt(3));
			}
		}
	}

	private static int readNumber (String stringPattern) {
		Pattern pattern = Pattern.compile(stringPattern);
		Scanner scanner = new Scanner(System.in);
		int chosenNr=-1;
		System.out.print("Please provide a number "+stringPattern+": ");
		while (!scanner.hasNext(pattern)) {
			System.out.print("provide a number "+stringPattern+": ");
			scanner.next();
		}
		
		chosenNr=Integer.parseInt(scanner.next());
		return chosenNr-1;
	}
}
