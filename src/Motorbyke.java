public class Motorbyke extends Vehicle {
    private final int wattage;

    public Motorbyke(int id, String name, int years, String color, int wattage) {
        super(id, name, years, color);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public String toString() {
        return "Licenseplates : " + getLicenseplates() + ", Name : " + getName() + ", Year : " + getYear() + ", color : " + getColor() + ", Wattage : " + getWattage();
    }
}
