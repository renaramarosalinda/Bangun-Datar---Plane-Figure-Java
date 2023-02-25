public class Ellipse {
//Deklarasi atribut
    public double SemiMajorAxis;
    public double SemiMinorAxis;
    double phi = 3.14;
//Deklarasi Method
    public double CalculateArea(){
        double area;
        area = phi*this.SemiMajorAxis*this.SemiMinorAxis;
        return area;
    }
    public double CalculatePerimeter(){
        double perimeter;
        perimeter = 2*phi*Math.sqrt(((Math.pow(this.SemiMajorAxis,2))+(Math.pow(this.SemiMinorAxis,2)))/2);
        return perimeter;
    }
}
