package Student;

public class Studenttwo{
    String name;
    int roll_no;
    int phone_no;
    String address;



    public static void main(String[] args){
        Studenttwo p = new Studenttwo ();
        Studenttwo d = new Studenttwo ();


        p.name = "John";
        p.roll_no = 2;
        p.phone_no = 07212;
        p.address = "456";


        System.out.println(p.name+" "+p.roll_no+" "+p.phone_no+" "+p.address);

        p.name = "sam";
        p.roll_no = 3;
        p.phone_no = 07214;
        p.address = "456";

        System.out.println(p.name+" "+p.roll_no+" "+p.phone_no+" "+p.address);



    }
}













