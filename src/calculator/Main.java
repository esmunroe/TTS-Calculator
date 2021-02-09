package calculator;

public class Main {
    public static void main(String[] args) {
        MagicCalculator calc = new MagicCalculator();

        final int firstNum = 1;
        final int secondNum = 2;
        final int magicNum = 5;

        System.out.printf("Using '1' and '2' as values for the basic calculator...\nAdd: %d\nSubtract: %d\nMultiply: %d\nDivide: %d\n",
                calc.add(firstNum, secondNum), calc.subtract(firstNum, secondNum), calc.multiply(firstNum, secondNum), calc.divide(firstNum, secondNum));
        System.out.printf("Using '5' as a value for the magic calculator...\nSquare Root: %f\nSin: %f\nCosine: %f\nTangent: %f\nFactorial: %f\n",
                calc.squareRoot(magicNum), calc.sin(magicNum), calc.cosine(magicNum), calc.tangent(magicNum), calc.factorial(magicNum));
    }
}
