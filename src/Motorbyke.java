public class Motorbyke extends Vehicle {
    private int wattage;

    public Motorbyke(int id, String name, int years, String color, int wattage) {
        super(id, name, years, color);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
    public String toString() {
        return super.toString() + "\nWattage: " + wattage;
    }
}
