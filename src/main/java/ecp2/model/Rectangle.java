package ecp2.model;


import ecp2.exception.WrongSideSizeException;
import lombok.Data;

@Data
public class Rectangle extends Figure {

    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        super("Rectangle", calcSquare(length, width), calcPerimeter(length, width));
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calcPerimeter() {
        return calcPerimeter(length, width);
    }

    public static Double calcPerimeter(Double length, Double width) {
        if (length == null || width == null)
            throw new WrongSideSizeException();
        return 2 * (length + width);
    }

    @Override
    public Double calcSquare() {
        return calcSquare(length, width);
    }

    public static Double calcSquare(Double length, Double width) {
        if (length == null || width == null)
            throw new WrongSideSizeException();
        return length * width;
    }

    public Double findMaxSide(){
        return Math.max(this.length, this.width);
    }

}