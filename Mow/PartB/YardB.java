// Brennan Ziegler
// AT Software Design with Java

package mow;

public class YardB {
    private char[][] yard;

    public YardB(int lawnHeight, int lawnWidth) {
        yard = new char[lawnHeight + 2][lawnWidth + 2];
        for (int r = 0; r < yard.length; r++) {
            for (int c = 0; c < yard[r].length; c++) {
                if (r == 0 || r == yard.length - 1 || c == 0 || c == yard[r].length - 1) {
                    yard[r][c] = 'R'; 
                } else {
                    yard[r][c] = '+'; 
                }
            }
        }
    }

    public char getValue(int row, int col) { return yard[row][col]; }
    public void setValue(int row, int col, char value) { yard[row][col] = value; }

    public void print(MowerB mower) {
        char[] icons = {'^', '>', 'v', '<'};
        for (int r = 0; r < yard.length; r++) {
            for (int c = 0; c < yard[r].length; c++) {
                if (r == mower.getRow() && c == mower.getCol()) {
                    System.out.print(icons[mower.getDirection()]);
                } else {
                    System.out.print(yard[r][c]);
                }
            }
            System.out.println();
        }
    }
}