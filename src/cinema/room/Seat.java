package cinema.room;

public class Seat {
    private int row;
    private int column;

    Seat(int row, int column) {
        this.row = row;
        this.column = column;
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }
}
