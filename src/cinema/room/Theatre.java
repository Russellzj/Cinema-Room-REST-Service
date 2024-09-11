package cinema.room;

public class Theatre {
    private final int ROWS = 9;
    private final int COLUMNS = 9;
    private Seat[] seats = new Seat[ROWS * COLUMNS];

    {
        for(int i = 1; i < ROWS; i++) {
            for(int j = 1; i < COLUMNS; j++){
                seats[i - 1 + j - 1] = new Seat(i, j);
            }
        }
    }

    public Seat[] getSeats() {
        return seats;
    }
}
