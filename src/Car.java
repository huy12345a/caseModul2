public class Car extends Vehicle {
    private int seats;

    public Car(int id, String name, int years, String color, int seats) {
        super(id, name, years, color);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public String toString() {
        String s ="Licenseplates : "+ getLicenseplates() + ", Name : " + getName() + ", Year : " + getYear() + ", color : " + getColor() + ", Seats : " + getSeats();
        return s;
    }
}
