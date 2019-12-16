public class MathApplication {
    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double add(double a, double b){
        return calculatorService.add(a,b);
        }

    public double subtract(double a, double b){
        return calculatorService.subtract(a,b);
    }

    public double multiply(double input1, double input2){
        return calculatorService.multiply(input1, input2);
    }

    public double divide(double input1, double input2){
        return calculatorService.divide(input1, input2);
    }
}
