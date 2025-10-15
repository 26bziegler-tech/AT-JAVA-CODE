// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class RowOfTiles {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the width of the wall (inches): ");
        double WidthOfWall = in.nextDouble();
        
        double TILE_WIDTH = 5.0;

        int TotalTiles = (int) (WidthOfWall / TILE_WIDTH);
        
        TotalTiles = TotalTiles - (1 - TotalTiles % 2);

        double TileRowWidth = TotalTiles * TILE_WIDTH;

        double TotalGap = WidthOfWall - TileRowWidth;
        double Gap = TotalGap / 2.0;

        int BlackTiles = (TotalTiles + 1) / 2;
        int WhiteTiles = TotalTiles - BlackTiles;

        System.out.printf("Gap on the ends of the row of tiles: %.2f inches%n", Gap);
        System.out.println("# of black tiles needed: " + BlackTiles);
        System.out.println("# of white tiles needed: " + WhiteTiles);
    }
}
