abstract class Shape{
    String color;

    abstract double area();
    public abstract String toString();
    Shape(String color){
        System.out.println("super constructor called");
        this.color = color;
    }

    String getColor(){
        return color;
    }
}

class Circle extends Shape{
    double radius;
    Circle(String color,double radius){
        super(color);
        System.out.println("sub constructor colled");
        this.radius = radius;
    }

    double area(){
        return Math.PI*Math.pow(radius, 2);
    }

    public String toString(){
        return "color of circle is "+super.getColor()+" and area is "+area();
    }
}


public class AbstractionExample {
    public static void main(String[] args) {
        Circle obj = new Circle("Black",5.6);
        System.out.println(obj.toString());
    }
    
}
