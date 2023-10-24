public class Rectangle {
       public double width;
       public double height;

       public double Area() {
              double result;
              return result = width * height;
       }

       public double Perimeter() {
              double P;
              return P = 2 * (width + height);
       }

       public double Diagonal() {
              double D = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
              return D;
       }
}
