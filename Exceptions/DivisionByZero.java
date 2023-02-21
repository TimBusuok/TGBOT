package Exceptions;

public class DivisionByZero extends MathExceptions{

    /**
     * Конструктор исключения деления на ноль
     * @param msg - текстовое сообщение для пользователя
     */
    public DivisionByZero(String msg) {
        super(msg);
    }
}