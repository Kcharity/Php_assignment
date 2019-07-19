package Student;


public class Triangle {

    public Triangle(){}

    public static void main(String[] args) {
        Calc tr = new Calc();
        tr.area=0.5*tr.a*tr.b;
        tr.per=tr.a+tr.b+tr.c;

        System.out.println("The area is "+tr.area+" and the perimeter is "+tr.per);
    }

}

