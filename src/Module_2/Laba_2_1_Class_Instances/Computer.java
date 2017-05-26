package Module_2.Laba_2_1_Class_Instances;
/**
 * Created by Serg_Smile on 01.04.2017.
 */
public class Computer {
    private String manufactured;
    private int serialNumber;
    private float price;
    private int quantituCPU;
    private int freguency;

    public String getManufactured() {
        return manufactured;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantituCPU() {
        return quantituCPU;
    }

    public int getFreguency() {
        return freguency;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantituCPU(int quantituCPU) {
        this.quantituCPU = quantituCPU;
    }

    public void setFreguency(int freguency) { this.freguency = freguency; }

    public void view(){
        System.out.print(getManufactured());
        System.out.print("\t| SN"+getSerialNumber());
        System.out.printf("\t| Price: $%4.2f",getPrice());
        System.out.print("\t| QuantityCPU: "+getQuantituCPU());
        System.out.println("\t| Fraquency: "+getFreguency()+" Mhz");
    }
}
