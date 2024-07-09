import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManage {
   ArrayList<Vehicle> vehicles = new ArrayList<>();
    public  void addVehicle(Scanner scanner) {
        System.out.println("1. o to : ");
        System.out.println("2. xe may : ");
        int choice = scanner.nextInt();
        System.out.println(" nhap id : ");
        int id = scanner.nextInt();
        System.out.println(" nhap name: ");
        String name = scanner.next();
        System.out.println("nhap nam san xuat : ");
        int years = scanner.nextInt();
        System.out.println(" nhap mau xe : ");
        String color = scanner.next();
        if (choice == 1) {
            System.out.println("nhap so cho ngoi: ");
            int seats = scanner.nextInt();
            Vehicle vehicle = new Car(id, name, years, color, seats);
            vehicles.add(vehicle);
            System.out.println(vehicle.toString());
        }
        if (choice == 2) {
            System.out.println("nhap cong suat xe: ");
            int wattage = scanner.nextInt();
            Vehicle vehicle = new Motorbyke(id, name, years, color, wattage);
            vehicles.add(vehicle);
            System.out.println(vehicle.toString());
        }
    }

    public void deleteVehicle(Scanner scanner) {
        System.out.println("nhap id xe can xoa : ");
        int id = scanner.nextInt();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                vehicles.remove(vehicle);
            }
        }
    }
    public void showVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

}

