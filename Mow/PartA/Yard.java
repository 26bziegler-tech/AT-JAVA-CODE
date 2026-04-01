// Brennan Ziegler
// AT Software Design with Java

package mow;

public class Yard {
    
    char Yard[][]; 
    
    public Yard(int Height, int Width) {
        Yard = new char[Height + 2][Width + 2]; 
        
        for (int r = 0; r < Yard.length; r++) {
            for (int c = 0; c < Yard[r].length; c++) {
                if (r == 0 || r == Yard.length - 1 || c == 0 || c == Yard[r].length - 1) {
                    Yard[r][c] = 'R'; 
                } else {
                    Yard[r][c] = '+'; 
                }
            }
        }
    }

    public char getValue(int r, int c) {
        return Yard[r][c];
    }

    public void setValue(char Value, int r, int c) {
        Yard[r][c] = Value; 
    }

    public int getHeight() {
        return Yard.length; 
    }

    public int getWidth() {
        return Yard[0].length; 
    }

    public void print() {
        for (int r = 0; r < getHeight(); r++) {
            for (int c = 0; c < getWidth(); c++) {
                System.out.print(Yard[r][c]); 
            }
            System.out.println();
        }
    }

    public void print(Mower m) {
        for (int r = 0; r < getHeight(); r++) {
            for (int c = 0; c < getWidth(); c++) {
                if (c == m.getX() && r == m.getY()) {
                    System.out.print(m.getArrow()); 
                } else {
                    System.out.print(Yard[r][c]); 
                }
            }
            System.out.println();
        }
    }

    public boolean isValidPosition(int Row, int Col) {
        return Row >= 0 && Row < getHeight() && Col >= 0 && Col < getWidth() && Yard[Row][Col] != 'R'; 
    }

    public boolean isCleared() {
        for (int r = 0; r < getHeight(); r++) {
            for (int c = 0; c < getWidth(); c++) {
                if (Yard[r][c] == '+') {  
                    return false; 
                }
            }
        }
        return true; 
    }

    public boolean isClearAround(Mower m) {
        int x = m.getX();
        int y = m.getY();
        return yard[y - 1][x] == '+' && Yard[y + 1][x] == '+' && Yard[y][x - 1] == '+' && Yard[y][x + 1] == '+';
    }

    public static void main(String[] args) {
        Yard y = new Yard(6, 7);
        Mower m = new Mower(1, 1, 0); 
        y.print(m); 
    }
}