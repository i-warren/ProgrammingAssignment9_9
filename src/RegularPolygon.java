public class RegularPolygon {

    private int n = 3;              // num sides
    private double side = 1;        // length of side
    private double x = 0;           // x-coordinate
    private double y = 0;           // y-coordinate


    // construct a regular polygon
    RegularPolygon() {

    }

    RegularPolygon(int numSides, double lengthSide) {
        n = numSides;
        side = lengthSide;
    }

    RegularPolygon(int numSides, double lengthSide, double xPosition, double yPosition) {
        n = numSides;
        side = lengthSide;
        x = xPosition;
        y = yPosition;
    }

    //  number of sides
    public int getNumberOfSides(){
        return n;
    }

    // return length of side
    public double getLengthOfSide() {
        return side;
    }

    // return x-position
    public double getX() {
        return x;
    }

    // return y-position
    public double getY() {
        return y;
    }

    // set number of sides
    public void setNumberOfSides(int numberOfSides){
        n = numberOfSides;
    }

    // set length of side
    public void setLengthOfSide(double lengthOfSide) {
        side = lengthOfSide;
    }

    // set x-position
    public void setXPos(double xPosition) {
        x = xPosition;
    }

    // set y-position
    public void setYPos(double yPosition) {
        y = yPosition;
    }

    // return perimeter or regular polygon
    public double getPerimeter() {
        return side * n;
    }

    // return area of regular polygon
    public double getArea() {
        return (n * side * side) / (4 * (Math.tan(Math.PI / n)));
    }

    public String toString() {
        return "Number of Sides: " + n + "\n" +
                "Length of Sides: " + side + "\n" +
                "Perimeter: " + this.getPerimeter() + "\n" +
                "Area: " + this.getArea() + "\n" +
                "Coordinates: " + this.getX() + "," +
                this.getY() + "\n";
    }
}
