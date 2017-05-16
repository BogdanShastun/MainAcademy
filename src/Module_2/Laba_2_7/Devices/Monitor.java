package Module_2.Laba_2_7.Devices;

import Module_2.Laba_2_7.Devices.Device;

import static sun.audio.AudioDevice.device;

/**
 * Created by Serg_Smile on 23.04.2017.
 */
public class Monitor extends Device {
    private int resolutionX, resolutionY;

    public Monitor(int resolutionX, int resolutionY) {
        super("Samsung", "cg22000", 234.21f);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString(){
        return super.toString()+ ", resolution X = "+resolutionX+ ", resolution Y = "+ resolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        if (resolutionY != monitor.resolutionY) return false;

        return true;
    }
}
