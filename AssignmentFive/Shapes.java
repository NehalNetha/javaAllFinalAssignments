
interface Volume {
    double calculateVolume();
}

abstract class Shapes {

    void showShape(String shape){
        System.out.println("the shape is "+ shape);
    }

    abstract double calculateShape();

    abstract double calculatePerimeter();
}


class Circle extends Shapes{
   private double radius;

   Circle(double radius){
       this.radius = radius;
   }
   @Override
   double calculateShape(){
       return Math.PI * radius * radius;
   }

   @Override
   double calculatePerimeter(){
       return 2 * Math.PI * radius;
   }
}

class Rectangle extends Shapes{
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override 
    double calculateShape(){
        return length * width;
    }

    @Override
    double calculatePerimeter() {
       return 2 * (length + width);
    }
}

class Sphere extends Shapes implements Volume{
    private double radius;

    Sphere(double radius){
        this.radius = radius;
    }

    @Override
    double calculateShape(){
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter(){
        return 0;
    }

    @Override
    public double calculateVolume(){
        return (4 / 3) * Math.PI * radius * radius * radius;
    } 
}

class Cylinder extends Shapes implements Volume{
    private double radius;
    private double height;

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateShape(){
        return 2 * Math.PI * radius * height;
    }

    @Override
    double calculatePerimeter(){
        return 0;
    }

    @Override
    public double calculateVolume(){
        return Math.PI * radius * radius * height;
    }
}

class Pyramid extends Shapes implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    // Constructor
    Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    double calculateShape() {
        return (baseLength * baseWidth) / 2;
    }

    @Override
    double calculatePerimeter() {
        // Perimeter is not applicable for a pyramid
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (baseLength * baseWidth * height) / 3;
    }
}