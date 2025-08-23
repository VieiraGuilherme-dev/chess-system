package boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int color) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColor() {
        return column;
    }

    public void setColor(int color) {
        this.column = column;
    }
    @Override
    public String toString(){
        return row + ", " + column;
    }
}
