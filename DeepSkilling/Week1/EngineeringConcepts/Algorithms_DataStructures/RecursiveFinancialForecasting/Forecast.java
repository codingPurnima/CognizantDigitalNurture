public class Forecast {

    public static double predict(double value, double rate, int years) {

        if (years == 0)
            return value;

        return predict(value, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double result = predict(1000, 0.1, 5);
        System.out.println("Future Value: " + result);
    }
}