import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManage {
    public List<Vehicle> vehicles = new ArrayList<>();

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void addVehicle(Scanner scanner) {
        System.out.println("1. o to : ");
        System.out.println("2. xe may : ");
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhap bien so xe : ");
        int licenseplates = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhap name: ");

        String name = scanner.nextLine();
        System.out.println("nhap nam san xuat : ");
        int years = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhap mau xe : ");
        String color = scanner.nextLine();
        if (choice == 1) {
            System.out.println("nhap so cho ngoi: ");
            int seats = Integer.parseInt(scanner.nextLine());
            Vehicle vehicle = new Car(licenseplates, name, years, color, seats);
            vehicles.add(vehicle);
            System.out.println(vehicle);
        }
        if (choice == 2) {
            System.out.println("nhap cong suat xe: ");
            int wattage = Integer.parseInt(scanner.nextLine());
            Vehicle vehicle = new Motorbyke(licenseplates, name, years, color, wattage);
            vehicles.add(vehicle);
            System.out.println(vehicle);
        }
    }

    public void deleteVehicle(Scanner scanner) {
        System.out.println("nhap bien so xe can xoa : ");
        int licenseplates = Integer.parseInt(scanner.nextLine());
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicenseplates() == licenseplates) {
                vehicles.remove(vehicle);
                System.out.println("da xoa");
                break;
            }
        }
        System.out.println(vehicles);
    }

    public void showVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }


}

