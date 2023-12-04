package zadania.dom.dom;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        final int BOARD_SIZE = 10;
        char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

        // Inicjalizacja planszy
        initBoard(board, BOARD_SIZE);

        // Losowanie pozycji skarbu i gracza
        int[] treasurePos = generateRandomPosition(BOARD_SIZE);
        int[] playerPos = generateRandomPosition(BOARD_SIZE);

        // Ustawienie pozycji skarbu i gracza na planszy
        board[treasurePos[0]][treasurePos[1]] = 'T';
        board[playerPos[0]][playerPos[1]] = 'P';

        Scanner scanner = new Scanner(System.in);
        int moves = 0;

        // Rozpoczęcie gry
        while (true) {
            // Wyświetlenie planszy
            printBoard(board);

            // Sprawdzenie pozycji gracza
            if (playerPos[0] == treasurePos[0] && playerPos[1] == treasurePos[1]) {
                System.out.println("Gratulacje! Znalazłeś skarb po " + moves + " ruchach.");
                break;
            } else if (playerPos[0] < 0 || playerPos[0] >= BOARD_SIZE || playerPos[1] < 0 || playerPos[1] >= BOARD_SIZE) {
                System.out.println("Ups! Wyszedłeś poza planszę. Koniec gry.");
                break;
            }

            // Poruszanie się gracza
            System.out.print("Podaj kierunek (W - góra, S - dół, A - lewo, D - prawo): ");
            char direction = scanner.nextLine().toUpperCase().charAt(0);

            int[] move = getMove(direction);
            int[] newPlayerPos = {playerPos[0] + move[0], playerPos[1] + move[1]};

            // Sprawdzenie, czy gracz się zbliża do skarbu
            int distanceBefore = calculateDistance(playerPos, treasurePos);
            int distanceAfter = calculateDistance(newPlayerPos, treasurePos);

            if (distanceAfter < distanceBefore) {
                System.out.println("Zbliżasz się do skarbu!");
            } else if (distanceAfter > distanceBefore) {
                System.out.println("Oddalasz się od skarbu.");
            } else {
                System.out.println("Jesteś w tym samym miejscu.");
            }

            // Aktualizacja pozycji gracza
            playerPos = newPlayerPos;
            board[playerPos[0]][playerPos[1]] = 'P';
            moves++;
        }

        scanner.close();
    }

    // Inicjalizacja planszy
    public static void initBoard(char[][] board, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Wyświetlanie planszy
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Losowanie pozycji na planszy
    public static int[] generateRandomPosition(int size) {
        int[] position = new int[2];
        position[0] = (int) (Math.random() * size);
        position[1] = (int) (Math.random() * size);
        return position;
    }

    // Ruch gracza w zależności od kierunku
    public static int[] getMove(char direction) {
        int[] move = {0, 0};
        switch (direction) {
            case 'W':
                move[0] = -1;
                break;
            case 'S':
                move[0] = 1;
                break;
            case 'A':
                move[1] = -1;
                break;
            case 'D':
                move[1] = 1;
                break;
        }
        return move;
    }

    // Obliczenie odległości między dwoma pozycjami na planszy
    public static int calculateDistance(int[] pos1, int[] pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
}
