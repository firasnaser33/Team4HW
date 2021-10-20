package Firas.Abstract_HW;

import Firas.Abstract_HW.Iphone;

public class PhoneObject {

    public static void main(String[] args) {
        Iphone obj=new Iphone();
        obj.ios("firas"," x model", 799.99,6.9);
        obj.texting();
        obj.calling();
        System.out.println(obj.toString());

        System.out.println("--------------------*");

        Iphone obj1=new Iphone();
        obj1.ios("Recep"," model pro 11", 899.99,9.9);
        obj1.texting();
        obj1.calling();
        System.out.println(obj1.toString());

        System.out.println("**************");

        Samsung phone=new Samsung();
        phone.android("Tre ", "Galaxy S21", 999.99, 6.9);
        phone.texting();
        phone.calling();
        System.out.println(phone.toString());

        System.out.println("**************");

        Iphone iphone=new Iphone();
        iphone.ios("bahaBlast ", "model 5", 199.99, 4.9);
        iphone.texting();
        iphone.calling();
        System.out.println(iphone.toString());
    }
}
