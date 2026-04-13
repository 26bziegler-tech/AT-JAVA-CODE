package mow;

import java.util.Random;

public class MowerC {
    private int row;
    private int col;
    private int direction; 

    public MowerC() {
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public int getDirection() { return direction; }

    public void randomize(YardC yard) {
        Random rand = new Random();
        int h = yard.getHeight();
        int w = yard.getWidth();

        this.row = (rand.nextBoolean()) ? 1 : h;
        this.col = (rand.nextBoolean()) ? 1 : w;

        this.direction = rand.nextInt(4);
    }

    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    public void moveForward() {
        if (direction == 0) row--;
        else if (direction == 1) col++;
        else if (direction == 2) row++;
        else if (direction == 3) col--;
    }

    private char look(YardC yard, int dir) {
        int r = row;
        int c = col;
        if (dir == 0) r--;
        else if (dir == 1) c++;
        else if (dir == 2) r++;
        else if (dir == 3) c--;
        return yard.getValue(r, c);
    }

    public boolean updateMower(YardC yard) {
        yard.setValue(row, col, ' ');

        if (look(yard, direction) == '+') {
            moveForward();
            return true;
        } 
        
        int rightDir = (direction + 1) % 4;
        if (look(yard, rightDir) == '+') {
            turnRight();
            moveForward();
            return true;
        }

        for (int i = 0; i < 4; i++) {
            if (look(yard, i) == '+') {
                direction = i;
                moveForward();
                return true;
            }
        }

        return false; 
    }
}
