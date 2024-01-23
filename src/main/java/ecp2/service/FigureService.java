package ecp2.service;

import ecp2.model.Figure;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class FigureService {
    private final RepositoryService repositoryService;

   public void addFigure(Figure figure){
       repositoryService.ofRepository(figure).addFigure(figure);
   }

   public List<Figure> findFigureBySquare(Double min, double max){
       List<Figure> result = new ArrayList<>();
       repositoryService.getRepositories().stream().map(r -> result.addAll(r.findBySquare(min, max)))
               .collect(Collectors.toList());
       return result;
   }

}