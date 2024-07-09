public class Vehicle {
    private int id;
    private String name;
    private int year;
    private String color;

    public Vehicle(int id, String name, int year, String color) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return name;
    }

    public void setManufacturer(String manufacturer) {
        this.name = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

    }
    public String toString() {
        return "id: " + id + ", name: " + name + ", year: " + year + ", color: " + color;
    }
}
