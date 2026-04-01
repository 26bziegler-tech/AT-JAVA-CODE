// Brennan Ziegler
// AT Software Design with Java

package mow;

public class Yard {
    private char[][] yard; 

    public Yard(int lawnHeight, int lawnWidth) {
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

    public char getValue(int row, int col) {
        return yard[row][col]; 
    }

    public void setValue(int row, int col, char value) {
        yard[row][col] = value; 
    }

    public int getHeight() {
        return yard.length - 2; 
    }

    public int getWidth() {
        return yard[0].length - 2; 
    }

    public void print() {
        for (int r = 0; r < yard.length; r++) {
            for (int c = 0; c < yard[r].length; c++) {
                System.out.print(yard[r][c]); 
            }
            System.out.println(); 
        }
    }
}