package Module_2.Laba_2_7.Devices;

import Module_2.Laba_2_7.Devices.Device;

/**
 * Created by Serg_Smile on 23.04.2017.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        super("RealTeck", "b0032ck", 14.21f);
        this.speed = speed;
        this.mac = mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString(){
        //super.setClassName(this.getClass().getSimpleName());
        return super.toString() + ", speed = " + speed + ", mac = " + mac;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + mac.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;

        EthernetAdapter adapter = (EthernetAdapter) o;

        if (speed != adapter.speed) return false;
        if (mac.equals(adapter.mac)) return false;

        return true;
    }
}
