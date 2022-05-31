public class BmiService {

    public double calculate(double mass , double height ){
        double result = mass / Math.pow(height, 2);
        return result;
    }
}
