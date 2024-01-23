package ecp2.service;

import ecp2.model.Circle;
import ecp2.model.Figure;
import ecp2.model.Rectangle;
import ecp2.repository.CircleRepository;
import ecp2.repository.FigureRepository;
import ecp2.repository.RectangleRepository;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RepositoryService {

    private List<FigureRepository> repositories = new ArrayList<>();


    private final RectangleRepository rectangleRepository = new RectangleRepository();
    private final CircleRepository circleRepository = new CircleRepository();
    private final FigureRepository<Figure> defaultRepository = new FigureRepository<>();

    public RepositoryService() {
        this.repositories.add(rectangleRepository);
        this.repositories.add(circleRepository);
        this.repositories.add(defaultRepository);
    }

    public FigureRepository<? extends Figure> ofRepository(Figure figure) {

        if (figure instanceof Rectangle)
            return rectangleRepository;

        if (figure instanceof Circle)
            return circleRepository;

        return defaultRepository;
    }
}