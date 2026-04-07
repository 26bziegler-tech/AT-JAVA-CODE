// Brennan Ziegler
// AT Software Design with Java

package mow;

public class MowerB {
    private int row;
    private int col;
    private int direction; 

    public MowerB(int row, int col, int direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    public int getRow() { return row; }
    public void setRow(int row) { this.row = row; }
    public int getCol() { return col; }
    public void setCol(int col) { this.col = col; }
    public int getDirection() { return direction; }
    public void setDirection(int direction) { this.direction = direction; }

    public void moveForward() {
        if (direction == 0) row--;
        else if (direction == 1) col++;
        else if (direction == 2) row++;
        else if (direction == 3) col--;
    }

    public char sense(YardB yard) {
        int r = row;
        int c = col;
        if (direction == 0) r--;
        else if (direction == 1) c++;
        else if (direction == 2) r++;
        else if (direction == 3) c--;
        return yard.getValue(r, c);
    }

    public void cut(YardB yard) {
        yard.setValue(row, col, ' ');
    }
}