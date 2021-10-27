package basozdv.Abstract_HW;
import Firas.Abstract_HW.Phone;
import sun.security.ec.point.ImmutablePoint;

public class Iphone extends Phone {

    public static String brandName;
    public String model;
    double price;
    double size;
    String personName;


    static  { brandName= "Iphone";
        System.out.println("this is "+brandName );
    }
    @Override
    public void calling() {
        System.out.println(personName+" calling from "+ brandName +model);
    }

    @Override
    public void texting() {
        System.out.println(personName+"Texting from "+ brandName+model);
    }

    public void ios(String personName, String model, double price , double size){
        this.model=model;
        this.price=price;
        this.size=size;
        this.personName=personName;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
/* create an abstract class called Phone
        attributes: brand, model, price, size*/

   /* create sub classes called iphone and samsung
        --create a static block to assign brand at begining for iphone and samsung
        --create a constructor to assign model , prize and size for iphone and samsung
        --override abstract methods from parent Phone class*/
