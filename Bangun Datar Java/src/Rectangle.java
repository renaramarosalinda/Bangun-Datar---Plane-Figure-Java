public class Rectangle{
//    Deklarasi atribut
    public double width;
    public double length;
//    Deklarasi Method
    public double CalculateArea(){
        double area;
        area = this.length*this.width;
        return area;
}
    public double CalculatePerimeter(){
        double perimeter;
        perimeter = 2*this.length*this.width;
        return perimeter;         
    }
}
