package ecp2.repository;

import ecp2.exception.NotFoundException;
import ecp2.model.Rectangle;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RectangleRepository extends FigureRepository<Rectangle> {
    public Rectangle findBySide(Double min, Double max){
        return  findAll().stream()
                .filter(s -> s.findMaxSide() >= min && s.findMaxSide() <= max)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}