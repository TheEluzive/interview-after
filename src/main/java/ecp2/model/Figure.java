package ecp2.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Figure implements Mathematicable {
    private String name;
    private Double square;
    private Double perimeter;
}