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
  /*
    public double subtraction (List<Double> numbers){
        double dif = 0;
        for (Double num : numbers){
            dif -= num;
        }
        return dif;
    }
    public double multiplication (List<Double> numbers){
        double mul;
        for (Double num : numbers){
            num *= num;
        }
        return mul;
    }

        /*
        public double division (double a, double b){

        }
*/

}
