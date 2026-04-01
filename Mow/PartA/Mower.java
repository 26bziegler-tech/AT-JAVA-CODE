// Brennan Ziegler
// AT Software Design with Java

package mow;

import java.util.Random;

public class Mower {
    int x;
    int y;
    int Dir;
    Random Rand = new Random();

    public Mower(int x, int y, int Dir) {
        this.x = x;
        this.y = y;
        this.Dir = Dir;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public int getDir() { return Dir; }
    public void setDir(int Dir) { this.Dir = Dir; }

    public void move(Yard Yard) {
        int NextX = x, NextY = y;
        if (Dir == 0) NextY--;
        else if (Dir == 1) NextX++;
        else if (Dir == 2) NextY++;
        else if (Dir == 3) NextX--;

        if (Yard.isValidPosition(NextY, NextX) && Yard.getValue(NextY, NextX) != 'R') {
            x = NextX;
            y = NextY;
            mow(yard);
        }
    }

    public boolean checkInFront(Yard Yard) {
        int NextX = x, NextY = y;
        if (Dir == 0) NextY--;
        else if (Dir == 1) NextX++;
        else if (Dir == 2) NextY++;
        else if (Dir == 3) NextX--;

        return Yard.isValidPosition(NextY, NextX) && Yard.getValue(NextY, NextX) == '+';
    }

    public char getArrow() {
        return (Dir == 0) ? '^' : (Dir == 1) ? '>' : (Dir == 2) ? 'v' : '<';
    }

    public void mow(Yard Yard) {
        Yard.setValue(' ', this.y, this.x);
    }

    public void right() {
        Dir = (Dir + 1) % 4;
    }

    public void left() {
        Dir = (Dir + 3) % 4;
    }

    private boolean checkDirection(Yard Yard, int Direction) {
        int NextX = x, NextY = y;
        if (Direction == 0) NextY--;
        else if (Direction == 1) NextX++;
        else if (Direction == 2) NextY++;
        else if (Direction == 3) NextX--;

        return Yard.isValidPosition(NextY, NextX) && Yard.getValue(NextY, NextX) == '+';
    }

    public boolean checkForGrassAround(Yard Yard) {
        for (int i = 0; i < 4; i++) {
            if (checkDirection(Yard, i)) {
                Dir = i;
                return true;
            }
        }
        return false;
    }

    public boolean isSafeToMoveForward(Yard Yard) {
        int NextX = x, NextY = y;
        if (Dir == 0) NextY--;
        else if (Dir == 1) NextX++;
        else if (Dir == 2) NextY++;
        else if (Dir == 3) NextX--;

        return yard.isValidPosition(NextY, NextX) && Yard.getValue(NextY, NextX) != 'R';
    }

    public void wanderUntilGrass(Yard Yard) {
        while (!Yard.isCleared()) {
            printYard(Yard);
            delay(500);
            if (checkInFront(Yard)) {
                move(Yard);
                continue;
            }

            if (isSafeToMoveForward(Yard)) {
                move(Yard);
                if (checkForGrassAround(Yard)) {
                    mow(Yard);
                    continue;
                }
            } else {
                if (checkForGrassAround(Yard)) {
                    move(Yard);
                    mow(Yard);
                    continue;
                } else {
                    right();
                }
            }
        }
        printYard(Yard);
    }

    private void printYard(Yard Yard) {
        clearScreen(); 
        for (int i = 0; i < Yard.getHeight(); i++) {
            for (int j = 0; j < Yard.getWidth(); j++) {
                if (i == y && j == x) {
                    System.out.print(getArrow());
                } else {
                    System.out.print(Yard.getValue(i, j));
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long Milliseconds) {
        try {
            Thread.sleep(Milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Error: Interrupted while sleeping!");
        }
    }
}