package Module_2.Laba_2_1_Class_Instances;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
	    Computer [] computer = new Computer[5];
        Random rnd = new Random();
        int temp=1;
        for (int i = 0; i < 5; i++, temp*=2) {
            computer [i] = new Computer();
            computer [i].setManufactured("Procesor"+(i+1));
            computer[i].setSerialNumber((rnd.nextInt(3998)+(i+1)*1000));
            computer [i].setPrice(temp*((temp+22)*8.834F));
            computer [i].setQuantituCPU(temp);
            computer[i].setFreguency((int)(1333*Math.sqrt(temp)));
            computer[i].view();
            computer [i].setPrice((computer[i].getPrice())*1.1f);
        }
        System.out.println("Objects after price encrease:");
        for (int i = 0; i < 5; i++) computer[i].view();
    }
}
