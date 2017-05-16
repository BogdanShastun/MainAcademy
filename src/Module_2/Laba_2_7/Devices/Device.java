package Module_2.Laba_2_7.Devices;

/**
 * Created by Serg_Smile on 23.04.2017.
 */
public class Device {
    private String manufacturer, serialNumber, className = this.getClass().getSimpleName();
    private float price;

    public Device(String manufacturer, String serialNumber, float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getClassName() {
        return className;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return className + ": manufactures = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber;
    }

    @Override
    public int hashCode() {
        int result = manufacturer!=null ? manufacturer.hashCode() : 0;
        result = 31 * result + serialNumber!=null ? serialNumber.hashCode() : 0;
        result = 31 * result + (int) price;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;
        if (!serialNumber.equals(device.serialNumber)) return false;

        return true;
    }
}
