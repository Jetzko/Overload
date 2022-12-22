public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
       this.shapeName = shapeName;
        System.out.println(shapeName + " is created!");
    }

    public  Shape(double radius){
       this.shapeName = "Circle";
        System.out.println(shapeName + " is created!");
    }
    public  Shape(int edges, double edgeLength){
        this.shapeName = "Square";
        this.numberOfEdges = edges;
        System.out.println(shapeName + " is created!");
    }
    public Shape(int edges, double e1, double e2){
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
        System.out.println(shapeName + " is created!");
    }
    public Shape(double e1, double e2, double e3){
        this.shapeName = "Triangle";
        int numberOfEdges = 3;
        System.out.println(shapeName + " is created!");

    }
    public String getShapeDetails(){
        this.shapeName = shapeName;
        this.numberOfEdges = numberOfEdges;
        return shapeName + " " + numberOfEdges;
    }
}

