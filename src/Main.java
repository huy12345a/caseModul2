import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("QUAN LY PHUONG TIEN : ");
        VehicleManage vehicleManage = new VehicleManage();
        try {
            do {
                System.out.println("chon chuc nang : ");
                System.out.println(" 1 : them phuong tien");
                System.out.println(" 2 : xoa phuong tien");
                System.out.println(" 3 : hien thi danh sach ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        vehicleManage.addVehicle(scanner);
                        break;
                    case 2:
                        vehicleManage.deleteVehicle(scanner);
                        break;
                    case 3:
                        vehicleManage.showVehicles();
                        break;
                }

            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}