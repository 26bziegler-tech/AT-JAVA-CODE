// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;
import java.util.Random;

public class MineSweeper {

    static char[][] Map = new char[9][9];
    static char[][] Board = new char[9][9];
    static boolean GameOver = false;
    static int TilesLeftToWin = 71; 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Board[i][j] = '#';
            }
        }

        GenerateMap();

        while (GameOver == false) {
            DrawBoard(Board);
            
            System.out.println("What would you like to do?");
            System.out.println("1. Reveal Tile");
            System.out.println("2. Flag/Unflag Tile");
            System.out.println("3. Quit");
            System.out.print("Choice: ");
            int Choice = in.nextInt();

            if (Choice == 3) {
                System.out.println("Goodbye!");
                GameOver = true;
            } else {
                System.out.print("Enter Row (0-8): ");
                int r = in.nextInt();
                System.out.print("Enter Column (0-8): ");
                int c = in.nextInt();

                if (Choice == 1) {
                    HandleReveal(r, c);
                } else if (Choice == 2) {
                    HandleFlag(r, c);
                }
            }

            if (TilesLeftToWin == 0) {
                DrawBoard(Map);
                System.out.println("You won! All safe tiles revealed.");
                GameOver = true;
            }
        }
    }

    public static void GenerateMap() {
        Random Rand = new Random();
        
        int MinesPlaced = 0;
        while (MinesPlaced < 10) {
            int r = Rand.nextInt(9);
            int c = Rand.nextInt(9);
            if (Map[r][c] != 'b') {
                Map[r][c] = 'b';
                MinesPlaced++;
            }
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (Map[r][c] != 'b') {
                    int Count = 0;

                    for (int i = r - 1; i <= r + 1; i++) {
                        for (int j = c - 1; j <= c + 1; j++) {

                            if (i >= 0 && i < 9 && j >= 0 && j < 9) {
                                if (Map[i][j] == 'b') {
                                    Count++;
                                }
                            }
                        }
                    }
                    
                    if (Count > 0) {
                        Map[r][c] = (char)(Count + '0'); 
                    } else {
                        Map[r][c] = ' ';
                    }
                }
            }
        }
    }

    public static void HandleReveal(int r, int c) {
        if (Board[r][c] != '#') {
            System.out.println("That tile is already revealed or flagged!");
            return;
        }

        if (Map[r][c] == 'b') {
            Board[r][c] = 'm';
            DrawBoard(Board);
            System.out.println("GAME OVER - You hit a mine!");
            GameOver = true;
        } else {
            Board[r][c] = Map[r][c];
            TilesLeftToWin--;
        }
    }

    public static void HandleFlag(int r, int c) {
        if (Board[r][c] == '#') {
            Board[r][c] = 'f';
        } else if (Board[r][c] == 'f') {
            Board[r][c] = '#';
        }
    }

    public static void DrawBoard(char[][] AnyArray) {
        ClearScreen();

        System.out.println("  0 1 2 3 4 5 6 7 8");
        for (int i = 0; i < 9; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 9; j++) {
                System.out.print(AnyArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}