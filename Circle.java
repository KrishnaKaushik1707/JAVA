public class Circle extends Shape {

    double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    double totalArea()
    {
        return Math.PI*radius*radius;
    }
}