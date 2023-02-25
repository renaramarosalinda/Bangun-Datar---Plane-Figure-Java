public class Circle {
//    Deklarasi atribut
    public double phi = 3.14;
    public double radius;
    
//    Deklarasi Method
public double CalculateAre(){
    double  area;
    area = phi*this.radius*this.radius;
    return area;
}
public double CalculatePerimeter(){
    double Circumference;
    Circumference = 2*phi*this.radius;
    return Circumference;
}

}
