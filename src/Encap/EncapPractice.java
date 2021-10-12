package Encap;

public class EncapPractice {

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

    public void setDriverIdNum(){
        this.DriverIdNum=DriverIdNum;
    }

    public void getDriverIdNum(){
        DriverIdNum=""+count;
        System.out.println(DriverIdNum);
        count++;
    }

    public void setDOB(String setDob){
        DOB=setDob;
    }
    public String getDob(){
        return DOB;
    }

    public void SetCustomerInfo(String name, String DOB){
        this.name=name;
        this.DOB=DOB;
    }
    public String getInfo(){

        return "This is "+name +"\n DOB: "+ DOB+" \n  ID: "+count;
    }

    static class EncapObject{
        public static void main(String[] args) {
            EncapPractice person1=new EncapPractice();
            person1.setName("Recep");
            System.out.println(person1.getName());
            person1.getDriverIdNum();
            person1.setDOB("5/5/94");
            System.out.println(person1.getDob());

            EncapPractice perso2=new EncapPractice();
            perso2.setName("BAhA BLAST");
            System.out.println(perso2.getName());
            perso2.getDriverIdNum();

            EncapPractice person3=new EncapPractice();
            person3.SetCustomerInfo("Firas ", "1/1/1980");
            System.out.println(person3.getInfo());
        }
    }
}
