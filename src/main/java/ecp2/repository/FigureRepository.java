package ecp2.repository;

import ecp2.model.Figure;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class FigureRepository<T extends Figure> {
    private final List<T> storage = new ArrayList<>();

    public List<T> findAll() {
        return storage;
    }

    public List<T> findByName(String name) {
        var result = storage.stream()
                .filter(f -> f.getName().equals(name))
                .collect(Collectors.toList());
//        if (result.size() == 0)
//            throw new NotFoundException();
        return result;
    }

    public List<T> findByPerimeter(Double max, Double min) { // todo: MATH.MAX()
        var result = storage.stream()
                .filter(f -> f.getPerimeter() >= min && f.getPerimeter() <= max)
                .collect(Collectors.toList());
//        if (result.size() == 0)
//            throw new NotFoundException();
        return result;
    }

    public List<T> findBySquare(Double min, Double max) {
        var result = storage.stream()
                .filter(f -> f.getSquare() >= min && f.getSquare() <= max)
                .collect(Collectors.toList());
//        if (result.size() == 0)
//            throw new NotFoundException();
        return result;
    }

    public boolean addFigure(Figure figure) {
        return storage.add((T) figure);
    }


}