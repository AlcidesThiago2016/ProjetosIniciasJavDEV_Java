package Rectangle.entities;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return  2 * (width + width);
    }

    public double diagonal(){
        return  Math.sqrt(width * width + height * height);
    }
}
