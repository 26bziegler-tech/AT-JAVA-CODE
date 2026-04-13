package mow;

public class YardC {
    private char[][] yard;
    private int lawnHeight;
    private int lawnWidth;

    public YardC(int h, int w) {
        this.lawnHeight = h;
        this.lawnWidth = w;
        yard = new char[h + 2][w + 2];
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

    public int getHeight() { return lawnHeight; }
    public int getWidth() { return lawnWidth; }

    public char getValue(int row, int col) { return yard[row][col]; }
    public void setValue(int row, int col, char value) { yard[row][col] = value; }

    public void print(MowerC mower) {
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