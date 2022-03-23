
class Area{
    double area;
    Area(int a){
        this.area = a*a;  // area of square;
        System.out.println("Area of square is: "+area);
    }

    Area(float a,float b){
        this.area = a*b; // area of rectangle;
        System.out.println("Area of rectangle is: "+area);
    }

    Area(float r){
        this.area = 3.14*r*r;       // area of circle;
        System.out.println("Area of circle is: "+area);
    }

    Area(int b,int h){
        this.area = (double)1/2*b*h;        // area of triangle;
        System.out.println("Area of triangle is: "+area);
    }

    Area(int h,int a,int b){
        this.area = (double)1/2*h*(a+b);    // area of trapezium;
        System.out.println("Area of trapezium is: "+area);
    }

    Area(double d1,double d2){
        this.area = (double)1/2*d1*d2;      // area of rombus;
        System.out.println("Area of rombus is: "+area);
    }

    Area(Area as){
        this.area = as.area;
        System.out.println(area);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Area square = new Area(5);
        Area rectangle = new Area(4,6.5f);
        Area circle = new Area(4.5f);
        Area triangle = new Area(5,6);
        Area trapezium = new Area(2,3,4);
        Area rombus = new Area(3.4,4);

        System.out.println("Area of Squara using copy constructor is:");
        Area cp = new Area(square);
        
    }
    
}
