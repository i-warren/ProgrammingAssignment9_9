public class RegularPolygonTest {
    public static void main(String[] args) {


        // Construct a regular polygon using default constructor
        RegularPolygon polygon1 = new RegularPolygon();

        // Print statements about Polygon 1
        System.out.println("Polygon 1");
        System.out.println(polygon1);

        // Construct a regular polygon using two arguments
        RegularPolygon polygon2 = new RegularPolygon(6, 4);

        // Print statements about Polygon 2 using toString
        System.out.println("Polygon 2");
        System.out.println(polygon2);

        // Construct a regular polygon using four arguments
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Print statements about Polygon 3
        System.out.println("Polygon 3");
        System.out.println(polygon3);

        // Test set methods on Polygon 3
        System.out.println("Changing Polygon 3 \n");
        polygon3.setNumberOfSides(12);
        polygon3.setLengthOfSide(5.5);
        polygon3.setXPos(9.9);
        polygon3.setYPos(42.0);
        System.out.println(polygon3);


    }
}
