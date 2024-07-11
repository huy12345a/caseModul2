import java.io.Serializable;

public abstract class Vehicle implements Serializable {
    private int licenseplates;
    private String name;
    private int year;
    private String color;
    private String type;

    public Vehicle(int licenseplates, String name, int year, String color) {
        this.licenseplates = licenseplates;
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLicenseplates() {
        return licenseplates;
    }

    public void setLicenseplates(int licenseplates) {
        this.licenseplates = licenseplates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
