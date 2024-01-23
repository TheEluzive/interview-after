package ecp2.model;

import lombok.Data;

@Data
public class Circle extends Figure{
    private Double radius;

    public Circle(Double radius) {
        super("Circle", calcSquare(radius), calcPerimeter(radius));
        this.radius = radius;
    }

    @Override
    public Double calcPerimeter() {
        return calcPerimeter(radius);
    }

    public static Double calcPerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    @Override
    public Double calcSquare() {
        return calcSquare(radius);
    }

    public static Double calcSquare(Double radius){
        return  Math.PI * radius * radius;
    }

}