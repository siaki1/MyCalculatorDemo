package hbcu.stay.ready.ttime;

public class Calculator {
    private double memory;

    public Calculator() {
        memory = 0;
    }

    public Calculator(double memory) {
        this.memory = memory;
    }

    public double add(double x) {
        memory += x;
        return memory;
    }

    public double add(double x, double y) {
        return 0;
    }

    public double subtract(double x) {
        memory -= x;
        return memory;

    }

    public double subtract(double x, double y) {
        return 0;
    }

    public double multiply(double x) {
        memory *= x;
        return memory;

    }

    public double multiply(double x, double y) {
        return 0;

    }

    public double divide(double y) throws ArithmeticException {
       if(y == 0.0){
           throw new ArithmeticException();
       }
     memory = memory / y;
       return memory;
    }

    public double divide(double x, double y) {
        return 0;

    }

    public double square(double x) {
        memory *= memory;
        return memory;

    }

    public double square(double x, double y) {
        return 0;
    }

    public double squareRoot(double x) {
        memory = Math.sqrt(memory);
        return memory;

    }

    public double squareRoot(double x, double y) {
        return 0;
    }

    public double inverse(double x){
        memory = 1/x;
        return memory;
    }



}