package HWwithTeam;

public class Device_oct7HW {
    //  Task Device:
//        creata a class called device:
//                attributes: brand, model, price, country
//                methods: toString
//
    String brand;
    String model;
    double price;
    String country;

    public void setDeviceInfo(String brand, String model, double price, String country){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.country=country;
    }
    public String toString(){
        return brand+" \n " + model +" \n " + price +" \n " + country;
    }

    static class deviceObject{
        public static void main(String[] args) {
            Device_oct7HW device1=new Device_oct7HW();
            device1.setDeviceInfo(" Samsung ", " S21 ", 999.33," Korea ");
            System.out.println("device1 = " + device1.toString());
        }
    }


}
