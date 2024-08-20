public class Seat {
    private int row;
    public int seatId;
    public Category category;

    public Seat(int row, int seatId, Category category) {
        this.row = row;
        this.seatId = seatId;
        this.category = category;
    }
}
