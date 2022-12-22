public class Start {
    public static void main(String[] args) {
        Shape circle = new Shape(5.8);
        Shape square = new Shape( 4, 8.9);
        Shape rectangle = new Shape(4, 10.5,12.5);
        Shape triangle = new Shape(2.3, 1.4, 2.3);
    String circleDetails = circle.getShapeDetails();
    String squareDetails = square.getShapeDetails();
    String rectangleDetails = rectangle.getShapeDetails();
    String triangleDetails = triangle.getShapeDetails();
    System.out.println("This shape name and number of edges are: " + circleDetails);
    System.out.println("This shape name and number of edges are: " + squareDetails);
    System.out.println("This shape name and number of edges are: " + rectangleDetails);
    System.out.println("This shape name and number of edges are: " + triangleDetails);
    }
}
