package Problem_1_c;

import java.util.HashSet;
import java.util.Scanner;

public class DeviceTester {
    public static void main(String[] args) {
        HashSet<Device> devices = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity smartphone");
        int numberSmarphone = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < numberSmarphone; i++) {

            System.out.println("Enter smartphone memory");
            int memory = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter smartphone dram");
            int ram = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter smartphone model:");
            String model = scanner.nextLine();

            System.out.println("Enter smartphone release year:");
            int disk = scanner.nextInt();
            scanner.nextLine();
            devices.add(new Device(memory, ram, model, disk));

        }
        for(Device device : devices) {
            System.out.println(device);
        }

    }
}
