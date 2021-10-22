package Bahast;

public class EscapExamples {
    private String name;
    private String DriverIdNum;
    private String DOB;
    static int count=999;
    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void setDriverIdNum(String driverIdNum){
        this.DriverIdNum=DriverIdNum;
    }

    public void setDriverIdNum(){
        this.DriverIdNum=DriverIdNum;


    }

    public void getDriverIdNum(){
        count++;
        DriverIdNum=""+count;
        System.out.println(DriverIdNum);
    }
    public void setDOB(String setDOB){
        DOB=setDOB;

    }
    public void SetCustomerInfo(String name,String DOB){
        this.name=name;
        this.DOB=DOB;

    }
    public String getInfo(){
        return "This is "+name+ "With DOB of "+DOB;
    }
    static class EncapObject{
        public static void main(String[] args) {
            EscapExamples person1=new EscapExamples();
            person1.setName("recep");
            System.out.println(person1.getName());
            person1.getDriverIdNum();
            person1.setDOB("5/5/94");
            //System.out.println(person1.);

            EscapExamples person2=new EscapExamples();
            person2.setName("Baha Blast");
            System.out.println(person2.getName());
            person2.getDriverIdNum();

            EscapExamples person3=new EscapExamples();
            person3.SetCustomerInfo("Firas","5/7/1998");

        }
    }

}
