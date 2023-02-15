package View;

import Models.CommonModel;
import Presenter.Presenter;

public class Program {

    public static void main(String[] args) {

        Presenter presenter = new Presenter(new UI(), new CommonModel());

        presenter.runOperation();

    }
}
