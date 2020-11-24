package co.edu.unaula.DataStructure.recursive;

public class RecPot {

    private double exponent;
    private double result;
    private final double ONE = 1;
    private final double ZERO = 0;
    private final double MINUSONE = -1;

    public RecPot(){
        exponent = MINUSONE;
        result = ZERO;
    }

    public double calcRecurExpo(double exponent, double base){
        if(exponent < ZERO){
            return MINUSONE;
        }

        if(exponent == ZERO){
            return ONE;
        }
        result = base * calcRecurExpo(exponent - ONE, base);
        return result;
    }
}
