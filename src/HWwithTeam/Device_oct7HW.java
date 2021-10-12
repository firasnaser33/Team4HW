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
        return brand+"/" + model +"/" + price +"/" + country;
    }

    static class deviceObject{
        public static void main(String[] args) {
            Device_oct7HW device1=new Device_oct7HW();
            device1.setDeviceInfo(" Samsung ", " S21 ", 999.33," Korea ");
            System.out.println("device1 = " + device1.toString());
            tv tv1= new tv();
            tv1.setTvInfo("Sony","XxxTension",999.99,"Japan");
            System.out.println("tv1.watch() = " + tv1.watch());
            System.out.println("tv1.toString() = " + tv1.toString());
        }
    }
    //        create a class called TV:
//                attributes: brand, model, price, country
//                methods: watch, toString
   static class tv{


        String brand;
        String model;
        double price;
        String country;

        public void setTvInfo(String brand, String model, double price, String country) {
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.country = country;

        }

        public String toString() {
            return brand + "/" + model + "/" + price + "/" + country;
        }

        public String watch(){
            return "I am watching Squid games on my brand new " + brand+model;
        }

    }


}
