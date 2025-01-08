
public class AbsShape
{
    public static void main(String[] args) {
        
        Shape cir = new Circle(6.0);
        System.out.print("Total Area of circle: ");
        System.out.println(cir.totalArea());

        Shape rec = new Rectangle(5.0,4.0 );
        System.out.print("Total Area of rectangle: ");
        System.out.println(rec.totalArea());
    }
}