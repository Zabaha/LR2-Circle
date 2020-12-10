package Circle;

public class testCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2, 4, 5);
        c1.setX(10);
        c1.setY(16);
        c1.setRadius(2);
        System.out.println(c1);
        System.out.println("Периметр: " + c2.getP());
        System.out.println("Площадь: " + c2.getS());
        c2.setRadius(10);
        System.out.println("Новый радиус: " + c2.getRadius());

    }
}
