package Models;

// import Exceptions.DivisionByZero;

public class DivisionModel extends CommonModel {

    @Override
    public Double result() /*throws DivisionByZero*/ {
        // if (y == 0)
        //     throw new DivisionByZero("Division by zero is not allowed");
        return x / y;
    }

    @Override
    public void setX(Double value) {
        super.x = value;
    }

    @Override
    public void setY(Double value) {
        super.y = value;
    }

}
