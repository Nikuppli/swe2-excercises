package ch.juventus.javadoc;

import java.util.List;

public class MathUtils {
    /**
     *
     * @param numbers
     * @return sum
     */
    public double addition (List<Double> numbers){
            double sum = 0;
            for (Double num : numbers){
                sum += num;
            }
            return sum;
        }

    public double add(double a, double b) {
        return a + b;
    }


    public double subtraction(double a, double b) {
        return a - b;
    }


    public double division(double a, double b) {
        return a / b;
    }


    public double multiplication(double a, double b) {
        return a * b;
    }

}
