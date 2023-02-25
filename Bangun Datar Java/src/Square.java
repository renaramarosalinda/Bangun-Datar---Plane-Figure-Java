public class Square {
    //Deklarasi atribut
    public int LengthOfSide;
    //Deklarasi method
    public double CalculateArea(){
        double area;
        area = this.LengthOfSide * this.LengthOfSide;
        return area;
    }
    public double CalculatePerimeter(){
        double perimeter;
        perimeter = this.LengthOfSide * 4;
        return perimeter;
    }
}
