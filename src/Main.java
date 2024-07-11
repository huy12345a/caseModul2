import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements Menu {
    public static void main(String[] args) {
        System.out.println("QUAN LY PHUONG TIEN : ");
        VehicleManage vehicleManage = new VehicleManage();
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("chon chuc nang : ");
                System.out.println(" 1 : them phuong tien");
                System.out.println(" 2 : xoa phuong tien");
                System.out.println(" 3 : hien thi danh sach ");
                System.out.println(" 4 : tim kiem phuong tien theo bien so: ");
                System.out.println(" 5 : ghi du lieu vao file ");
                System.out.println(" 6 : copy du lieu tu file khac");
                System.out.println(" 7 : thoat chuong trinh");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case ADD_VEHICLE:
                        vehicleManage.addVehicle(scanner);
                        break;
                    case DELETE_VEHICLE:
                        vehicleManage.deleteVehicle(scanner);
                        break;
                    case SHOW_VEHICLE:
                        vehicleManage.showVehicles();
                        break;
                    case SEACH_VEHICLE:
                        vehicleManage.searchVehicle(scanner);
                        break;
                    case WRITE_FILE:
                        WriteReadFile.writeFile(vehicleManage, scanner);
                        break;
                    case IMPORT_FILE:
                        WriteReadFile.importFile(vehicleManage, scanner);
                        break;
                    case EXIT:
                        System.exit(0);

                }

            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}