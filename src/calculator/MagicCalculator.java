package calculator;

import java.lang.Math;

public class MagicCalculator extends Calculator{
    public double squareRoot(double num){
        return Math.sqrt(num);
    }

    public double sin(double num){
        return Math.sin(num);
    }

    public double cosine(double num) {
        return Math.cos(num);
    }

    public double tangent(double num){
        return Math.tan(num);
    }

    public double factorial(double num){
        double fact = 0;
        for (int i = 0; i < num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
