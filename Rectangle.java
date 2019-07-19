package Student;

public class Rectangle {
        public Rectangle() {
        }
        public int getArea ( int length, int breadth){
            return length * breadth;
        }
        public int getPerimeter ( int leng, int bred ){
            return 2 * (leng + bred);
        }
        public static void main (String[]args){
            Rectangle a = new Rectangle();
            Rectangle b = new Rectangle();

            System.out.println("Area : " + a.getArea(4,5) + " Perimeter is " + a.getPerimeter(4,5));
            System.out.println("Area : " + b.getArea(5,8) + " Perimeter is " + b.getPerimeter(5,8));
        }
    }









