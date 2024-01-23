package ecp2.controller;

import ecp2.model.Rectangle;
import ecp2.service.FigureService;
import ecp2.service.RepositoryService;


public class Controller {

    public static void main(String[] args) {
        FigureService figureService = new FigureService(new RepositoryService());
        figureService.addFigure(new Rectangle(5.0, 5.0));
        figureService.addFigure(new Rectangle(1.0, 2.0));
        var result = figureService.findFigureBySquare(1.0, 2.0);
        System.out.println(result);
    }
}