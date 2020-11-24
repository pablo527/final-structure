package co.edu.unaula.DataStructure.recursive;

public class RecursiveFact {
    private double Factorial;
    private final int MINUSONE = -1;
    private final int ONE = 1;
    private final int ZERO = 0;


    public RecursiveFact(){
        Factorial = 0;
    }

    public double calcFactRecur(int number){

        if(validate(number)){
            return MINUSONE;
        }
        if (number == ZERO){
            return ONE;
        }
        Factorial = number * (calcFactRecur(number -1));
        return Factorial;
    }

    private boolean validate(int Number){
        return (Number <0);
    }
}
