package basozdv.Abstract_HW;

import Firas.Abstract_HW.Phone;


    public class Samsung extends Phone {
        public static String brandName;
        public String model;
        double price;
        double size;
        String personName;


        static {
            brandName = "Samsung";
            System.out.println("This is " + brandName);
        }

        @Override
        public void calling() {
            System.out.println(personName + " calling from " + brandName + model);
        }

        @Override
        public void texting() {
            System.out.println(personName + "Texting from " + brandName + model);
        }

        public void android(String personName, String model, double price, double size) {
            this.model = model;
            this.price = price;
            this.size = size;
            this.personName = personName;
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


