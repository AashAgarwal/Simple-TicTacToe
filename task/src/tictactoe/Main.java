package tictactoe;

import java.util.Scanner;

public class Main {

    public static String[][] gameBoard(String[] inputArray) {
        String[][] gameBoard = new String[3][3];
        int index = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = inputArray[index];
                index++;
            }
        }
        return gameBoard;
    }

    public static void printResult(String[][] gameBoard) {
        System.out.println("---------");
        for (String[] strings : gameBoard) {
            System.out.print("| ");
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static void state(String[][] gameBoard) {
        boolean gameNotFinished = false;
        for (String[] strings : gameBoard) {
            for (String string : strings) {
                if (string.isEmpty()) {
                    gameNotFinished = true;
                    break;
                }
            }
        }
        int countX = 0;
        int countO = 0;
        for (String[] strings : gameBoard) {
            for (String string : strings) {
                if ("X".equals(string)) {
                    countX++;
                } else if ("O".equals(string)){
                    countO++;
                }
            }
        }
        if (gameNotFinished) {
            System.out.println("Game not finished");
        } else if (Math.abs(countX - countO) > 1) {
            System.out.println("Impossible");
        } else if (countX + countO == 9) {

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] inputArray = input.split("");
        printResult(gameBoard(inputArray));
    }
}
