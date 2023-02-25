import java.util.Scanner;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Ellipse");
        System.out.println("Pick your choice : ");
        int pilihan = input.nextInt();
        
        if (pilihan == 1){
            System.out.println("Input LengthOfSide : ");
            Square persegi = new Square();
            persegi.LengthOfSide = input.nextInt();
            System.out.println("The Area of the Square is : " + persegi.CalculateArea() + " Cm2");
            System.out.println("The Perimeter of the Square is: " + persegi.CalculatePerimeter() + " Cm2");
            persegi.CalculateArea();
            persegi.CalculatePerimeter();          
        }
        else if (pilihan==2){
            Rectangle PersegiPanjang = new Rectangle();
            System.out.println("Input Length : ");
            PersegiPanjang.length = input.nextDouble();
            System.out.println("Input Width : ");
            PersegiPanjang.width = input.nextDouble();
            System.out.println("The Area of the Rectangle is : " + PersegiPanjang.CalculateArea() + " Cm2");
            System.out.println("The Perimeter of the Square is: " + PersegiPanjang.CalculatePerimeter() + " Cm2");
            PersegiPanjang.CalculateArea();
            PersegiPanjang.CalculatePerimeter();
        }
        else if (pilihan==3){
            System.out.println("Input Radius : ");
            Circle lingkaran = new Circle();
            lingkaran.radius = input.nextDouble();
            System.out.println("The Area of the Circle is : " +lingkaran.CalculateAre()+" Cm2");
            System.out.println("The Perimeter of the Circle is : "+lingkaran.CalculatePerimeter()+" Cm2");
            lingkaran.CalculateAre();
            lingkaran.CalculatePerimeter();
        }
        else if (pilihan==4){
            Ellipse elips = new Ellipse();
            System.out.println("Input Semi Major Axis : ");
            elips.SemiMajorAxis = input.nextDouble();
            System.out.println("Input Semi Minor Axis : ");
            elips.SemiMinorAxis = input.nextDouble();
            System.out.println("The Area of the Ellipse is : " +elips.CalculateArea()+" Cm2");
            System.out.println("The Perimeter of the Ellipse is : "+elips.CalculatePerimeter()+" Cm2");
            elips.CalculateArea();
            elips.CalculatePerimeter();
        }
        else{
            System.out.println("Not Found!");
        }
        
        
        
        
        
        

    }
    
}
