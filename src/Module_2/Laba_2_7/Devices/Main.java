package Module_2.Laba_2_7.Devices;

/**
 * Created by Serg_Smile on 23.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Device devices [] = {new Monitor(800, 600),
                new Device("Dell", "cq203944", 329.32f),
                new EthernetAdapter(100, "12-23-53-23-32-34")};
        for (Device device : devices) System.out.println(device);
        System.out.println(devices[0].equals(devices[1]));
        System.out.println(devices[1].equals(devices[2]));
        System.out.println(devices[0].equals(devices[2]));
    }
}
