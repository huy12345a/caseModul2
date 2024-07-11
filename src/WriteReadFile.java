import java.io.*;
import java.util.List;
import java.util.Scanner;

public class WriteReadFile {
    private static final String FILE_PATH = "src\\file\\myfile.bin";
    private static final File MY_FILE = new File(FILE_PATH);

    public static void writeFile(VehicleManage vehicleManage, Scanner scanner) throws Exception {
        try {
            FileOutputStream fos = new FileOutputStream(MY_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(vehicleManage.getVehicles());

            oos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void importFile(VehicleManage vehicleManage, Scanner scanner) throws IOException {
        try {
            System.out.println("nhap vao file muon luu : ");
            String filename = scanner.nextLine();
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Vehicle> vehiclesList = (List<Vehicle>) ois.readObject();

            for (Vehicle vehicle : vehiclesList) {
                vehicleManage.addVehicle(vehicle);
            }

            vehicleManage.setVehicles(vehiclesList);

            fis.close();
            ois.close();


            FileOutputStream fos = new FileOutputStream(MY_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(vehicleManage.getVehicles());

            oos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
