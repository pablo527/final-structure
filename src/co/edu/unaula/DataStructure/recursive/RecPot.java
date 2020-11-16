package co.edu.unaula.DataStructure.recursive;

public class RecPot {

    private double exponent;
    private double result;
    private final double UNO = 1;
    private final double CERO = 0;
    private final double MENOSUNO = -1;

    public RecPot(){
        exponent = MENOSUNO;
        result = CERO;
    }

    public double calcRecurExpo(double exponent, double base){
        if(exponent < CERO){
            System.out.println("El exponente es incorrecto");
            return MENOSUNO;
        }

        if(exponent == CERO){
            return UNO;
        }
        result = base * calcRecurExpo(exponent - UNO, base);
        return result;
    }
}
