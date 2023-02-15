package Presenter;

import Models.CommonModel;
import Models.DivisionModel;
import Models.MultiplationModel;
import Models.SubtractionModel;
import Models.SumModel;
import View.UI;
import Logging.Log;

public class Presenter<T extends CommonModel> {
    UI v;
    T model;

    public Presenter(UI v, T model) {
        this.model = model;
        this.v = v;
    }

    public void runOperation() {
        Log log = new Log();
        String txt = "";
        Double x = v.inputDouble.apply("Input first number: ");
        Double y = v.inputDouble.apply("Input second number: ");
        int choice = v.getChoice();
        switch (choice) {
            case 1: {
                SumModel model = new SumModel();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 2: {
                SubtractionModel model = new SubtractionModel();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 3: {
                MultiplationModel model = new MultiplationModel();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 4: {
                DivisionModel model = new DivisionModel();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
        }
        log.writeFile(txt, "Logging\\Saving.txt");
    }

}
